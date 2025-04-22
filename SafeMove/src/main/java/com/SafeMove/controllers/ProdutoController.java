	package com.SafeMove.controllers;
	
	
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.validation.BindingResult;
	import org.springframework.validation.annotation.Validated;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.servlet.ModelAndView;
	import org.springframework.web.servlet.mvc.support.RedirectAttributes;
	
	import com.SafeMove.Repository.ProdutoRepository;
	import com.SafeMove.SafeMove.models.Produto;
	import java.util.List;
	
	@Controller
	@RequestMapping("/cadastrarProduto")
	public class ProdutoController {
	
	    private final ProdutoRepository pr;
	
	    public ProdutoController(ProdutoRepository pr) {
	        this.pr = pr;
	    }
	
	    @GetMapping
	    public String form(Model model) {
	        model.addAttribute("produto", new Produto());
	        return "produto/formProduto";
	    }
	
	    @PostMapping
	    public String form(@Validated Produto produto, BindingResult result, RedirectAttributes attributes) {//OK salvando arquivos 
	        if (result.hasErrors()) {
	            attributes.addFlashAttribute("mensagem", "Verifique os campos");
	            return "redirect:/cadastrarProduto";
	        }
	
	        pr.save(produto);
	        attributes.addFlashAttribute("mensagem", "Produto cadastrado com sucesso!");
	        return "redirect:/cadastrarProduto/listarProdutos";
	    }
	
	    @GetMapping("/listarProdutos")
	    public String listarProdutos(Model model) {
	        model.addAttribute("produtos", pr.findAll());
	        return "produto/listarProdutos";
	    }
	
	
	    //listar produtos
	    @GetMapping("/listagem") // Use @GetMapping para consistência com outros métodos de leitura
	    public ModelAndView listarProdutosListagem() {
	        ModelAndView mv = new ModelAndView("produto/listaProdutos");
	        Iterable<Produto> produtos = pr.findAll();
	        mv.addObject("listaDeProdutos", produtos);
	        return mv;
	    }
	
	    @GetMapping("/{codigo}")
	    public ModelAndView detalhesProduto(@PathVariable("codigo") Long codigo) {
	        ModelAndView mv = new ModelAndView("produto/detalhesProduto");
	        Produto produto = pr.findByCodigo(codigo);
	        mv.addObject("produto", produto); 
	        return mv;
	    }
	
	    
	}
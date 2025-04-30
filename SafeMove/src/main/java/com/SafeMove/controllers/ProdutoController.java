package com.SafeMove.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.SafeMove.Repository.DestinosRepository;
import com.SafeMove.Repository.ProdutoRepository;
import com.SafeMove.SafeMove.models.Destinos;
import com.SafeMove.SafeMove.models.Produto;
import com.SafeMove.enums.Agencias;
import com.SafeMove.enums.TipoProduto;



//verificar ferramenta do navegado pra saber o que ta de errado na requisição ;) 

@Controller
@RequestMapping("/cadastrarProduto")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;
    private final DestinosRepository destinoRepository;

    public ProdutoController(ProdutoRepository produtoRepository,DestinosRepository destinoRepository) {
        this.produtoRepository = produtoRepository;
        this.destinoRepository = destinoRepository;
    }

    @GetMapping
    public String form(Model model) {
        model.addAttribute("produto", new Produto());
        model.addAttribute("tiposProduto", TipoProduto.values());
        model.addAttribute("listaAgencias", Agencias.values());
        return "produto/formProduto";
    }

    @PostMapping
    public String form(@Validated @ModelAttribute("produto") Produto produto, BindingResult result,
            @RequestParam("tipo") String tipoProdutoString, // Recebe o tipo como String
            RedirectAttributes attributes,
            @RequestParam("agencia") Agencias agenciaSelecionada){

        if (result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique os campos");
            return "redirect:/cadastrarProduto";
        }

        Destinos destino = new Destinos();
        destino.setAgencia(agenciaSelecionada);
        destinoRepository.save(destino);

        TipoProduto tipoProduto = TipoProduto.valueOf(tipoProdutoString);  
        produto.setTipo(tipoProduto);
        produto.setDestino(destino);

        produtoRepository.save(produto);
        attributes.addFlashAttribute("mensagem", "Produto cadastrado com sucesso!");
        return "redirect:/cadastrarProduto/listarProdutos";
    }

    
    //lista de produtos 
    @GetMapping("/listarProdutos")
    public String listarProdutos(Model model) {
        model.addAttribute("produtos", produtoRepository.findAll());
        return "produto/listarProdutos";
    }

    @GetMapping("/listagem")
    public ModelAndView listarProdutosListagem() {
        ModelAndView mv = new ModelAndView("produto/listaProdutos");
        Iterable<Produto> produtos = produtoRepository.findAll();
        mv.addObject("listaDeProdutos", produtos);
        return mv;
    }

    @GetMapping("/{codigo}")
    public ModelAndView detalhesProduto(@PathVariable("codigo") Long codigo) {
        ModelAndView mv = new ModelAndView("produto/detalhesProduto");
        Produto produto = produtoRepository.findByIdProdtuo(codigo);
        mv.addObject("produto", produto);
        return mv;
    }

    
    //formulário agencias e tipo produto 
    @GetMapping("/formulario-produto")
    public String mostrarFormularioEnum(Model modelo) {
        modelo.addAttribute("produto", new Produto());
        modelo.addAttribute("tiposProduto", TipoProduto.values());
        modelo.addAttribute("listaAgencias", Agencias.values());
        return "produto/formProduto";
    }
    
    @GetMapping("/excluir/{tombamento}")
    public String excluirProduto(@PathVariable("tombamento") Integer tombamento, RedirectAttributes attributes) {
        Produto produto = produtoRepository.findByTombamento(tombamento);
        if (produto != null) {
            produtoRepository.delete(produto);
            attributes.addFlashAttribute("mensagem", "Produto com tombamento " + tombamento + " excluído com sucesso!");
        } else {
            attributes.addFlashAttribute("mensagem", "Produto com tombamento " + tombamento + " não encontrado!");
        }
        return "redirect:/cadastrarProduto/listarProdutos";
    }

    @GetMapping("/editar/{tombamento}")
    public String editarProdutoForm(@PathVariable("tombamento") Integer tombamento, Model model) {
        Produto produto = produtoRepository.findByTombamento(tombamento);
        if (produto != null) {
            model.addAttribute("produto", produto);
            model.addAttribute("tiposProduto", TipoProduto.values());
            model.addAttribute("listaAgencias", Agencias.values());
            return "produto/formProduto"; 
        } else {
            return "redirect:/cadastrarProduto/listarProdutos"; 
        }
    }
    
    
}	
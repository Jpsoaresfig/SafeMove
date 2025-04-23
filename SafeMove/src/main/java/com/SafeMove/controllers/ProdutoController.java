package com.SafeMove.controllers;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.SafeMove.Repository.DestinosRepository;
import com.SafeMove.Repository.modeloRepository;
import com.SafeMove.Repository.ProdutoRepository;
import com.SafeMove.SafeMove.models.Destinos;
import com.SafeMove.SafeMove.models.Modelo;
import com.SafeMove.SafeMove.models.Produto;

@Controller
@RequestMapping("/cadastrarProduto")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;
    private final modeloRepository modeloRepository;
    private final DestinosRepository destinoRepository; 

    public ProdutoController(ProdutoRepository produtoRepository, modeloRepository modeloRepository, DestinosRepository destinoRepository) {
        this.produtoRepository = produtoRepository;
        this.modeloRepository = modeloRepository;
        this.destinoRepository = destinoRepository;
    }

    @GetMapping
    public String form(Model model) {
        model.addAttribute("produto", new Produto());

        List<Modelo> listaModelos = modeloRepository.findAll();
        model.addAttribute("listaModelos", listaModelos);

        List<Destinos> listaDestinos = destinoRepository.findAll(); 
        model.addAttribute("listaDestinos", listaDestinos); 

        return "produto/formProduto";
    }

    @PostMapping
    public String form(@Validated @ModelAttribute("produto") Produto produto, BindingResult result, RedirectAttributes attributes) {//OK salvando arquivos
        if (result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique os campos");
            return "redirect:/cadastrarProduto";
        }

        produtoRepository.save(produto);
        attributes.addFlashAttribute("mensagem", "Produto cadastrado com sucesso!");
        return "redirect:/cadastrarProduto/listarProdutos";
    }

    @GetMapping("/listarProdutos")
    public String listarProdutos(Model model) {
        model.addAttribute("produtos", produtoRepository.findAll());
        return "produto/listarProdutos";
    }


    //listar produtos
    @GetMapping("/listagem") // Use @GetMapping para consistência com outros métodos de leitura
    public ModelAndView listarProdutosListagem() {
        ModelAndView mv = new ModelAndView("produto/listaProdutos");
        Iterable<Produto> produtos = produtoRepository.findAll();
        mv.addObject("listaDeProdutos", produtos);
        return mv;
    }

    @GetMapping("/{codigo}")
    public ModelAndView detalhesProduto(@PathVariable("codigo") Long codigo) {
        ModelAndView mv = new ModelAndView("produto/detalhesProduto");
        Produto produto = produtoRepository.findByCodigo(codigo);
        mv.addObject("produto", produto);
        return mv;
    }
}
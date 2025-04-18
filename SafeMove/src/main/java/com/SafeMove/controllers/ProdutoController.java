package com.SafeMove.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.SafeMove.Repository.ProdutoRepository;
import com.SafeMove.SafeMove.models.Produto;

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
    }}

    /*@PostMapping
    public String form(@Validated Produto produto, BindingResult result, RedirectAttributes attributes) {
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
}*/

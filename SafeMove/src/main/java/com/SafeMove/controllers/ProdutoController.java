package com.SafeMove.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.SafeMove.Repository.ProdutoRepository;
import com.SafeMove.SafeMove.models.Produto;

@Controller
public class ProdutoController {

    private final ProdutoRepository pr;

    public ProdutoController(ProdutoRepository pr) {
        this.pr = pr;
    }

    @RequestMapping(value = "/cadastrarProduto", method = RequestMethod.GET)
    public String form() {
        return "produto/formProduto";
    }

    @RequestMapping(value = "/cadastrarProduto", method = RequestMethod.POST)
    public String form(@Validated Produto produto, BindingResult result, RedirectAttributes attributes) {
        if (result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique os campos");
            return "redirect:/cadastrarProduto";
        }

        pr.save(produto);
        attributes.addFlashAttribute("mensagem", "Produto cadastrado com sucesso!");
        return "redirect:/listarProdutos";  // Redireciona para a listagem
    }

    @RequestMapping(value = "/listarProdutos", method = RequestMethod.GET)
    public String listarProdutos(Model model) {
        model.addAttribute("produtos", pr.findAll());
        return "produto/listarProdutos";  // Certifique-se de que esse template exista
    }
}

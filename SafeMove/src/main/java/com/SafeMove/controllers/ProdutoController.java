package com.SafeMove.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.SafeMove.Repository.ColaboradorRepository;
import com.SafeMove.Repository.ProdutoRepository;
import com.SafeMove.SafeMove.models.Produto;



@Controller
public class ProdutoController {

    private final ProdutoRepository pr;
    private final ColaboradorRepository cr;

    public ProdutoController(ProdutoRepository pr, ColaboradorRepository cr) {
        this.pr = pr;
        this.cr = cr;
    }

    @RequestMapping(value = "/cadastrarProduto", method = RequestMethod.GET)
    public String form() {
        return "Produto/formProduto";
    }

    @RequestMapping(value = "/cadastrarProduto", method = RequestMethod.POST)
    public String form(@Validated Produto produto, BindingResult result, RedirectAttributes attributes) {

        if (result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique os campos");
            return "redirect:/cadastrarProduto";
        }

        pr.save(produto);
        attributes.addFlashAttribute("mensagem", "Produto cadastrado com sucesso!");
        return "redirect:/cadastrarProduto";
    }
}

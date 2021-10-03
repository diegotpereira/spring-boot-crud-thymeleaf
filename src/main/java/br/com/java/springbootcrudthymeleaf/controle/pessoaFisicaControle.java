package br.com.java.springbootcrudthymeleaf.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.java.springbootcrudthymeleaf.entidade.pessoaFisica;
import br.com.java.springbootcrudthymeleaf.servico.pessoaFisicaServico;

@Controller
public class pessoaFisicaControle {
    
    @Autowired
    private pessoaFisicaServico pessoafisicaservico;

    @GetMapping(value = "/")
    public String buscarPF(Model model) {
        List<pessoaFisica> pessoaFisicas =  pessoafisicaservico.buscarTodos();

        model.addAttribute("pessoaFisicas", pessoaFisicas);

        return "index";
    }
}

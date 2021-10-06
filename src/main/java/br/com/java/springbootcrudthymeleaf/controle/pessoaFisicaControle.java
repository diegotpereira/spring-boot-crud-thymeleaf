package br.com.java.springbootcrudthymeleaf.controle;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.java.springbootcrudthymeleaf.entidade.PessoaFisica;
import br.com.java.springbootcrudthymeleaf.servico.PessoaFisicaServico;

@Controller
public class PessoaFisicaControle {
    
    @Autowired
    private PessoaFisicaServico pessoafisicaservico;

    @GetMapping(value = "/pessoaFisica")
    public String buscarPF(Model model) {
        List<PessoaFisica> pessoaFisicas =  pessoafisicaservico.buscarTodos();

        model.addAttribute("pessoaFisicas", pessoaFisicas);

        return "listar-pessoa-fisica";
    }

    @GetMapping(value = "/cadastroPessoaFisica")
    public String cadastroPessoaFisica(Model model) {
        model.addAttribute("pessoaFisica", new PessoaFisica());
        return "cadastrar-pessoa-fisica";
    }

    @PostMapping(value = "/cadastroPessoaFisica/salvar")
    public String salvarPessoaFisica(@Valid PessoaFisica pessoaFisica, BindingResult result, RedirectAttributes redirect) {
        if (result.hasErrors()) {
            return "cadastrar-pessoa-fisica";
        }

        pessoafisicaservico.salvar(pessoaFisica);

        redirect.addFlashAttribute("sucessMessage", "Contato salvo com sucesso!");

        return "redirect:/cadastroPessoaFisica";
    }
}

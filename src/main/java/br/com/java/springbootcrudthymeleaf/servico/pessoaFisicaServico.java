package br.com.java.springbootcrudthymeleaf.servico;

import java.util.List;

import br.com.java.springbootcrudthymeleaf.entidade.PessoaFisica;

public interface PessoaFisicaServico {
    
    void salvar(PessoaFisica pessoaFisica);
    List<PessoaFisica> buscarTodos();
    PessoaFisica buscarPorId(int id);
    void deletarPorId(int id);
}

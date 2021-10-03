package br.com.java.springbootcrudthymeleaf.servico;

import java.util.List;

import br.com.java.springbootcrudthymeleaf.entidade.pessoaFisica;

public interface pessoaFisicaServico {
    
    void salvar(pessoaFisica pessoafisica);
    List<pessoaFisica> buscarTodos();
    pessoaFisica buscarPorId(int id);
    void deletarPorId(int id);
}

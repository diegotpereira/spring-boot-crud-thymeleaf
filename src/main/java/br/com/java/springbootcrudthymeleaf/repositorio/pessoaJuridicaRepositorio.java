package br.com.java.springbootcrudthymeleaf.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.java.springbootcrudthymeleaf.entidade.PessoaJuridica;

public interface PessoaJuridicaRepositorio extends JpaRepository<PessoaJuridica, Long> {
    
}

package br.com.java.springbootcrudthymeleaf.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.java.springbootcrudthymeleaf.entidade.pessoaJuridica;

public interface pessoaJuridicaRepositorio extends JpaRepository<pessoaJuridica, Long> {
    
}

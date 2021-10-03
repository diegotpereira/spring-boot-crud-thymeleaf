package br.com.java.springbootcrudthymeleaf.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.java.springbootcrudthymeleaf.entidade.pessoaFisica;

@Repository
public interface pessoaFisicaRepositorio extends JpaRepository<pessoaFisica, Long> {
    
}

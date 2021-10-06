package br.com.java.springbootcrudthymeleaf.servico.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.java.springbootcrudthymeleaf.entidade.PessoaFisica;
import br.com.java.springbootcrudthymeleaf.repositorio.PessoaFisicaRepositorio;
import br.com.java.springbootcrudthymeleaf.servico.PessoaFisicaServico;

@Service
public class PessoaFisicaServicoImpl implements PessoaFisicaServico{

    @Autowired
    private PessoaFisicaRepositorio pessoafisicarepositorio;

    @Override
    public void salvar(PessoaFisica pessoaFisica) {
        // TODO Auto-generated method stub
        pessoafisicarepositorio.save(pessoaFisica);

    }

    @Override
    public List<PessoaFisica> buscarTodos() {
        // TODO Auto-generated method stub
        List<PessoaFisica> pessoaFisicas = new ArrayList<>();
        for(PessoaFisica pessoafisica : pessoafisicarepositorio.findAll()) {

            pessoaFisicas.add(pessoafisica);
        }

        return pessoaFisicas;
    }

    @Override
    public PessoaFisica buscarPorId(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deletarPorId(int id) {
        // TODO Auto-generated method stub
        
    }
    
}

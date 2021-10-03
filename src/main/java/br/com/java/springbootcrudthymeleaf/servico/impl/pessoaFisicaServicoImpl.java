package br.com.java.springbootcrudthymeleaf.servico.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.java.springbootcrudthymeleaf.entidade.pessoaFisica;
import br.com.java.springbootcrudthymeleaf.repositorio.pessoaFisicaRepositorio;
import br.com.java.springbootcrudthymeleaf.servico.pessoaFisicaServico;

@Service
public class pessoaFisicaServicoImpl implements pessoaFisicaServico{

    @Autowired
    private pessoaFisicaRepositorio pessoafisicarepositorio;

    @Override
    public void salvar(pessoaFisica pessoafisica) {
        // TODO Auto-generated method stub
        pessoafisicarepositorio.save(pessoafisica);

    }

    @Override
    public List<pessoaFisica> buscarTodos() {
        // TODO Auto-generated method stub
        List<pessoaFisica> pessoaFisicas = new ArrayList<>();
        for(pessoaFisica pessoafisica : pessoafisicarepositorio.findAll()) {

            pessoaFisicas.add(pessoafisica);
        }

        return pessoaFisicas;
    }

    @Override
    public pessoaFisica buscarPorId(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deletarPorId(int id) {
        // TODO Auto-generated method stub
        
    }
    
}

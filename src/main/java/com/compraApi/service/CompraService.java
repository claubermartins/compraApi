package com.compraApi.service;


import com.compraApi.exceptions.DuplicatedResourceException;
import com.compraApi.exceptions.ResourceNotFoundException;
import com.compraApi.model.Compra;
import com.compraApi.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompraService {
    @Autowired
    private CompraRepository compraRepository;
    public CompraService(CompraRepository compraRepository){
        this.compraRepository = compraRepository;
    }
    public Page<Compra> obterTodos(Pageable pageable){
        return compraRepository.findAll(pageable);
    }
    public List<Compra>obterTodos(){
        return compraRepository.findAll();
    }
    public Optional<Compra> buscaPorId(Long id){
        return compraRepository.findById(id);
    }
    public Optional<Compra> buscarPorCodigo(String codigo){
        return compraRepository.findByCodigo(codigo);
    }
    public Optional<Compra> buscarPorValor(String valor){
        return compraRepository.findByValor(valor);
    }
    public List<Compra> buscaPorFiltro(String nome){
        return compraRepository.findByNomeContainingIgnoreCase(nome);
    }
    //acima é a requisição get, abaixo é crud
    public Compra salvar(Compra compra){
        var podeSalvar = compra.getId() == null && compraRepository.findByCodigo(compra.getCodigo()).isEmpty();
        if (podeSalvar)
            return compraRepository.save(compra);
        else
            throw new DuplicatedResourceException();
    }
    public Compra update(Compra compra){
        var podeAtualizar = compra.getId() != null && compraRepository.findByCodigo(compra.getCodigo()).isPresent();
        if (podeAtualizar)
            return compraRepository.save(compra);
        else
            throw new ResourceNotFoundException();
    }
    public void delete(Compra compra){
        var podeDeletar = compra.getId() !=null && compraRepository.findByCodigo(compra.getCodigo()).isPresent();
        if(podeDeletar)
            compraRepository.delete(compra);
        else
            throw new ResourceNotFoundException();
    }
}

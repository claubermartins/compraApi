package com.compraApi.controller;

import com.compraApi.model.Compra;
import com.compraApi.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/compras")
public class CompraController {
    private CompraService compraService;

    @Autowired
    public CompraController(CompraService compraService){
        this.compraService = compraService;
    }

    @GetMapping
    ResponseEntity<List<Compra>> obterTodos(){
        var compras = compraService.obterTodos();
        return ResponseEntity.ok(compras);
    }
    @GetMapping("{id}")
    ResponseEntity<Optional<Compra>> obterPorId(@PathVariable Long id){
        var compras = compraService.buscaPorId(id);
        return ResponseEntity.ok(compras);
    }
    @PostMapping
    ResponseEntity<Compra> salvar(@RequestBody Compra compra){
        var compraSalva =   compraService.salvar(compra);
        var uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(compra.getId()).toUri();
        return ResponseEntity.created(uri).body(compra);
    }
    @PutMapping
    ResponseEntity<Compra>update(@RequestBody Compra compra){
        var compraUpdated = compraService.update(compra);
        return ResponseEntity.ok(compraUpdated);
    }
    @DeleteMapping
    ResponseEntity<Compra> delete(@RequestBody Compra pessoa){
        compraService.delete(pessoa);
        return ResponseEntity.ok().build();
    }
}

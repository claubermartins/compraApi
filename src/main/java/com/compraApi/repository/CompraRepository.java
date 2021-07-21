package com.compraApi.repository;

import com.compraApi.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long> {
    List<Compra> findByNomeContainingIgnoreCase(String nome);
    Optional<Compra> findByNomeIgnoreCase(String nome);
    Optional<Compra> findByCodigo(String codigo);
    Optional<Compra> findByValor(String valor);
}

package com.SafeMove.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.SafeMove.SafeMove.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Produto findByCodigo(Long codigo);
    Produto findByTombamento(Integer tombamento);

    
    @Query("SELECT p FROM Produto p WHERE p.pessoa IS NOT NULL AND p.pessoa <> ''")
    List<Produto> findAllComPessoa();

    // Método padrão para buscar todos os produtos
    List<Produto> findAll();
}
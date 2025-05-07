package com.SafeMove.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.SafeMove.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	Produto findByIdProdtuo(Long idProdtuo);
    Produto findByTombamento(Integer tombamento);

    

    // Método padrão para buscar todos os produtos
    List<Produto> findAll();
}
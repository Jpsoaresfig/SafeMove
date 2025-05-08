package com.SafeMove.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.SafeMove.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	Produto findByIdProduto(Long idProduto);
    Produto findByTombamento(Integer tombamento);

    

    
}
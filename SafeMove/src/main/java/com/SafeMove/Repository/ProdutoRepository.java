package com.SafeMove.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SafeMove.SafeMove.models.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {
    Produto findByCodigo(Long codigo);
    Produto findByTombamento(Integer tombamento);
    
    @Query("SELECT p FROM Produto p LEFT JOIN FETCH p.pessoa")
    List<Produto> findAllComPessoa(); 
}

	
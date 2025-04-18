package com.SafeMove.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SafeMove.SafeMove.models.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {
    Produto findByCodigo(Long codigo);
    Produto findByTombamento(Integer tombamento);
}
	
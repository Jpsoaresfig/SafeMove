package com.SafeMove.Repository;

import org.springframework.data.repository.CrudRepository;

import com.SafeMove.SafeMove.models.Produto;

public interface ProdutoRepository extends CrudRepository<Produto,String>{
	
	Produto findByCodigo(Long codigo);
	Produto findByCodigo(Integer tombamento);
	
	

}

package com.apirestprodutos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirestprodutos.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	Produto findById(long id); 

}

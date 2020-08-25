package com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apirest.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	//jpa repository possui metodos para fazer persistencia no BD (não ha necessidade de criar DAO e transactions)
	
	Produto findById(long id);

}

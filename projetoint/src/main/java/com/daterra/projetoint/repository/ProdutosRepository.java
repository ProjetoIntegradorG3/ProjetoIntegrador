package com.daterra.projetoint.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.daterra.projetoint.model.Produtos;


@Repository
public interface ProdutosRepository extends JpaRepository <Produtos, Long> {
	public List <Produtos> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
	
	
	public List <Produtos> findByPrecoGreaterThanOrderByPreco(BigDecimal preco);
	
	public List <Produtos> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);

}

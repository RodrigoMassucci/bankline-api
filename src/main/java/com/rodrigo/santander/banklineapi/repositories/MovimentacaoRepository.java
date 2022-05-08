package com.rodrigo.santander.banklineapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.santander.banklineapi.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer>  {
	
	public List<Movimentacao>findByIdConta(Integer idConta);
}

package com.rodrigo.santander.banklineapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigo.santander.banklineapi.dto.NovaMovimentacao;
import com.rodrigo.santander.banklineapi.dto.NovoCorrentista;
import com.rodrigo.santander.banklineapi.model.Correntista;
import com.rodrigo.santander.banklineapi.model.Movimentacao;
import com.rodrigo.santander.banklineapi.repositories.CorrentistaRepository;
import com.rodrigo.santander.banklineapi.repositories.MovimentacaoRepository;
import com.rodrigo.santander.banklineapi.service.CorrentistaService;
import com.rodrigo.santander.banklineapi.service.MovimentacaoService;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {
	
	@Autowired
	private MovimentacaoRepository repository;
	
	@Autowired
	private MovimentacaoService service;
	
	@GetMapping
	public List<Movimentacao> findAll(){
		return repository.findAll();
	}
	
	@PostMapping
	public void save(@RequestBody NovaMovimentacao movimentacao) {
		service.save(movimentacao);
	}
}

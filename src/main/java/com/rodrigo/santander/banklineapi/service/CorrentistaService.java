package com.rodrigo.santander.banklineapi.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigo.santander.banklineapi.dto.NovoCorrentista;
import com.rodrigo.santander.banklineapi.model.Conta;
import com.rodrigo.santander.banklineapi.model.Correntista;
import com.rodrigo.santander.banklineapi.repositories.CorrentistaRepository;

@Service
public class CorrentistaService {
	
	@Autowired
	private CorrentistaRepository repository;
	
	public void save(NovoCorrentista novoCorrentista) {
		Correntista correntista = new Correntista();
		correntista.setCpf(novoCorrentista.getCpf());
		correntista.setNome(novoCorrentista.getNome());
		
		Conta conta = new Conta();
		conta.setSaldo(0.0);
		conta.setNumero(new Date().getTime());
		
		correntista.setConta(conta);
		repository.save(correntista);
	}
}

package com.rodrigo.santander.banklineapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.santander.banklineapi.model.Correntista;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {

}

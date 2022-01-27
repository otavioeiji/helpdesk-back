package com.otavio.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.otavio.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}

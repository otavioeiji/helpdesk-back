package com.otavio.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.otavio.helpdesk.domain.Chamado;
import com.otavio.helpdesk.domain.Cliente;
import com.otavio.helpdesk.domain.Tecnico;
import com.otavio.helpdesk.domain.enums.Perfil;
import com.otavio.helpdesk.domain.enums.Prioridade;
import com.otavio.helpdesk.domain.enums.Status;
import com.otavio.helpdesk.repositories.ChamadoRepository;
import com.otavio.helpdesk.repositories.PessoaRepository;

@Service
public class DBService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	public void instanciaDB() {
		
		Tecnico tec1 = new Tecnico(null, "Valdir Cesar", "33134488361", "valdir@mail.com", encoder.encode("123"));
		tec1.addPerfil(Perfil.ADMIN);
	
		Cliente cli1 = new Cliente(null, "Albert Einstein Torvalds", "69057079887", "einstein@mail.com", encoder.encode("123"));
		
		pessoaRepository.saveAll(Arrays.asList(tec1, cli1));
	}

}

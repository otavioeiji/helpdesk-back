package com.otavio.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	public void instanciaDB() {
		
		Tecnico tec1 = new Tecnico(null, "Valdir Cesar", "33134488361", "valdir@mail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		Tecnico tec2 = new Tecnico(null, "Richard Stallman", "13255255961", "stallman@mail.com", "123");
		Tecnico tec3 = new Tecnico(null, "Claude Elwood Shannon", "37832833106", "shannon@mail.com", "123");
		Tecnico tec4 = new Tecnico(null, "Tim Berners-Lee Cesar", "88048175509", "lee@mail.com", "123");
		Tecnico tec5 = new Tecnico(null, "Linus Torvalds", "41280634600", "torvalds@mail.com", "123");
		
		
		Cliente cli1 = new Cliente(null, "Albert Einstein Torvalds", "69057079887", "einstein@mail.com", "123");
		Cliente cli2 = new Cliente(null, "Marie Curie", "73221429851", "curie@mail.com", "123");
		Cliente cli3 = new Cliente(null, "Charles Darwin", "53151296831", "darwin@mail.com", "123");
		Cliente cli4 = new Cliente(null, "Stephen Hawking", "14673285026", "hawking@mail.com", "123");
		Cliente cli5 = new Cliente(null, "Max Planck", "62618834674", "planck@mail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		Chamado c2 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "Chamado 02", "Segundo chamado", tec1, cli2);
		Chamado c3 = new Chamado(null, Prioridade.BAIXA, Status.ANDAMENTO, "Chamado 01", "Terceiro chamado", tec2, cli3);
		Chamado c4 = new Chamado(null, Prioridade.ALTA, Status.ANDAMENTO, "Chamado 01", "Quarto chamado", tec3, cli3);
		Chamado c5 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Quinto chamado", tec2, cli1);
		Chamado c6 = new Chamado(null, Prioridade.BAIXA, Status.ANDAMENTO, "Chamado 01", "Sexto chamado", tec1, cli5);
		
		pessoaRepository.saveAll(Arrays.asList(tec1, tec2, tec3, tec4, tec5, cli1, cli2, cli3, cli4, cli5));
		chamadoRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5, c6));
	}

}

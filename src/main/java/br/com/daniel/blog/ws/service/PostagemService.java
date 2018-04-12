package br.com.daniel.blog.ws.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.daniel.blog.ws.entity.Postagem;

@Service
public interface PostagemService {

	public void save(Postagem postagem);
	public List<Postagem> findAll();
	
}

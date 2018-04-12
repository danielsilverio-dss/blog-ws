package br.com.daniel.blog.ws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.daniel.blog.ws.dao.PostagemDao;
import br.com.daniel.blog.ws.entity.Postagem;
import br.com.daniel.blog.ws.service.PostagemService;

@Component
public class PostagemServiceImpl implements PostagemService{

	@Autowired
	private PostagemDao postagemDao;
	
	@Override
	public void save(Postagem postagem) {
		postagemDao.save(postagem);
	}

	@Override
	public List<Postagem> findAll() {
		return postagemDao.findAll();
	}
	
	

}

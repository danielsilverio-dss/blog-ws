package br.com.daniel.blog.ws.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import br.com.daniel.blog.ws.entity.Postagem;

@Component
public interface PostagemDao extends CrudRepository<Postagem, Long>{
	
	public Postagem save(Postagem postagem);
	public List<Postagem> findAll();

}

package br.com.daniel.blog.ws.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.daniel.blog.ws.entity.Postagem;
import br.com.daniel.blog.ws.service.PostagemService;

@RestController
@RequestMapping("postagens")
public class PostagemResource {
	
	@Autowired
	private PostagemService postagemService;

	@RequestMapping( method= RequestMethod.POST )
	public void save(Postagem postagem) {
		postagemService.save(postagem);
	}
	
	@RequestMapping( method = RequestMethod.GET )
	public List<Postagem> findAll(){
		return postagemService.findAll();
	}
	
}

package br.com.daniel.blog.ws.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.daniel.blog.ws.entity.Postagem;

@RestController
@RequestMapping("postagens")
public class PostagemResource {

	@RequestMapping( method= RequestMethod.POST )
	public void save(Postagem postagem) {
		// save
	}
	
	@RequestMapping( method = RequestMethod.GET )
	public List<Postagem> findAll(){
		List<Postagem> postagens = new ArrayList<>();
		return postagens;
	}
	
}

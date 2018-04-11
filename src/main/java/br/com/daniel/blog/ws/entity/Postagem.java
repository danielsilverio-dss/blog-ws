package br.com.daniel.blog.ws.entity;

public class Postagem {
	
	public String titulo;
	public String texto;
	public String tags;
	
	public Postagem() {}
	
	public Postagem(String titulo, String texto, String tags) {
		super();
		this.titulo = titulo;
		this.texto = texto;
		this.tags = tags;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	
}

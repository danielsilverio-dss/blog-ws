package br.com.daniel.blog.ws.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="BLOG_DB", name="TB_POSTAGEM")
public class Postagem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_POSTAGEM")
	public long id;
	
	@Column(name="DS_TITULO")
	public String titulo;
	
	@Column(name="DS_TEXTO")
	public String texto;
	
	@Column(name="DS_TAGS")
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

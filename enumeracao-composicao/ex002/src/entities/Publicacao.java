package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Publicacao {
	
	public static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	private LocalDateTime momento;
	private String titulo;
	private String conteudo;
	private Integer likes;
	
	private List<Comentario> comentarios = new ArrayList<>();
	
	public Publicacao() {}

	public Publicacao(LocalDateTime momento, String titulo, String conteudo, Integer likes) {
		super();
		this.momento = momento;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.likes = likes;
	}

	public LocalDateTime getMomento() {
		return momento;
	}

	public void setMomento(LocalDateTime momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public void addCometario(Comentario texto) {
		comentarios.add(texto);
	}
	
	public void removeComentario(Comentario texto) {
		comentarios.remove(texto);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n");
		sb.append(likes + " likes - ");
		sb.append(fmt.format(momento) + "\n");
		sb.append(conteudo + "\n");
		sb.append("Comentarios:\n");
		for(Comentario c : comentarios) {
			sb.append(c + "\n");
		}
		return sb.toString();
	}
	
	
	
}

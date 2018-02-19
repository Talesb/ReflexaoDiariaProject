package br.com.entity;

public class Pensamento {

	private Integer id;
	private String nome;
	private String conteudo;
	private String data;
	private Usuario usuario;
	
	
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public Pensamento(Integer id, String nome, String conteudo, String data, Usuario usuario) {
	
		this.id = id;
		this.nome = nome;
		this.conteudo = conteudo;
		this.data = data;
		this.usuario = usuario;
	}
	
	public Pensamento() {
		
	}
	
	@Override
	public String toString() {
		return "Pensamento [id=" + id + ", nome=" + nome + ", conteudo=" + conteudo + ", data=" + data + ", usuario="
				+ usuario + "]";
	}
	


	
}

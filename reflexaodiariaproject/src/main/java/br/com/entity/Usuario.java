package br.com.entity;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private Integer id;
	private String nome;
	private String email;
	private String senha;
	private boolean adm;
	private List<Pensamento> pensamentos;
	
	
	
	public List<Pensamento> getPensamentos() {
		return pensamentos;
	}
	public void setPensamentos(List<Pensamento> pensamentos) {
		this.pensamentos = pensamentos;
	}
	public boolean isAdm() {
		return adm;
	}
	public void setAdm(boolean adm) {
		this.adm = adm;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void adcionar(Pensamento p) {
		if(pensamentos==null) {
			pensamentos= new ArrayList<Pensamento>();
		}
		pensamentos.add(p);
	}
	
	
	public Usuario(Integer id, String nome, String email, String senha, boolean adm, List<Pensamento> pensamentos) {
		
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.adm = adm;
		this.pensamentos = pensamentos;
	}

	public Usuario() {
	
	}
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", adm=" + adm
				+ ", pensamentos=" + pensamentos + "]";
	}


	
	
	
}

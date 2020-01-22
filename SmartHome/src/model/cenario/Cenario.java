package model.cenario;

import java.util.ArrayList;
import java.util.List;

import model.dispositivo.Dispositivo;

public abstract class Cenario {
	
	private String nome;
	private String tipo;
	private List<Dispositivo> dispositivos =  new ArrayList<Dispositivo>();
	private Boolean isAtivo = false;
	
	public Cenario() {}
	
	public Cenario(String nome, String tipo) {
		super();
		this.nome = nome;
	}
	
	public Cenario(String nome, String tipo, List<Dispositivo> dispositivos, Boolean isAtivo) {
		super();
		this.nome = nome;
		this.dispositivos = dispositivos;
		this.isAtivo = isAtivo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
		
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Dispositivo> getDispositivos() {
		return dispositivos;
	}
	
	public void setDispositivos(List<Dispositivo> dispositivos) {
		this.dispositivos = dispositivos;
	}
	
	public void addDispositivos(Dispositivo dispositivo) {
		this.dispositivos.add(dispositivo);
		System.out.println(dispositivo.imprimir() + " adicionada com sucesso!");
	}
	
	public Boolean getIsAtivo() {
		return isAtivo;
	}
	
	public void setIsAtivo(Boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	
	public abstract String sobreCenario();

	
}

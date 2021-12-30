package main;

import java.util.Calendar;
import java.util.Date;

public class Pessoa {
	protected String nom;
	protected String tel;
	protected String nasc;
	protected String data;
	protected String ultalt;
	public String getUltalt() {
		return ultalt;
	}

	public void setUltalt(String ultalt) {
		this.ultalt = ultalt;
	}

	protected String tipo = "Pessoa";
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Pessoa() {

	}

	public Pessoa(String nom, String tel, String nasc, String data) {
		setNom(nom);
		setTel(tel);
		setNasc(nasc);
		setData(data);
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getNasc() {
		return nasc;
	}
	public void setNasc(String nasc) {
		this.nasc = nasc;
	}
	
	public void listar() {
		System.out.println("Nome: " + getNom());
		System.out.println("");
		System.out.println("Número de Telefone: " + getTel());
		System.out.println("");
		System.out.println("Data de nascimento: " + getNasc());
		System.out.println("");
		System.out.println("Data de cadastro: " + getData());
		System.out.println("");
		if(getUltalt() != null) {
			System.out.println("Data da última alteração: " + getUltalt());
		}
		
	}
	
	
}

package main;

import java.util.Calendar;
import java.util.Date;

public class Aluno extends Pessoa{
	protected double nota;
	private String tipo = "Aluno";
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public Aluno() {


	}
	public Aluno(String nom, String tel, String nasc, double nota, String data) {
		super(nom, tel, nasc, data);
		this.nota = nota;
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
		System.out.println("");
		System.out.println("Nota: " + getNota());
		
	}
	

}

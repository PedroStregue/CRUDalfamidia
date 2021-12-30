package main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Dados {
	Scanner ler = new Scanner(System.in);
	public Dados() {
		
	}
	
	private List<Pessoa> cadastros = new ArrayList<>();
	
	public void cadastrar(Pessoa pessoa) {
		 cadastros.add(pessoa);
	}
	
	public void listar() {
		System.out.println("Lista de Cadastros");
		for(Pessoa pessoa:cadastros) {
			if(pessoa instanceof Aluno) {
				Aluno aluno = (Aluno)pessoa;
				aluno.listar();
			}
			else{
				pessoa.listar();
		}
	}
}
	public void buscar(String nome) {
		for(Pessoa pessoa:cadastros) {
			if(pessoa.getNom().equalsIgnoreCase(nome)) {
				if(pessoa instanceof Aluno) {
					Aluno aluno = (Aluno)pessoa;
					aluno.listar();
					System.out.println("Insira o novo nome: ");
					String nom = ler.nextLine();
					aluno.setNom(nom);
					System.out.println("Insira o novo número de telefone:  ");
					String tel = ler.nextLine();
					aluno.setTel(tel);
					System.out.println("Insira a nova nota: ");
					double not = ler.nextDouble();
					ler.nextLine();
					aluno.setNota(not);
					Date dat = new Date();
					String data = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(dat);
					pessoa.setUltalt(data);
					}
				if(pessoa.getTipo().equals("Pessoa")) {
					pessoa.listar();
				System.out.println("Insira o novo nome: ");
				String nom = ler.nextLine();
				pessoa.setNom(nom);
				System.out.println("Insira o novo número de telefone:  ");
				String tel = ler.nextLine();
				pessoa.setTel(tel);
				Date dat = new Date();
				String data = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(dat);
				pessoa.setUltalt(data);
				}
				}
				
			
		}
	
	}
	public void apagar() {
		System.out.println("Insira o nome do cadastro que deseja excluir: ");
		String nom = ler.nextLine();
		for(Pessoa pessoa:cadastros) {
			if(pessoa.getNom().equalsIgnoreCase(nom)) {
				cadastros.remove(pessoa);
				System.out.println("Cadastro removido com sucesso.");
			}
		}
		
	}
}	

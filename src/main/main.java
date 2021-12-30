package main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		int opt = 0;
		Pessoa cad = new Pessoa();
		Dados controle = new Dados();
		do {
	    Scanner ler = new Scanner(System.in);
		System.out.println("Escolha uma das seguintes opções");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Listar cadastrados");
		System.out.println("3 - Atualizar Cadastro");
		System.out.println("4 - Excluir Cadastro");
		System.out.println("5 - Encerrar Sessão");
		
		 opt = ler.nextInt();
		 ler.nextLine();
		
		
			if(opt == 1) {
				System.out.println("Digite seu nome: ");
				String nom = ler.nextLine();
				System.out.println("Insira seu número de telefone: ");
				String tel = ler.nextLine();
				System.out.println("Insira sua data de nascimento: ");
				String nasc = ler.nextLine();
				Date dat = new Date();
				String data = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(dat);
				System.out.println("Possui nota para informar? 1 - sim | 2 - não");
				int res = ler.nextInt();
				if(res == 1) {
					System.out.println("Insira a nota: ");
					double not = ler.nextDouble();
					cad = new Aluno(nom, tel, nasc, not, data);
					controle.cadastrar(cad);
					System.out.println("Aluno cadastrado com sucesso :)");
				}
				if (res == 2) {
					cad = new Pessoa(nom, tel, nasc, data);
					controle.cadastrar(cad);
					System.out.println("Cadastro realizado :)");
				}
			}
			if(opt == 2) {
				controle.listar();
			}
			if(opt == 3) {
				System.out.println("Insira o nome do cadastrado que deseja atualizar:");
				String busca = ler.nextLine();
				controle.buscar(busca);
				
			}
			if(opt == 4) {
				controle.apagar();
			}
		}while(opt != 5);
		
	}
}

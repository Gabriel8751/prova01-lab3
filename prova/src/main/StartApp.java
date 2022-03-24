package main;

import java.awt.Window.Type;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import vo.Aluno;
import vo.PosGraducao;
import vo.Mestrado;

public class StartApp {
	
	static Scanner leitura = new Scanner(System.in);
	
	public static void main(String[] args) {
	
	PosGraducao posg = new PosGraducao();
	ArrayList<Aluno> aluno = new ArrayList();
	ArrayList mestrado = new ArrayList(); 
	ArrayList posgraduacao = new ArrayList();
	int contador = 0;
	int scan = 0;
	do {
		printMenu();
		scan = scanner();
		if(scan == 1) {
			printType();
			int scan2 = leitura.nextInt();
			leitura.nextLine();
			if(scan2 == 1) {
				PosGraducao pos = new PosGraducao();
				createPos(pos);
				aluno.add(pos);;
				contador++;
			}
			else if(scan2 == 2) {
				Mestrado mes = new Mestrado();
				createMes(mes);
				aluno.add(mes);;
				contador++;
			}
		}
		else if(scan == 2) {
			listPos(aluno);
		}
		else if(scan == 3) {
			listMes(aluno);
		}
		else if(scan != 1 && scan != 2 && scan != 3 && scan != 9){
			System.out.println("Digite uma opção correta");
		}
	}while(scan != 9);
	
		
	}
	
	public static void printMenu() {
		System.out.println("1 = Cadastrar Aluno\r\n"
				+ "2 = Listar alunos Pós-graduação\r\n"
				+ "3 = Listar alunos Mestrado\r\n"
				+ "9 = Sair");
	}
	
	public static void printType() {
		System.out.println("Qual você deseja cadastrar");
		System.out.println("1 = Pós-Graduação");
		System.out.println("2 = Mestrado");
	}
	
	public static int scanner() {
		int a = leitura.nextInt();
		leitura.nextLine();
		return a;
	}
	
	public static String createPos(PosGraducao pos) {
		System.out.println("Digite o nome do aluno: ");
		pos.setNome(leitura.nextLine());
		
		System.out.println("Digite o cpf do aluno: ");
		pos.setCpf(leitura.nextInt());
		
		System.out.println("Digite o email do aluno: ");
		leitura.nextLine();
		pos.setEmail(leitura.nextLine());
		String a = "Mestrado";
		return a;
	}
	
	public static void createMes(Mestrado mes) {
		System.out.println("Digite o nome do aluno: ");
		mes.setNome(leitura.nextLine());
		
		System.out.println("Digite o cpf do aluno: ");
		mes.setCpf(leitura.nextInt());
		
		System.out.println("Digite o email do aluno: ");
		leitura.nextLine();
		mes.setEmail(leitura.nextLine());	
	}
	
	public static void listPos(ArrayList<Aluno> aluno) {
	if(aluno != null) {
		for(int i = 0; i < aluno.size(); i++) {
			System.out.println("\nNome do aluno: "+ aluno.get(i).getNome());
			System.out.println("Cpf do aluno: "+aluno.get(i).getCpf());
			System.out.println("Email do aluno: "+aluno.get(i).getEmail()+"\n");
			}
		}
	}
	public static void listMes(ArrayList<Aluno> aluno) {
	if(aluno != null) {
		for(int i = 0; i < aluno.size(); i++) {
			System.out.println("\nNome do aluno: "+ aluno.get(i).getNome());
			System.out.println("Cpf do aluno: "+aluno.get(i).getCpf());
			System.out.println("Email do aluno: "+aluno.get(i).getEmail()+"\n");
			}
		}
	}
}

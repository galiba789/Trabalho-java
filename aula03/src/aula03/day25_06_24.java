package aula03;

import java.util.Scanner;
import java.util.regex.Pattern;

public class day25_06_24 {

	
	public static void main(String[] args) {
	
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Crie um usuario");
		String Usuario = sc1.next();
		for (int i=0; i < 5; i++) {
		System.out.println("Crie sua senha, atendendo os criterios de segurança.");
		System.out.println("1. A senha deve conter letras minusculas");
		System.out.println("2. A senha deve conter letras maiusculas");
		System.out.println("3. Numeros");
		System.out.println("4. Caracteres especiais");
		System.out.println("5. Não pode haver ordem de numeros");
		String senha = sc1.next();
		
		
			if(Verificador(senha)) {
				System.out.println("Conta criada");
				break;
			} else {
				System.out.println("Senha não atende os criterios de segurança");
			}
		}
		
	}
	public static boolean Verificador(String senha) {
		
		boolean temMinuscula = Pattern.compile("[a-z]").matcher(senha).find();
		
		boolean temMaiuscula = Pattern.compile("[A-Z]").matcher(senha).find();
		
		boolean temNumeros = Pattern.compile("[0-9]").matcher(senha).find();
		
		boolean temCaracterEspecial = Pattern.compile("[!@#$%^&*(),.?\\\"':{}|<>]").matcher(senha).find();
		
		boolean temSequenciaNumerica = Pattern.compile("012|123|234|345|456|567|678|789").matcher(senha).find();
		
		return temMaiuscula && temMinuscula && temNumeros && temCaracterEspecial && !temSequenciaNumerica;
		
		
	}


}

/**
 * Este programa mostra ao aluno:
 * 1) Que um programa Java é construído dentro de um projeto Java.
 * 2) Todo programa deve ter uma classe com um método main.
 * 3) Como exibir informações no terminal (console) do Java.
 * Como ler uma String do terminal (console) do Java.  
 */
package meuPrimeiroProgramaJava;
import java.util.Scanner; 

/**
 * @author victo
 * Data: 03/02/2021
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Olá amigo!\nQual é o seu nome?");
		
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		System.out.printf("Olá %s!\n", nome);
	}

}

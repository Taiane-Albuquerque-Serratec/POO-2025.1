package aula8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Cliente> clientes = new ArrayList<>();
		
			System.out.println("Digite o ID:");
			Integer id = sc.nextInt();
			sc.nextLine();

			while (id  > 0) {
			System.out.println("Digite o nome: ");
			String nome = sc.nextLine();
			System.out.println("Digite a idade: ");
			Integer idade = sc.nextInt();
			sc.nextLine();
			System.out.println("Digite o telefone: ");
			String telefone = sc.nextLine();
			clientes.add(new Cliente(id, nome, idade, telefone));
			
			System.out.println("Digite o Id: ");
			id = sc.nextInt();
			sc.nextLine();
			}
			
			for (Cliente cliente : clientes) {
				System.out.println(cliente);
			}
			sc.close();
	}	
}
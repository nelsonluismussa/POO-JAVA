package aplication;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Nome Produto: ");
		String nomeProduto = input.nextLine();
		
		System.out.println("Preço: ");
	    double preco = input.nextDouble();
		
		System.out.println("Quantidade: ");
		int quantidade = input.nextInt();
		Produto pro = new Produto(nomeProduto, preco, quantidade);
		
		System.out.println("Lista..");
		System.out.println(pro);
		
		System.out.println("Quantidade: ");
		quantidade = input.nextInt();
		pro.adicionarProduto(quantidade);
		
		System.out.println("Lista..");
		System.out.println(pro);
		
		System.out.println("Remover: ");
		quantidade = input.nextInt();
		pro.removerProduto(quantidade);
		
		System.out.println("Lista..");
		System.out.println(pro);
		
		input.close();
		

	}

}

    


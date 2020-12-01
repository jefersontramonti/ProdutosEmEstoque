package aplication;

import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Insira os dados do produto:");
        System.out.print("Nome: ");
        produto.nome = sc.nextLine();
        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        produto.quantidade = sc.nextInt();

        System.out.println();
        System.out.println(" Dados do produto: " +  produto);

        //Adiciona ao estoque
        System.out.println();
        System.out.print("Addc ao estoque: ");
        int add = sc.nextInt();
        produto.adccProdutos(add);

        System.out.println();
        System.out.println(" Dados do produto atualizados: " +  produto);

        //Retira do estoque

        System.out.println();
        System.out.print("Retira do estoque: ");
        add = sc.nextInt();
        produto.removeProduto(add);

        System.out.println();
        System.out.println(" Dados do produto atualizados: " +  produto);





        sc.close();
    }
}

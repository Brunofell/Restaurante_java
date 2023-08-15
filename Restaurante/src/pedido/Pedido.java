package pedido;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Pedido {
    String nome;
    double preco;

    public Pedido(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public Pedido(){
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void fazendoPedido(ArrayList list){
        Scanner input = new Scanner(System.in);
        try{
        System.out.println("Vamos fazer o pedido!");
        System.out.print("Qual o seu nome: ");
        String nome = input.nextLine();
        System.out.println();
        System.out.println("Ok " + nome + "! Qual será seu pedido?");
        System.out.println("|-------------------------------------|");
        System.out.println("| 0 - Finalizar Pedido                |");
        System.out.println("| 1 - Macarrão                        |");
        System.out.println("| 2 - Frango à Parmegiana             |");
        System.out.println("| 3 - Prato Vegano                    |");
        System.out.println("| 4 - Coca-Cola                       |");
        System.out.println("| 5 - Chá Mate com limão              |");
        System.out.println("|-------------------------------------|");
        System.out.print("Digite uma opção: ");
        int cont = 0;
        while (cont != 0){
            int pedido = input.nextInt();
            if (pedido == 0) {
                System.out.println();
                System.out.println("Vizualização do pedido:");
                cont += 1;

            }else if (pedido == 1) {
                System.out.println();
                Pedido macarrao = new Pedido("Macarrão", 30);
                list.add(macarrao);

            }else if (pedido == 2) {
                System.out.println();
                Pedido frango = new Pedido("Frango à Parmegiana", 40);
                list.add(frango);

            }else if (pedido == 3) {
                System.out.println();
                Pedido vegano = new Pedido("Prato Vegano", 38);
                list.add(vegano);

            }else if (pedido == 4) {
                System.out.println();
                Pedido coca = new Pedido("Coca-Cola", 30);
                list.add(coca);

            }else if (pedido == 5) {
                System.out.println();
                Pedido cha = new Pedido("Chá Mate com limão", 30);
                list.add(cha);

            } else {
                System.out.println("Opção inválida! Digite Novamente:");
            }

        }

    }catch (InputMismatchException e) {
            System.out.println("Opção inválida! Digite Novamente:");
            input.nextLine();
        }
    }

}



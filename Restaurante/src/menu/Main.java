package menu;

import pedido.Pedido;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    double preco;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        ArrayList<Pedido> nota = new ArrayList<>();

        while (contador != 0){
            try{
            System.out.println("• Olá! Seja bem vindo!");
            System.out.println("|-----------------------|");
            System.out.println("| 1 - Fazer pedido      |");
            System.out.println("| 0 - Sair              |");
            System.out.println("|-----------------------|");
            System.out.print("Digite uma opção: ");
            int opcao = sc.nextInt();

            if(opcao == 0){
                System.out.println("Adeus!");
                contador -=1;

            }else if(opcao == 1){
                try{
                    System.out.println("Vamos fazer o pedido!");
                    System.out.print("Qual o seu nome: ");
                    String nome = sc.nextLine();
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
                    int cont = 1;
                    while (cont != 0){
                        System.out.print("Digite uma opção: ");
                        int pedido = sc.nextInt();
                        if (pedido == 0) {
                            System.out.println();
                            System.out.println("Vizualização do pedido:");
                            cont -= 1;

                        }else if (pedido == 1) {
                            System.out.println();
                            Pedido macarrao = new Pedido("Macarrão", 30);
                            nota.add(macarrao);

                        }else if (pedido == 2) {
                            System.out.println();
                            Pedido frango = new Pedido("Frango à Parmegiana", 40);
                            nota.add(frango);

                        }else if (pedido == 3) {
                            System.out.println();
                            Pedido vegano = new Pedido("Prato Vegano", 38);
                            nota.add(vegano);

                        }else if (pedido == 4) {
                            System.out.println();
                            Pedido coca = new Pedido("Coca-Cola", 30);
                            nota.add(coca);

                        }else if (pedido == 5) {
                            System.out.println();
                            Pedido cha = new Pedido("Chá Mate com limão", 30);
                            nota.add(cha);

                        } else {
                            System.out.println("Opção inválida! Digite Novamente:");
                        }

                    }

                }catch (InputMismatchException e) {
                    System.out.println("Opção inválida! Digite Novamente:");
                    sc.nextLine();
                }
            } else {
                System.out.println("Opção inválida! Digite apenas 1 para Fazer o pedido e 0 para Sair da plataforma!");
            }
        }catch (InputMismatchException e) {
                System.out.println("Opção inválida! Digite apenas 1 para Fazer o pedido e 0 para Sair da plataforma!");
                sc.nextLine();
            }
        }
    }
}
package conta;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {
            System.out.println(""" 
                    *****************************************************
                                   BANK OF BRAZIL WITH Z
                    *****************************************************
                    
                               1 - Criar conta
                               2 - Listar todas as contas
                               3 - Buscar conta por numero
                               4 - Atualizar Dados da Conta
                               5 - Apagar Conta
                               6 - Sacar
                               7 - Depositar
                               8 - Transferir valores entre Contas
                               9  - Sair
                    
                    *****************************************************
                    Entre com a opção desejada:
                    
                    """);
            int opcao = read.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Criar Conta\n\n");

                    break;
                case 2:
                    System.out.println("Listar todas as Contas\n\n");

                    break;
                case 3:
                    System.out.println("Consultar dados da Conta - por número\n\n");

                    break;
                case 4:
                    System.out.println("Atualizar dados da Conta\n\n");

                    break;
                case 5:
                    System.out.println("Apagar a Conta\n\n");

                    break;
                case 6:
                    System.out.println("Saque\n\n");

                    break;
                case 7:
                    System.out.println("Depósito\n\n");

                    break;
                case 8:
                    System.out.println("Transferência entre Contas\n\n");
                    break;
                case 9:
                    System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
                    sobre();
                    read.close();
                    System.exit(0);
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
        }


    }

    private static void sobre() {
        System.out.println("""
                
                *********************************************************
                Projeto Desenvolvido por:
                Generation Brasil - generation@generation.org
                Github.com/conteudoGeneration
                *********************************************************
                """);
    }
}

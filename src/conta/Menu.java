package conta;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        // Teste da Classe Conta
        Conta c1 = new Conta(1, 123, 1, "Adriana", 10000.0f);
        c1.visualizar();
        c1.sacar(12000.0f);
        c1.visualizar();
        c1.depositar(5000.0f);
        c1.visualizar();

        // Teste da Classe Conta Conrrente
        ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "José da Silva", 0.0f, 1000.0f);
        cc1.visualizar();
        cc1.sacar(12000.0f);
        cc1.visualizar();
        cc1.depositar(5000.0f);
        cc1.visualizar();

        // Teste da Classe Conta Poupança
        ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Maria dos Santos", 100000.0f, 15);
        cp1.visualizar();
        cp1.sacar(1000.0f);
        cp1.visualizar();
        cp1.depositar(5000.0f);
        cp1.visualizar();


        Scanner read = new Scanner(System.in);

        while (true) {
            System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + """
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
                    
                    """ + Cores.TEXT_RESET);
            int opcao = read.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");

                    break;
                case 2:
                    System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");

                    break;
                case 3:
                    System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");

                    break;
                case 4:
                    System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");

                    break;
                case 5:
                    System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");

                    break;
                case 6:
                    System.out.println(Cores.TEXT_WHITE + "Saque\n\n");

                    break;
                case 7:
                    System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");

                    break;
                case 8:
                    System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");
                    break;
                case 9:
                    System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
                    sobre();
                    read.close();
                    System.exit(0);
                default:
                    System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
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

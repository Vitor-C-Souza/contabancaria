package conta;

import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        ContaController contas = new ContaController();

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

        int opcao, numero, agencia, tipo, aniversario;
        String titular;
        float saldo, limite;

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
            try {
                opcao = read.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite valores inteiros!");
                read.nextLine();
                opcao = 0;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Criar Conta\n\n");

                    System.out.println("Digite o Numero da Agência: ");
                    agencia = read.nextInt();
                    System.out.println("Digite o Nome do Titular: ");
                    read.skip("\\R?");
                    titular = read.nextLine();

                    do {
                        System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
                        tipo = read.nextInt();
                    } while (tipo < 1 || tipo > 2);

                    System.out.println("Digite o Saldo da Conta (R$): ");
                    saldo = read.nextFloat();

                    switch (tipo) {
                        case 1 -> {
                            System.out.println("Digite o Limite de Crédito");
                            limite = read.nextFloat();
                            contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
                        }
                        case 2 -> {
                            System.out.println("Digite o dia do Aniversario da Conta: ");
                            aniversario = read.nextInt();
                            contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
                        }
                    }
                    keyPress();
                    break;
                case 2:
                    System.out.println("Listar todas as Contas\n\n");
                    contas.listarTodas();
                    keyPress();
                    break;
                case 3:
                    System.out.println("Consultar dados da Conta - por número\n\n");

                    keyPress();
                    break;
                case 4:
                    System.out.println("Atualizar dados da Conta\n\n");

                    keyPress();
                    break;
                case 5:
                    System.out.println("Apagar a Conta\n\n");

                    keyPress();
                    break;
                case 6:
                    System.out.println("Saque\n\n");

                    keyPress();
                    break;
                case 7:
                    System.out.println("Depósito\n\n");

                    keyPress();
                    break;
                case 8:
                    System.out.println("Transferência entre Contas\n\n");

                    keyPress();
                    break;
                case 9:
                    System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
                    sobre();
                    read.close();
                    System.exit(0);
                default:
                    System.out.println("\nOpção Inválida!\n" + Cores.TEXT_RESET);

                    keyPress();
                    break;
            }
        }


    }

    private static void keyPress() {
        try {
            System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
            System.in.read();

        } catch (IOException e) {
            System.out.println("Você pressionou uma tecla diferente de enter!");
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

import com.sun.source.tree.SwitchTree;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome = "Thiago";
        String tipoConta = "Corrente";
        String saldoInicial= "R$ 2.500,00";
        Double saldo = 2500.00;

        System.out.println("**************************************");
        System.out.println("Dados iniciais do cliente: \n");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo inicial: R$ " + saldoInicial);
        System.out.println("************************************** \n");

        int op = 0;

        while(op != 4){
            switch(op){

                case 0:
                    System.out.println("Operações \n");
                    System.out.println("1- Consultar saldo");
                    System.out.println("2- Receber valor");
                    System.out.println("3- Transferir valor");
                    System.out.println("4- Sair \n");
                    System.out.println("Informe a operação a ser realizada: \n");
                    op = scanner.nextInt();
                    break;

                case 1:
                    System.out.println("Seu saldo é " + saldo + "\n");
                    op = 0;
                    break;

                case 2:
                    System.out.println("Informe o valor do depósito: ");
                    double deposito = scanner.nextDouble();
                    if(deposito > 0){
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso! \n");
                    }else{
                        System.out.println("Erro na operação! \n");
                    }

                    op = 0;
                    break;

                case 3:
                    System.out.println("Informe o valor para transferência: ");
                    double transferencia = scanner.nextDouble();
                    if(transferencia < saldo){
                        saldo -= transferencia;
                        System.out.println("Transferência realizada com sucesso! \n");
                    }else if (transferencia > saldo){
                        System.out.println("Saldo insuficiente para tranferência! \n");
                    }else{
                        System.out.println("Erro ao processar a operação \n");
                    }
                    op = 0;
                    break;

                case 4:
                    op = 4;
                    break;

                default:
                    System.out.println("Houve algum erro!");
                    break;
            }
        }
    }
}
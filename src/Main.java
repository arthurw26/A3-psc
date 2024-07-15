import modules.Interface;
import modules.Locar;
import modules.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locar loc = new Locar();
        Scanner ler = new Scanner(System.in);
        boolean flag = true;

        System.out.println("Bem Vindo ao nosso APP, feito por: Arthur, Fabricio, João Augusto, Kevin e Luiza.");
        while(flag){
            int select;
            System.out.print("\nDigite a opção desejada:" +
                    "\n1-Cadastrar Cliente" +
                    "\n2-Cadastrar Carro" +
                    "\n3-Cadastrar Motorista" +
                    "\n4-Cadastrar Agencia" +
                    "\n5-Alugar" +
                    "\n6-Pagar" +
                    "\n7- Ver Locações" +
                    "\n8- Sair");
            System.out.println();

            select = ler.nextInt();
            switch (select){
                case 1:
                    loc.cadastraCliente();
                    loc.listarClientes();

                    break;

                case 2:
                    loc.addCarros();
                    loc.listarCarros();

                    break;

                case 3:
                    loc.cadastraMotorista();
                    loc.listarMotoristas();

                    break;

                case 4:
                    loc.cadastraAgencia();
                    loc.listarAgencias();

                    break;

                case 5:
                    loc.alugaCarro();
                    loc.listarLocacoes();

                    break;

                case 6:
                    loc.pagar();

                    break;

                case 7:
                    loc.listarLocacoes();

                    break;
                case 8:
                    System.out.println("Obrigado por usar o nosso APP!");
                    System.out.println("Encerrando... ");
                    flag = false;
                    break;

                default:
                    System.out.println("Opção Invalida! Tente Novamente...");

                    break;

            }
        }
    }
}
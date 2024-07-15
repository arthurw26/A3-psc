import modules.Carro;
import modules.Locar;
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
                    "\n7-Sair");
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
                    System.out.println("Em Construção...");

                    break;

                case 7:
                    System.out.println("Obrigado por usar o nosso APP!");
                    System.out.println("Encerrando... ");
                    flag = false;

                    break;

                default:
                    System.out.println("Opção Invalida! Tente Novamente...");

                    break;

            }
        }
        Scanner scanner = new Scanner(System.in);
        int preco = 0, calcao = 0;

        System.out.println("quanto foi o preço total?");
        preco = scanner.nextInt();
        System.out.println("qual foi o calcao da compra?");
        calcao = scanner.nextInt();
        System.out.printf(
                "|qual a forma de pagamento?|\n" +
                "| 1 - cartão               |\n" +
                "| 2 - pix                  |\n");
        int x = scanner.nextInt();
        if(x == 1){
            // cartao
            Cartao cartao = new Cartao();
            cartao.setCalcao(calcao);

            System.out.println("quantas parcelas?");
            int i = scanner.nextInt();
            cartao.setNumeroParcelas(i);

            System.out.println("total do preco das " + cartao.getNumeroParcelas() + " parcelas(diminuindo o calcao) = " + cartao.calcParcelas(preco));
        }else if(x == 2){
            // pix
            Pix pix = new Pix();
            pix.setCalcao(calcao);

            System.out.println("quantos % de desconto?");
            pix.setDesconto(scanner.nextInt());
            scanner.nextLine();

            System.out.println("qual a chave do pix?");
            pix.setChave(scanner.nextLine());

            System.out.println("total do preco a pagar no pix = " +  pix.calcDesconto(preco) + "\nNa chave = " + pix.getChave());
        }else{
            // finalizar programa ou rodar de novo dando erro
        }
    }
}
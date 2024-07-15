import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
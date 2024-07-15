package modules;

import java.util.Scanner;

public class Locar implements Interface {
    Scanner ler = new Scanner(System.in);

    public void alugaCarro(){
        System.out.print("\n --Aluga Carro--");
        listarClientes();
        System.out.print("\nID do Cliente: ");
        int idCliente = ler.nextInt();
        listarCarros();
        System.out.print("\nID do Carro: ");
        int idCarro = ler.nextInt();
        listarMotoristas();
        System.out.print("\nID do Motorista: ");
        int idMotorista = ler.nextInt();
        listarAgencias();
        System.out.print("\nID da Agencia: ");
        int idAgencia = ler.nextInt();
        System.out.println("Quantos dias você ficara com o carro? ");
        int dias = ler.nextInt();
        locacoes.add(new Aluga(carros.get(idCarro), clientes.get(idCliente), motoristas.get(idMotorista), agencias.get(idAgencia), dias));
        carros.get(idCarro).carroLocado();
    }


    public void listarCarros(){
        System.out.print("\n--Lista de Carros--");
        for (int i=0; i < carros.size(); i++) {
            System.out.print("\nID: " + i + " - Carro: " + carros.get(i).toString());

        }

        System.out.print("\n");
    }

    public void listarLocacoes(){
        System.out.print("\n--Lista de Locações--");
        for (int i=0; i < locacoes.size(); i++) {
            System.out.print("\nID: " + i + " - Locacao: " + locacoes.get(i).toString());

        }

        System.out.print("\n");
    }

    public void pagar(){
        int calcao = 0;

        listarLocacoes();
        System.out.println("\nId do carro?");
        int escolha = ler.nextInt();
        int valor = locacoes.get(escolha).getCarro();
        System.out.println();
        int dias = locacoes.get(escolha).getDias();
        System.out.println("qual foi o calcao da compra?");
        calcao = ler.nextInt();
        System.out.printf(
                "|qual a forma de pagamento?|\n" +
                        "| 1 - cartão               |\n" +
                        "| 2 - pix                  |\n");
        int x = ler.nextInt();
        int valorTotal = valor * dias;
        if(x == 1){
            // cartao
            cartao.setCalcao(calcao);

            System.out.println("quantas parcelas?");
            int i = ler.nextInt();
            cartao.setNumeroParcelas(i);
            locacoes.get(escolha).pagou();

            System.out.println("total do preco das " + cartao.getNumeroParcelas() + " parcelas(diminuindo o calcao) = " + cartao.calcParcelas(valorTotal));
        }else if(x == 2){
            // pix
            pix.setCalcao(calcao);

            System.out.println("quantos % de desconto?");
            pix.setDesconto(ler.nextInt());
            ler.nextLine();

            System.out.println("qual a chave do pix?");
            pix.setChave(ler.nextLine());

            System.out.println("total do preco a pagar no pix = " +  pix.calcDesconto(valorTotal) + "\nNa chave = " + pix.getChave());
            locacoes.get(escolha).pagou();
        }
    }

    public void listarAgencias(){
        System.out.print("\n--Lista de Agencias--");
        for (int i=0; i < agencias.size(); i++) {
            System.out.print("\nID: " + i + " - Agencia: " + agencias.get(i).toString());

        }

        System.out.print("\n");
    }

    public void listarClientes(){
        System.out.print("\n--Lista de Clientes--");
        for (int i=0; i < clientes.size(); i++) {
            System.out.print("\nID: " + i + " - Cliente: " + clientes.get(i).toString());

        }

        System.out.print("\n");
    }

    public void listarMotoristas(){
        System.out.print("\n--Lista de Motoristas--");
        for (int i=0; i < motoristas.size(); i++) {
            System.out.print("\nID: " + i + " - Motoristas: " + motoristas.get(i).toString());

        }

        System.out.print("\n");
    }

    public void cadastraCliente() {
        System.out.print("\n--Cadastrar um Cliente--");
        System.out.print("\nNome: ");
        String nome = ler.next();
        System.out.print("Telefone: ");
        String telefone = ler.next();
        System.out.print("CPF ou CNPJ: ");
        String cpf_cnpj = ler.next();

        clientes.add(new Cliente(nome, telefone, cpf_cnpj));
    }

    public void cadastraMotorista() {
        System.out.print("\n--Cadastrar um Motorista--");
        System.out.print("\nNome: ");
        String nome = ler.next();
        System.out.print("Telefone: ");
        String telefone = ler.next();
        System.out.print("CNH: ");
        String cnh = ler.next();
        motoristas.add(new Motorista(nome, telefone, cnh));
    }

    public void cadastraAgencia() {
        System.out.print("\n--Cadastrar uma Agencia--");
        System.out.print("\nNome: ");
        String nome = ler.next();
        System.out.print("Endereço: ");
        String local = ler.next();
        agencias.add(new Agencia(nome, local));
    }

    public void addCarros() {
        System.out.print("\n--Cadastrar um Carro---");
        System.out.print("\nModelo: ");
        String modelo = ler.next();
        System.out.print("Placa: ");
        String placa = ler.next();
        System.out.print("Cor: ");
        String cor = ler.next();
        System.out.print("Tipo de Carro: ");
        String tipo = ler.next();
        System.out.print("Preço: ");
        int preco = ler.nextInt();
        System.out.print("Valor do Seguro: ");
        int seguro = ler.nextInt();
        carros.add(new Tipo(modelo, placa, cor, tipo, preco, seguro));
    }

    public void adicionarMotorista(int idAluga) {
        int opcao = 0;
        while(opcao != 2){
            System.out.println();
        }
    }
}

package modules;

import java.util.Scanner;

public class Locar implements Interface {
    Scanner ler = new Scanner(System.in);
    // Atributos
    //Construtor
    // Metodos

    public void alugaCarro(){
        System.out.print("\n --Aluga Carro--");
        listarClientes();
        System.out.print("\nID do Cliente: ");
        int idCliente = ler.nextInt();
        listarCarros();
        System.out.print("\nID do Carro: ");
        int idCarro = ler.nextInt();
        listarMotoristas();
        System.out.print("\nID do Motorista");
        int idMotorista = ler.nextInt();
        locacoes.add(new Aluga(carros.get(idCarro), clientes.get(idCliente), motoristas.get(idMotorista)));
    }


    public void listarCarros(){
        System.out.print("\nLISTA DE CARROS");
        for (int i=0; i < carros.size(); i++) {
            System.out.print("\nID: " + i + " - Carro: " + carros.get(i).toString());
        }
        System.out.print("\n");
    }
    public void listarLocacoes(){
        System.out.print("\nLISTA DE LOCACOES");
        for (int i=0; i < locacoes.size(); i++) {
            System.out.print("\nID: " + i + " - Locacao: " + locacoes.get(i).toString());
        }
        System.out.print("\n");
    }
    public void listarClientes(){
        System.out.print("\nLISTA DE CLIENTES");
        for (int i=0; i < clientes.size(); i++) {
            System.out.print("\nID: " + i + " - Cliente: " + clientes.get(i).toString());
        }
        System.out.print("\n");
    }

    public void listarMotoristas(){
        System.out.print("\nLISTA DE MOTORISTAS");
        for (int i=0; i < motoristas.size(); i++) {
            System.out.print("\nID: " + i + " - MOTORISTAS: " + motoristas.get(i).toString());
        }
        System.out.print("\n");
    }

    public void cadastraCliente() {
        System.out.print("\nCADASTRO CLIENTE");
        System.out.print("\nNome: ");
        String nome = ler.next();
        System.out.print("Telefone: ");
        String telefone = ler.next();
        System.out.print("CPF ou CNPJ: ");
        String cpf_cnpj = ler.next();
        clientes.add(new Cliente(nome, telefone, cpf_cnpj));
    }

    public void cadastraMotorista() {
        System.out.print("\n--cadastra motorista--");
        System.out.print("\nnome: ");
        String nome = ler.next();
        System.out.print("Telefone: ");
        String telefone = ler.next();
        System.out.print("CNH: ");
        String cnh = ler.next();
        motoristas.add(new Motorista(nome, telefone, cnh));
    }

    public void addCarros() {
        System.out.print("\nCADASTRA CARRO");
        System.out.print("\nModelo: ");
        String modelo = ler.next();
        System.out.print("Placa: ");
        String placa = ler.next();
        System.out.print("Cor: ");
        String cor = ler.next();
        System.out.print("Esta Locado: (true/false)");
        boolean locado = ler.nextBoolean();
        carros.add(new Carro(modelo, placa, cor, locado));
    }

    public void adicionarMotorista(int idAluga) {
        int opcao = 0;
        while(opcao != 2){
            System.out.println();
        }
    }
}

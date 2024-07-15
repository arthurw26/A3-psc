package modules;

import java.util.ArrayList;

public class Aluga {
    private Tipo carro;
    private Cliente cliente;
    private Motorista motorista;
    private Agencia agencia;

    private int dias;

    private boolean pago;

    public Aluga(Tipo carro, Cliente cliente, Motorista motorista, Agencia agencia, int dias) {
        this.carro = carro;
        this.cliente = cliente;
        this.motorista = motorista;
        this.agencia = agencia;
        this.pago = false;
        this.dias = dias;
    }

    public int getCarro() {
        int preco = 0;
        preco = carro.getPreço();
        return preco;
    }
    public void pagou(){
        this.pago = true;
        System.out.println("Pagamento foi um Sucesso!");
    }

    public int getDias(){
        return dias;
    }

    @Override
    public String toString() {
        return "Locação: " +
                "carro=" + carro +
                "\nCliente=" + cliente +
                "\nMotorista=" + motorista +
                "\nAgencia=" + agencia +
                "\nPago=" + pago +
                '.';
    }
}

package modules;

import java.util.ArrayList;

public class Aluga {
    private Carro carro;
    private Cliente cliente;
    private Motorista motorista;
    private Agencia agencia;

    public Aluga(Carro carro, Cliente cliente, Motorista motorista, Agencia agencia) {
        this.carro = carro;
        this.cliente = cliente;
        this.motorista = motorista;
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return "Locação[" +
                "carro=" + carro +
                "\nCliente=" + cliente +
                "\nMotorista=" + motorista +
                "\nAgencia=" + agencia +
                ']';
    }
}

package modules;

import java.util.ArrayList;

public class Aluga {
    private Carro carro;
    private Cliente cliente;
    private Motorista motorista;

    public Aluga(Carro carro, Cliente cliente, Motorista motorista) {
        this.carro = carro;
        this.cliente = cliente;
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        return "Aluga{" +
                "carro=" + carro +
                ", cliente=" + cliente +
                ", motorista=" + motorista +
                '}';
    }
}

package modules;

public class Tipo extends Carro{
    private int preço;

    private int ValorSeguro;

    public Tipo(String modelo, String placa, String cor, boolean locado, int preço, int valorSeguro) {
        super(modelo, placa, cor, locado);
        this.preço = preço;
        ValorSeguro = valorSeguro;
    }

}

package modules;

public class Tipo extends Carro{
    private int preço;

    private int ValorSeguro;

    public Tipo(String modelo, String placa, String cor, String tipo, int preço, int valorSeguro) {
        super(modelo, placa, cor, tipo);
        this.preço = preço;
        ValorSeguro = valorSeguro;
    }



    @Override
    public String toString() {
        return "Carro[" +
                "modelo=" + getModelo() +
                ", placa=" + getPlaca() +
                ", cor=" + getCor() +
                ", locado=" + isLocado() +
                ", preço=" + preço +
                ", ValorSeguro=" + ValorSeguro +
                ']';
    }
}

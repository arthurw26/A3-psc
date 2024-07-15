package modules;

public class Carro {
    private String modelo;

    private String placa;

    private String cor;

    private String tipo;

    private boolean locado;


    public Carro(String modelo, String placa, String cor, String tipo) {
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.tipo = tipo;
        this.locado = false;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isLocado() {
        return locado;
    }

    public void setLocado(boolean locado) {
        this.locado = locado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void carroLocado(){
        this.locado = true;
        System.out.println("O Carro está locado, esperando o Pagamento... ");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", locado=" + locado;
    }

}

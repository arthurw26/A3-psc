package modules;

import java.util.ArrayList;
import java.util.List;

public class Carro {
    private String modelo;

    private String placa;

    private String cor;
    private  String tipo;

    private boolean locado;

    private List<Motorista> motoristas = new ArrayList<>();


    public Carro(String modelo, String placa, String cor, boolean locado) {
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.locado = locado;
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

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", locado=" + locado +
                ", motorista=" + motoristas +
                '}';
    }

    public List<Motorista> getMotoristas() {
        return motoristas;
    }

    public void setMotoristas(List<Motorista> motoristas) {
        this.motoristas = motoristas;
    }
}

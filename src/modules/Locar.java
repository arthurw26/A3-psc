package modules;

import java.util.ArrayList;

public class Locar {
    // Atributos
    private ArrayList<Motorista> motoristas = new ArrayList<>();
    private ArrayList<Agencia> agencias = new ArrayList<>();
    private ArrayList<Carro> carros = new ArrayList<>();


    //Construtor
    public Locar(ArrayList<Motorista> motoristas, ArrayList<Agencia> agencias, ArrayList<Carro> carros) {
        this.motoristas = motoristas;
        this.agencias = agencias;
        this.carros = carros;
    }

    // Metodos
    

    //Getters And Setters
    public ArrayList<Motorista> getMotoristas() {
        return motoristas;
    }

    public void setMotoristas(ArrayList<Motorista> motoristas) {
        this.motoristas = motoristas;
    }

    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }

    public void setAgencias(ArrayList<Agencia> agencias) {
        this.agencias = agencias;
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }
}

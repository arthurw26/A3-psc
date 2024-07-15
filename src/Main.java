import modules.Carro;
import modules.Locar;

public class Main {
    public static void main(String[] args) {
        Locar loc = new Locar();

        loc.addCarros();
        loc.addCarros();

        loc.cadastraCliente();

        loc.cadastraMotorista();
        loc.listarMotoristas();

        loc.alugaCarro();
        loc.listarLocacoes();

    }
}
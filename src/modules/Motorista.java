package modules;

public class Motorista extends Pessoa{
    private String cnh;

    public Motorista(String nome, String telefone, String cnh) {
        super(nome, telefone);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }
}
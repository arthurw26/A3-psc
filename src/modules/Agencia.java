package modules;

public class Agencia {
    private String nome;
    private String local;

    public Agencia(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Agencia[" +
                "nome='" + nome + '\'' +
                ", local='" + local + '\'' +
                ']';
    }
}

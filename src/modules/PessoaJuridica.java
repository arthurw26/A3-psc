package modules;

public class PessoaJuridica extends Pessoa{
    private String Cnopj;

    public String getCnopj() {
        return Cnopj;
    }

    public void setCnopj(String cnopj) {
        Cnopj = cnopj;
    }

    public PessoaJuridica(String nome, String telefone, String cnopj) {
        super(nome, telefone);
        Cnopj = cnopj;
    }
}


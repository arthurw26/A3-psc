import java.util.Scanner;
public class Pessoa {
    private String nome;
    private String telefone;

    private Integer tipoPessoa;


    public Pessoa(String Nome, String Telefone, Integer TipoPessoa) {
        this.nome = Nome;
        this.telefone = Telefone;
        this.tipoPessoa = TipoPessoa;
    }
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public Integer getTipoPessoa() {
        return tipoPessoa;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public void setTelefone(String Telefone) {
        this.telefone = Telefone;
    }

    public void setTipoPessoa(Integer TipoPessoa) {
        this.tipoPessoa = TipoPessoa;
    }
}

package modules;

public class Cliente extends Pessoa{
    private String cpf_cnpj;


    public Cliente(String nome, String telefone, String cpf_cnpj) {
        super(nome, telefone);
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    @Override
    public String toString() {
        return "Cliente[" +
                "nome='" + getNome() + '\'' +
                " telefone='" + getTelefone() + '\'' +
                " cpf_cnpj='" + cpf_cnpj + '\'' +
                ']';
    }
}

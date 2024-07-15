package modules;

public class Cliente extends Pessoa{
    private String cpf_cnpj;


    public Cliente(String nome, String telefone, String cpf_cnpj) {
        super(nome, telefone);
        this.cpf_cnpj = cpf_cnpj;
    }
}

package modules;
public class Pix extends Pagamento {
    String chave;
    Integer desconto;

    public String getChave(){
        return chave;
    }
    public Integer getDesconto(){
        return desconto;
    }

    public void setChave(String Chave){
        this.chave = Chave;
    }
    public void setDesconto(Integer Desconto){
        this.desconto = Desconto;
    }

    public Integer calcDesconto(Integer preco){
        int desconto = (preco - (preco * this.getDesconto() / 100)) - this.getCalcao();

        return desconto;
    }
}

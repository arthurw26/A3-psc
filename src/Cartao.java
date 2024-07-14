public class Cartao extends Pagamento{
    double parcela;
    Integer numeroParcelas;

    public double getParcela()`{
        return parcela;
    }
    public Integer getNumeroParcelas(){
        return numeroParcelas;
    }

    public void setParcela(double Parcela){
        this.parcela = Parcela;
    }
    public void setNumeroParcelas(Integer NumeroParcelas){
        this.numeroParcelas = NumeroParcelas;
    }

//     public function formaPagamento(){

//     }
}

package Atividade02;

public class Comissionado extends Funcionario{
    private float totalVenda;
    private float percentualComissao;

    public Comissionado(String nome, String cpf){
        super(nome, cpf);
    }

    public void setTotalVenda(float totalVenda) {
        this.totalVenda = totalVenda;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    @Override
        public float vencimento() {
        return totalVenda * (percentualComissao / 100);
    }
}

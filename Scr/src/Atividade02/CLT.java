package Atividade02;

// extend é para herdar da classe funcionario
public class CLT extends Funcionario{
    private float salarioMensal;

    //super chama o contrutor da classe pai
    public CLT(String nome, String cpf){
        super(nome, cpf);
    }

    //setter permite definir ou modificar o valor de um atribulo (encapsulamento)
    public void setSalarioMensal(float salarioMensal1){
        this.salarioMensal = salarioMensal1;
    }

    //override permite substituir o comportamento padrão herdado pela classe pai
    @Override
        public float vencimento(){
        return salarioMensal;
    }
}

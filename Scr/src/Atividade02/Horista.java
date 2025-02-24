package Atividade02;

public class Horista extends Funcionario{
    private float salarioHora;
    private int horasTrabalhadas;

    public Horista(String nome, String cpf){
        super(nome, cpf);
    }

    public void setSalarioHora(float salarioHora){
        this.salarioHora = salarioHora;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public float vencimento() {
        return salarioHora * horasTrabalhadas;
    }
}

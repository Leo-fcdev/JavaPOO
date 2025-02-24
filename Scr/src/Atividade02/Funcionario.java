package Atividade02;

//classe base
public abstract class Funcionario {
    String nome;
    String cpf;

    //Contrutor
    public Funcionario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    //metodo get acessa atributo privado
    public String getNome(){
        return nome;
    }

    //abstract serve para garantir que cada funcionario implemente sua logica de vencimento
    public abstract float vencimento();
}

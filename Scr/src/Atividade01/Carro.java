package Atividade01;

public class Carro {
    //Atributos
    String marca;
    String modelo;
    int ano;
    float velocidadeAtual;

    //Construtor
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    //Metodo
    void acelerar(){
        velocidadeAtual += 10;
    }
    void freiar(){
        velocidadeAtual -= 10;
        if (velocidadeAtual < 0){
            velocidadeAtual = 0;
        }
    }
    void exibirInfo(){
        System.out.println("Á marca do carro é: " + marca);
        System.out.println("O modelo do carro é: " + modelo);
        System.out.println("O ano do carro é: " + ano);
        System.out.println("Sua velocidade Atual é: " + velocidadeAtual);
    }
}

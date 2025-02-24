package Atividade01;

public class Concessionaria {
    public static void main(String[] args) {
        //Objeto
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022);

        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();

        meuCarro.freiar();
        meuCarro.freiar();

        meuCarro.exibirInfo();
    }
}

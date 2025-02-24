package Atividade02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Pede ao usuario para preencher as informações
        System.out.println("Cadastro do funcionario CLT: ");
        System.out.print("Digite o nome: ");
        String nomeClt = sc.next();
        System.out.print("Digite o cpf: ");
        String cpfClt = sc.next();

        //Cria o objeto utilizando o construtor da classe pai
        CLT funcionarioClt = new CLT(nomeClt, cpfClt);
        System.out.print("Digite o salário do funcionario: ");
        float salarioMensal = sc.nextFloat();
        funcionarioClt.setSalarioMensal(salarioMensal);

        sc.nextLine();

        System.out.println("\nCadastro do funcionario Horista: ");
        System.out.print("Digite o nome: ");
        String nomeHorista = sc.next();
        System.out.print("Digite o cpf: ");
        String cpfHorista = sc.next();

        Horista funcionarioHorista = new Horista(nomeHorista, cpfHorista);
        System.out.print("Digite o Salário por hora: ");
        float salarioHora = sc.nextFloat();
        funcionarioHorista.setSalarioHora(salarioHora);

        sc.nextLine();

        System.out.println("\nCadastro do funcionario Comissionado: ");
        System.out.print("Digite o nome: ");
        String nomeComissionado = sc.next();
        System.out.print("Digite o cpf: ");
        String cpfComissionado = sc.next();

        Comissionado funcionarioComissionado = new Comissionado(nomeComissionado, cpfComissionado);

        System.out.print("Digite o total de vendas: ");
        float totalVenda = sc.nextFloat();
        funcionarioComissionado.setTotalVenda(totalVenda);

        System.out.print("Digite o percentual da comissão: ");
        float percentualComissao = sc.nextFloat();
        funcionarioComissionado.setPercentualComissao(percentualComissao);

        System.out.println("\n ---Vencimento dos funcionarios---");
        System.out.println("Funcionario Clt: " + funcionarioClt.getNome() + " - vencimento R$ " + funcionarioClt.vencimento());
        System.out.println("Funcionario Horista: " + funcionarioHorista.getNome() + " - vencimento R$ " + funcionarioHorista.vencimento());
        System.out.println("Funcionario Comissionado: " + funcionarioComissionado.getNome() + " - vencimento R$ " + funcionarioComissionado.vencimento());

        sc.close();
    }
}

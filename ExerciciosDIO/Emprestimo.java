package ExerciciosDIO;

import java.util.Scanner;

public class Emprestimo {
    static float juros;
    static int qntParcelas ;
    static int valorEmprestimo;
    static float valorTotalcJuros;
    static float valorFixoParcelas;

    public static void  main(String[] args) throws Exception {
        solicitaDados();
        calculaValorTotal();
        calculaValorParcela();
        System.out.println("Juros: "+juros);
        System.out.println("Quantidade de Parcelas: "+qntParcelas);
        System.out.println("Valor do emprestimo: "+valorEmprestimo);
        System.out.println("Valor total a ser pago: "+valorTotalcJuros);
        System.out.println("Valor fixo mensal: "+valorFixoParcelas);
    }

    private static void calculaValorTotal() {
        float valordoJuros = (juros/100) * valorEmprestimo * qntParcelas;
        valorTotalcJuros = valorEmprestimo+valordoJuros;
    }

    private static void calculaValorParcela() {
        valorFixoParcelas = valorTotalcJuros/qntParcelas;
    }


    public static void solicitaDados() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor do emprestimo: ");
        valorEmprestimo = ler.nextInt();
        System.out.println("Digite a quantidade de parcelas: ");
        qntParcelas = ler.nextInt();
        System.out.println("Digite o juros: ");
        juros = ler.nextInt();
        ler.close();
    }
}


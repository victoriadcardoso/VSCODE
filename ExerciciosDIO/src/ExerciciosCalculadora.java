package ExerciciosDIO.src;

import java.util.Scanner;

public class ExerciciosCalculadora {
    public static void main(String[] args) throws Exception {   
     
        int a;
        int b;

        int resultadoSoma;
        int resultadoMultiplicacao;
        int resultadoSubtracao;
        int resultadoDivisao;


        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        a = ler.nextInt();
        System.out.println("Digite o segundo número: ");
        b = ler.nextInt();
        ler.close();
        resultadoSoma = somar(a, b);
        resultadoSubtracao = subtrair(a, b);
        resultadoMultiplicacao = multiplicar(a, b);
        resultadoDivisao = dividir(a, b);

        System.out.println("Resultado soma: " + resultadoSoma);
        System.out.println("Resultado multiplicacao: " + resultadoMultiplicacao);
        System.out.println("Resultado subtracao: " + resultadoSubtracao);
        System.out.println("Resultado divisao: " + resultadoDivisao);

    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;

    }

    public static int dividir(int a, int b) {
        return a / b;
    }

}
 
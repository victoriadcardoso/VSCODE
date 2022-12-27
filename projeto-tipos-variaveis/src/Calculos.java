public class Calculos {
    public static void main(String[] args) throws Exception {
              
        int a,b;
        a = 5;
        b = 5;
        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        int divisao = a/b;
        System.out.println(divisao);
        calcularMultiplicacao(a, b);

    }
     
    public static void calcularMultiplicacao (int a, int b ) {
      int multiplicacao = a*b;
      int soma = a+b;
      int subtracao = a-b;

      System.out.println(multiplicacao);
      System.out.println(soma);
      System.out.println(subtracao);
         
    }
     
    
    }

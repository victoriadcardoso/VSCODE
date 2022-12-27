package ExerciciosDIO;

import java.util.Scanner;

public class Cumprimento {
    public static void  main(String[] args) throws Exception {
        int hora = informarHora();
        mensagemAdequada(hora);
    }

    public static int informarHora(){
        System.out.println("Informe a hora :");
        try (Scanner scan = new Scanner(System.in)) {
            return scan.nextInt();
        } 
    }

    public static void mensagemAdequada(int hora) {
        if (hora > 1 && hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora > 12 && hora <= 18) {
            System.out.println("Boa tarde!");
        } else if (hora > 18 && hora <= 24) {
            System.out.println("Boa noite");
        }
    }
}

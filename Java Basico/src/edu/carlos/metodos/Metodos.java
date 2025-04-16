package edu.carlos.metodos;

public class Metodos {
    public static void main(String[] args) {
        // Método para calcular a soma de dois números
        int a = 5;
        int b = 10;
        int resultadoSoma = soma(a, b);
        System.out.println("Resultado da soma: " + resultadoSoma);

               // Método para calcular a média de três números
        double media = media(7.5, 8.0, 9.0);
        System.out.println("Média: " + media);

        // Método para verificar se um número é par ou ímpar
        int numero = 15;
        String resultado = verificaParOuImpar(numero);
        System.out.println("O número " + numero + " é " + resultado);
    }

    public static String verificaParOuImpar(int numero) {
        if (numero % 2 == 0) {
            return "par";
        } else {
            return "ímpar";
        }
    }

    public static int soma (int a, int b) {
        return a + b;
    }

    public static double media (double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
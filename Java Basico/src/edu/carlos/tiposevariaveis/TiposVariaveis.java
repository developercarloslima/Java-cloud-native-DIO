package edu.carlos.tiposevariaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        // Tipos primitivos
        // Tipos numéricos inteiros
        byte b = 10; // 8 bits
        short s = 1000; // 16 bits
        int i = 100000; // 32 bits
        long l = 100000L; // 64 bits

        // Tipos numéricos reais
        float f = 10.5f; // 32 bits
        double d = 10000.5; // 64 bits

        // Tipo caractere
        char c = 'A'; // 16 bits

        // Tipo booleano
        boolean bool = true; // 1 bit

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        //Variaveis e constante

        // Variáveis
        int idade = 30; // Variável inteira
        String nome = "Carlos"; // Variável string

        //casting 
        // Casting de int para byte
        byte idadeByte = (byte) idade; // Casting explícito 
        // Casting de double para int
        int idadeInt = (int) d; // Casting explícito
        
        // constantes
        final int ANO_NASCIMENTO = 1990; // Constante inteira
        final String NOME_COMPLETO = "Carlos Lima"; // Constante string
    }
}

package edu.carlos.operadores;

public class Operadores {
    public static void main(String[] args) {
        // Operadores Aritméticos
        int a = 10; // operador de atribuição
        int b = 20;
        int soma = a + b; // Adição
        int subtracao = a - b; // Subtração
        int multiplicacao = a * b; // Multiplicação
        double divisao = (double) a / b; // Divisão
        int modulo = a % b; // Módulo

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo);

        // Operadores Relacionais
        boolean maiorQue = a > b; // Maior que
        boolean menorQue = a < b; // Menor que
        boolean igual = a == b; // Igualdade
        boolean diferente = a != b; // Diferente
        boolean maiorOuIgual = a >= b; // Maior ou igual
        boolean menorOuIgual = a <= b; // Menor ou igual

        System.out.println("Maior que: " + maiorQue);
        System.out.println("Menor que: " + menorQue);
        System.out.println("Igual: " + igual);
        System.out.println("Diferente: " + diferente);
        System.out.println("Maior ou igual: " + maiorOuIgual);
        System.out.println("Menor ou igual: " + menorOuIgual);

        // Operadores Lógicos
        boolean e = (a > 5 && b < 30); // E lógico
        boolean ou = (a < 5 || b > 15); // Ou lógico
        boolean nao = !(a == 10); // Não lógico

        
        System.out.println("E lógico: " + e);
        System.out.println("Ou lógico: " + ou);
        System.out.println("Não lógico: " + nao);

        //Operadores unarios
        int x = 10;
        int y = 20;     
        int z = 30;
        int resultado = x++ + --y + z-- + ++x; // 10 + 19 + 30 + 12 = 71
        // x = 12, y = 19, z = 29
        System.out.println("Resultado: " + resultado);
        System.out.println("x: " + x); // 12
        System.out.println("y: " + y); // 19
        System.out.println("z: " + z); // 29
        System.out.println("Resultado: " + resultado); // 71

        // Operadores de Atribuição
        int num = 10; // Atribuição simples
        num += 5; // Atribuição com adição (num = num + 5)  
        num -= 3; // Atribuição com subtração (num = num - 3)
        num *= 2; // Atribuição com multiplicação (num = num * 2)
        num /= 4; // Atribuição com divisão (num = num / 4)
        num %= 3; // Atribuição com módulo (num = num % 3)
        System.out.println("Resultado final: " + num); // 1
        // Operadores de Incremento e Decremento
        int i = 5;
        i++; // Incremento (i = i + 1)
        System.out.println("Incremento: " + i); // 6
        i--; // Decremento (i = i - 1)
        System.out.println("Decremento: " + i); // 5
        // Operador Ternário
        int c = 30;
        int d = 20;
        int maior = (c > d) ? c : d; // Se c for maior que d, maior recebe c, caso contrário, recebe d
        System.out.println("Maior:" + maior); 





    }
    
}

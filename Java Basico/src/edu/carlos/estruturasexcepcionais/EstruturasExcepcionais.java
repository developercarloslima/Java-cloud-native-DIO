package edu.carlos.estruturasexcepcionais;

import java.util.Scanner;
import java.util.InputMismatchException;



public class EstruturasExcepcionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, resultado;

        try {
            System.out.print("Digite o primeiro número: ");
            num1 = scanner.nextInt();
            System.out.print("Digite o segundo número: ");
            num2 = scanner.nextInt();
            resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira números inteiros.");
        } finally {
            scanner.close();
        }
    }
}
package edu.carlos.estruturascondicionais;

public class CondicionaisComposta {
    public static void main(String[] args) {
        // Exemplo de uso de condicionais compostas
        int numero = -5;

        // Verifica se o número é positivo, negativo ou zero
        if (numero > 0) {
            System.out.println("O número " + numero + " é positivo.");
        } else if (numero < 0) {
            System.out.println("O número " + numero + " é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
    }
        // Exemplo de uso de condicionais encadeadas
   /*  public static void ResultadoEscolar(double nota){
        if(nota >= 6){
            System.out.println("Aprovado");
        }else if(nota >= 4 && nota < 6){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }
        
    } */

    public void ResultadoEscolar(){
        int nota = 6;
        String resultado = nota >= 6 ? "Aprovado" : nota >= 4 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println("Resultado: " + resultado);
    }
    
}



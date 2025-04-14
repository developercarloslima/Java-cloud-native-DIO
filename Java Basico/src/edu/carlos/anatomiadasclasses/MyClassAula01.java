package edu.carlos.anatomiadasclasses;

// Aula 01 - Anatomia das Classes
public class MyClassAula01 {
    public static void main(String[] args) {
        
        String primeiroNome = "Carlos";
        String segundoNome = "Lima";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    
}
    
        public static String nomeCompleto(String primeiroNome, String segundoNome) {
            return "Resultado da aula01 " + primeiroNome + " " + segundoNome;
        }

}


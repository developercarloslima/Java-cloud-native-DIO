package edu.carlos.estrturaderep;


public class EstruturaRepeticao {
    public static void main(String[] args) {
        // Estruturas de repetição
        // while, do while, for
        
        // for
        for (int k = 0; k <= 10; k++) {
            System.out.println("Valor de k: " + k);
         
        }
        // for com arrays
        String[] nomes = {"Carlos", "Ana", "João"};
        for (int x = 0; x < nomes.length; x++) {
            System.out.println("Nome no indice x =" + x + " é " + nomes[x]);
        }

        // for each
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }


        // while
        int i = 0;
        while (i < 10) {
            System.out.println("Valor de i: " + i);
            i++;
        }

        // do while
        int j = 0;
        do {
            System.out.println("Valor de j: " + j);
            j++;
        } while (j < 10);

    }
    
}





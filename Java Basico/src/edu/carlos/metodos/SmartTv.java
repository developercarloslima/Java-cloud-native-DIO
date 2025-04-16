package edu.carlos.metodos;
import java.util.Scanner;

public class SmartTv {
    boolean ligada = false;
    int volume = 25;

    public void ligar() {
        ligada = true;
        System.out.println("A TV está ligada. Bem vindo!");
    }

    public void desligar() {
        ligada = false;
       
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void mudarCanal() {
        System.out.println("escolha seu canal? ");
        Scanner scanner = new Scanner(System.in);
        int novoCanal = scanner.nextInt();
        System.out.println("Canal: " + novoCanal);
    }

    public void mostrarStatus() {
        if (ligada) {            
            System.out.println("A TV está ligada, deseja desligar?");
            Scanner scanner = new Scanner(System.in);
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("sim")) {
                desligar();
                System.out.println("A TV está desligada.");
            } else {
                System.out.println("A TV continua ligada.");
                SmartTv smartTv = new SmartTv();
                smartTv.mudarCanal();
                smartTv.aumentarVolume();
                smartTv.diminuirVolume();
            }
        } else {
            System.out.println("A TV está desligada. Deseja ligar?");
            Scanner scanner = new Scanner(System.in);
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("sim")) {
                ligar();
                SmartTv smartTv = new SmartTv();
                smartTv.mudarCanal();
                smartTv.aumentarVolume();
                smartTv.diminuirVolume();
            } else {
                System.out.println("A TV continua desligada.");
            }
          
        }
        
    }
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        smartTv.mostrarStatus();    
}
}
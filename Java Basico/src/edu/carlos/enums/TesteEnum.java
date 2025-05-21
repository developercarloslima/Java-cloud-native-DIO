package edu.carlos.enums;

public class TesteEnum {   
        public static void main(String[] args) {
            for (EstadosBrasileiro estado : EstadosBrasileiro.values()) {
                System.out.println(estado.getNome() + " - " + estado.getSigla());
            }
        }
    }
    


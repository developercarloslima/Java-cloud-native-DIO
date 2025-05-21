package edu.carlos.classes;


public class Classes {
    public static void main(String[] args) {
        System.out.println("Hello, Carlos!");
    
    }

    //classe model

    public class Carro {
        String modelo;
        String cor;
        int ano;
        double preco;

        public Carro(String modelo, String cor, int ano, double preco) {
            this.modelo = modelo;
            this.cor = cor;
            this.ano = ano;
            this.preco = preco;
        }

        public void exibirInfo() {
            System.out.println("Modelo: " + modelo);
            System.out.println("Cor: " + cor);
            System.out.println("Ano: " + ano);
            System.out.println("Preço: " + preco);
        }
    }


    //classe service

    public class CarroService {
        public void calcularDesconto(Carro carro, double percentual) {
            double desconto = carro.preco * percentual / 100;
            double precoComDesconto = carro.preco - desconto;
            System.out.println("Preço com desconto: " + precoComDesconto);
        }
    }
    //classe controller
    public class CarroController {
        private Carro carro;
        private CarroService carroService;

        public CarroController(Carro carro) {
            this.carro = carro;
            this.carroService = new CarroService();
        }

        public void aplicarDesconto(double percentual) {
            carroService.calcularDesconto(carro, percentual);
        }
    }

    //classe view
    public class CarroView {
        public void mostrarInfo(Carro carro) {
            carro.exibirInfo();
        }
    }

    // classe util
    public class CarroUtil {
        public static String formatarPreco(double preco) {
            return String.format("R$ %.2f", preco);
        }
    }

   
}
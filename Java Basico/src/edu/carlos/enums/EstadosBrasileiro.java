package edu.carlos.enums;

public enum EstadosBrasileiro{
        SAO_PAULO("SP", "São Paulo"),
        RIO_DE_JANEIRO("RJ", "Rio de Janeiro"),
        MINAS_GERAIS("MG", "Minas Gerais")
        ;

        private String sigla;
        private String nome;

        private EstadosBrasileiro(String sigla, String nome) {
            this.sigla = sigla;
            this.nome = nome;
        }

        public String getSigla() {
            return sigla;
        }
        public String getNome() {
            return nome;
        }

        
}




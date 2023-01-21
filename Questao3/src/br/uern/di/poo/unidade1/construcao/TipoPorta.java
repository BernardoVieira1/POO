package br.uern.di.poo.unidade1.construcao;

public enum TipoPorta {
    PORTA_SIMPLES("Compensado", "Simples", 50), PORTA_PADRAO("Andiroba", "Encaixe", 140), PORTA_LUXO("Ipê","Tetra",350);

    private String madeira;
    private String fechadura;
    private double valor;

    private TipoPorta(String madeira, String fechadura, double valor) {
        this.madeira = madeira;
        this.fechadura = fechadura;
        this.valor = valor;
    }

    public String getMadeira() {
        return madeira;
    }

    public String getFechadura() {
        return fechadura;
    }

    public double getValor() {
        return valor;
    }

}

package br.uern.di.poo.unidade1.construcao;

public class Porta {
    private TipoPorta tipoPorta;
    private double altura, largura;
    private boolean pivotante;
    private final double pivotanteOk = 350;  
    private final double alturaPadrao = 1.8;  
    private final double larguraPadrao = 0.7;
    
    public Porta() {
        this.tipoPorta = tipoPorta.PORTA_SIMPLES;
        this.altura = alturaPadrao;
        this.largura = larguraPadrao;
        this.pivotante = false;
    }
    
    public Porta(TipoPorta tipoPorta, double altura, double largura, boolean pivotante) {
        this.tipoPorta = tipoPorta;
        this.altura = altura;
        this.largura = largura;
        this.pivotante = pivotante;
    }

    public TipoPorta getTipoPorta() {
        return tipoPorta;
    }

    public void setTipoPorta(TipoPorta tipoPorta) {
        this.tipoPorta = tipoPorta;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public boolean isPivotante() {
        return pivotante;
    }

    public void setPivotante(boolean pivotante) {
        this.pivotante = pivotante;
    }

    public double getPivotanteOk() {
        return pivotanteOk;
    }

    public double getAlturaPadrao() {
        return alturaPadrao;
    }

    public double getLarguraPadrao() {
        return larguraPadrao;
    }  

    public double calculaPreco(Porta porta){
        if(porta.tipoPorta == TipoPorta.PORTA_SIMPLES){
            if(porta.pivotante != false){
                return (((porta.largura * porta.altura) * TipoPorta.PORTA_SIMPLES.getValor()) + pivotanteOk);

            }
            return ((porta.largura * porta.altura)*TipoPorta.PORTA_SIMPLES.getValor());
        }else if(tipoPorta == TipoPorta.PORTA_PADRAO){
            if(porta.pivotante != false){
                return (((porta.largura * porta.altura) * TipoPorta.PORTA_PADRAO.getValor()) + pivotanteOk) ;

            }
            return ((porta.largura * porta.altura)*TipoPorta.PORTA_PADRAO.getValor());
        }else{
            if(porta.pivotante != false){
                return (((porta.largura * porta.altura) * TipoPorta.PORTA_LUXO.getValor()) + pivotanteOk) ;

            }
            return ((porta.largura * porta.altura)*TipoPorta.PORTA_LUXO.getValor());
        }
    };

    public void exibePorta(Porta porta){
        System.out.println("Tipo de madeira: " + porta.getTipoPorta().getMadeira());
        System.out.println("Tipo de fechadura: " + porta.getTipoPorta().getFechadura());
        System.out.println("Preço por metro quadrado: R$" + porta.getTipoPorta().getValor());
        System.out.println("Com " + porta.getAltura() + "m de altura e " + porta.getLargura()+ "m de largura");
    }




}

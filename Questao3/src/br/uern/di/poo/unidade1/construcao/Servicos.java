package br.uern.di.poo.unidade1.construcao;

public class Servicos {
    private final static double perLuxo = 0.1;
    private final static double instalPorta = 70;
    private final static double instalPortaPivotante = 250;

    public Servicos() {
    }

    public static double getPerluxo() {
        return perLuxo;
    }

    public static double getInstalporta() {
        return instalPorta;
    }

    public static double getInstalportapivotante() {
        return instalPortaPivotante;
    }

    public static double calculaServico(Porta porta){
        if(porta.getTipoPorta() == TipoPorta.PORTA_SIMPLES){
            if(porta.isPivotante()){
                return (((porta.getAltura() * porta.getLargura())*instalPorta)+instalPortaPivotante);
            }else{
                return (((porta.getAltura() * porta.getLargura())*instalPorta));
            }
        }else if(porta.getTipoPorta() == TipoPorta.PORTA_PADRAO){
            if(porta.isPivotante()){
                return (((porta.getAltura() * porta.getLargura())*instalPorta)+instalPortaPivotante);
            }else{
                return (((porta.getAltura() * porta.getLargura())*instalPorta));
            }
        }else{
            double result;
            if(porta.isPivotante()){
                result = (((porta.getAltura() * porta.getLargura())*instalPorta)+instalPortaPivotante);
                return (result = result + ((result * perLuxo) / 100));
            }else{
                result = ((porta.getAltura() * porta.getLargura())*instalPorta);
                return (result = result + ((result * perLuxo) / 100));
            }
        }
    }



    
}

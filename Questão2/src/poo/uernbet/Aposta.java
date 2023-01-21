package poo.uernbet;

public class Aposta {
    private Evento evento;
    private Resultado resultado;
    private double valor;

    public Aposta(Evento evento, Resultado result, float valor) {
        this.evento = evento;
        this.resultado = result;
        this.valor = valor;
    }

    public Evento getEvento() {
        return evento;
    }
    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    public Resultado getResultado() {
        return resultado;
    }
    public void setResultado(Resultado result) {
        this.resultado = result;
    }
    public double getValorApostado() {
        return valor;
    }
    public void setValorApostado(float valor) {
        this.valor = valor;
    }

    public double calculaLucro(Evento evento) {
        if(evento.getResultado() == resultado.TIME1){
            return (valor * evento.getMulti1()) - valor;

        }else if(evento.getResultado() == resultado.EMPATE){
            return (valor * evento.getMultiEmp()) - valor;
            
        }else{
            return (valor * evento.getMulti2()) - valor;
        }
    }


}


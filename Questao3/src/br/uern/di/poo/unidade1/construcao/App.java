package br.uern.di.poo.unidade1.construcao;

public class App {
    public static void main(String[] args) throws Exception {

        Porta porta1 = new Porta(TipoPorta.PORTA_SIMPLES, 2, 1, false);
        Porta porta2 = new Porta(TipoPorta.PORTA_PADRAO, 3, 1, true);
        Porta porta3 = new Porta(TipoPorta.PORTA_LUXO, 2, 1, false);
        Porta porta4 = new Porta(TipoPorta.PORTA_LUXO, 8, 4, true);
        
        System.out.println("=============Porta-1=============");
        porta1.exibePorta(porta1);
        System.out.println("Preço final da porta: R$" + porta1.calculaPreco(porta1));
        System.out.println("Preço para instalação: R$" + Servicos.calculaServico(porta1)+"\n\n");
        
        System.out.println("=============Porta-2=============");
        porta1.exibePorta(porta2);
        System.out.println("Preço final da porta: R$" + porta2.calculaPreco(porta2));
        System.out.println("Preço para instalação: R$" + Servicos.calculaServico(porta2)+"\n\n");
        
        System.out.println("=============Porta-3=============");
        porta1.exibePorta(porta3);
        System.out.println("Preço final da porta: R$" + porta2.calculaPreco(porta3));
        System.out.println("Preço para instalação: R$" + Servicos.calculaServico(porta3)+"\n\n");
        
        System.out.println("=============Porta-4=============");
        porta1.exibePorta(porta4);
        System.out.println("Preço final da porta: R$" + porta1.calculaPreco(porta4));
        System.out.println("Preço para instalação: R$" + Servicos.calculaServico(porta4)+"\n\n");

        
    }
}

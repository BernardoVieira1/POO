package poo.uernbet;

public class Evento {
    private String title;
    private String TIME1;
    private String TIME2;
    private double multi1;
    private double multiEmp;
    private double multi2;
    private Resultado resultado;
    
    public Evento(String title, String TIME1, String TIME2, double multi1, double multiEmp, double multi2) {
        this.title = title;
        this.TIME1 = TIME1;
        this.TIME2 = TIME2;
        this.multi1 = multi1;
        this.multiEmp = multiEmp;
        this.multi2 = multi2;
        
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTIME1() {
        return TIME1;
    }

    public void setTIME1(String tIME1) {
        TIME1 = tIME1;
    }

    public String getTIME2() {
        return TIME2;
    }

    public void setTIME2(String tIME2) {
        TIME2 = tIME2;
    }

    public double getMulti1() {
        return multi1;
    }

    public void setMulti1(double multi1) {
        this.multi1 = multi1;
    }

    public double getMultiEmp() {
        return multiEmp;
    }

    public void setMultiEmp(double multiEmp) {
        this.multiEmp = multiEmp;
    }

    public double getMulti2() {
        return multi2;
    }

    public void setMulti2(double multi2) {
        this.multi2 = multi2;
    }


    





}



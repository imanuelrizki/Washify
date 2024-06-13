package projek.washify.pembayaran;

public class BayarModel {
    private String namabayar;
    private String nomer;
    private int logobayar;

    public BayarModel(String namabayar, String nomer, int logobayar) {
        this.namabayar = namabayar;
        this.nomer = nomer;
        this.logobayar = logobayar;

    }

    public String getNamabayar() {
        return namabayar;
    }

    public void setNamabayar(String namabayar) {
        this.namabayar = namabayar;
    }

    public String getnomer(){
        return nomer;
    }
    public void setnomer(String nomer){
        this.nomer = nomer;
    }

    public int getLogobayar() {
        return logobayar;
    }

    public void setLogobayar(int logobayar) {
        this.logobayar = logobayar;
    }
}

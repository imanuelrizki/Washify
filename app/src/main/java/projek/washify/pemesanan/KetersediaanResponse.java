package projek.washify.pemesanan;
public class KetersediaanResponse {
    private boolean tersedia;
    private String pesan;

    public KetersediaanResponse(boolean tersedia, String pesan) {
        this.tersedia = tersedia;
        this.pesan = pesan;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }
}


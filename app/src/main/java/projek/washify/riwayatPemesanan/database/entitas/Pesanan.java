package projek.washify.riwayatPemesanan.database.entitas;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Pesanan {
    @PrimaryKey
    public int nomorId;
    public String estimasiDelivery;
    public String status;
    public String tanggalPemesanan;

    public Pesanan() {
        // Diperlukan konstruktor default tanpa argumen
    }

    public Pesanan(int nomorId, String tanggalPemesanan,String estimasiDelivery, String status) {
        this.estimasiDelivery = estimasiDelivery;
        this.nomorId = nomorId;
        this.status = status;
        this.tanggalPemesanan = tanggalPemesanan;
    }

}

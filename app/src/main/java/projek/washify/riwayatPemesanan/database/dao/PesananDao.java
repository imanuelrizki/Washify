package projek.washify.riwayatPemesanan.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import projek.washify.riwayatPemesanan.database.entitas.Pesanan;


@Dao
public interface PesananDao {
    @Query("SELECT * FROM pesanan")
    List<Pesanan> getAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertAll(Pesanan... pesanan);

    @Query("SELECT * FROM pesanan WHERE nomorId = :nomorId")
    Pesanan getPesananById(int nomorId);

    @Query("DELETE FROM pesanan")
    void deleteAll();
}

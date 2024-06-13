package projek.washify.pemesanan.pickupschedule;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ScheduleDAO {
    @Insert
    void insert(PickupSchedule schedule);

    @Update
    void update(PickupSchedule schedule);

    @Delete
    void delete(PickupSchedule schedule);

    @Query("SELECT * FROM pickup_schedule ORDER BY timestamp DESC")
    LiveData<List<PickupSchedule>> getAllSchedules();
}

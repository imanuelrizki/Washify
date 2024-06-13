package projek.washify.pemesanan.pickupschedule;

import androidx.lifecycle.LiveData;
import java.util.List;
import java.util.concurrent.Executor;

public class ScheduleRepository {
    private ScheduleDAO scheduleDao;
    private LiveData<List<PickupSchedule>> allSchedules;
    private Executor executor;

    public ScheduleRepository(ScheduleDAO scheduleDao) {
        this.scheduleDao = scheduleDao;
        this.allSchedules = scheduleDao.getAllSchedules();
        this.executor = AppDatabase.databaseWriteExecutor;
    }

    LiveData<List<PickupSchedule>> getAllSchedules() {
        return allSchedules;
    }

    public void insert(PickupSchedule schedule) {
        executor.execute(() -> scheduleDao.insert(schedule));
    }

    public void update(PickupSchedule schedule) {
        executor.execute(() -> scheduleDao.update(schedule));
    }

    public void delete(PickupSchedule schedule) {
        executor.execute(() -> scheduleDao.delete(schedule));
    }
}

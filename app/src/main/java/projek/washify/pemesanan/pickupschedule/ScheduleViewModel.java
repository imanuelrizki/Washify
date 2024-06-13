package projek.washify.pemesanan.pickupschedule;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import java.util.List;

public class ScheduleViewModel extends AndroidViewModel {
    private ScheduleRepository repository;
    private LiveData<List<PickupSchedule>> allSchedules;

    public ScheduleViewModel(Application application) {
        super(application);
        repository = new ScheduleRepository(AppDatabase.getDatabase(application).scheduleDao());
        allSchedules = repository.getAllSchedules();
    }

    LiveData<List<PickupSchedule>> getAllSchedules() {
        return allSchedules;
    }

    public void insert(PickupSchedule schedule) {
        repository.insert(schedule);
    }

    public void update(PickupSchedule schedule) {
        repository.update(schedule);
    }

    public void delete(PickupSchedule schedule) {
        repository.delete(schedule);
    }
}

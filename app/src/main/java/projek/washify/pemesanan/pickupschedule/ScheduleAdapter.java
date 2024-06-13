package projek.washify.pemesanan.pickupschedule;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import projek.washify.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ScheduleAdapter extends RecyclerView.Adapter<ScheduleAdapter.ScheduleViewHolder> {

    private List<PickupSchedule> schedules = new ArrayList<>();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm", Locale.getDefault());

    @NonNull
    @Override
    public ScheduleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pemesanan_recycleview_item, parent, false);
        return new ScheduleViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ScheduleViewHolder holder, int position) {
        PickupSchedule current = schedules.get(position);
        holder.customerNameTextView.setText(current.getCustomerName());
        holder.notesTextView.setText(current.getNotes());
        holder.statusTextView.setText(current.getStatus());
        holder.timestampTextView.setText(dateFormat.format(current.getTimestamp()));
    }

    @Override
    public int getItemCount() {
        return schedules.size();
    }

    public void setSchedules(List<PickupSchedule> schedules) {
        this.schedules = schedules;
        notifyDataSetChanged();
    }

    class ScheduleViewHolder extends RecyclerView.ViewHolder {
        private TextView customerNameTextView;
        private TextView notesTextView;
        private TextView statusTextView;
        private TextView timestampTextView;

        public ScheduleViewHolder(@NonNull View itemView) {
            super(itemView);
            customerNameTextView = itemView.findViewById(R.id.text_view_customer_name);
            notesTextView = itemView.findViewById(R.id.text_view_notes);
            statusTextView = itemView.findViewById(R.id.text_view_status);
            timestampTextView = itemView.findViewById(R.id.text_view_timestamp);
        }
    }
}

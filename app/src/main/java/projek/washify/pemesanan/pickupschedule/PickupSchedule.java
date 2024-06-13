    package projek.washify.pemesanan.pickupschedule;
    
    import androidx.room.Entity;
    import androidx.room.PrimaryKey;
    
    @Entity(tableName = "pickup_schedule")
    public class PickupSchedule {
        @PrimaryKey(autoGenerate = true)
        private int id;
        private String customerName;
        private long timestamp;
        private String status;
        private String notes;
    
        public PickupSchedule(int id, String customerName, long timestamp, String status, String notes) {
            this.id = id;
            this.customerName = customerName;
            this.timestamp = timestamp;
            this.status = status;
            this.notes = notes;
        }
    
        public int getId() {
            return id;
        }
    
        public String getCustomerName() {
            return customerName;
        }
    
        public long getTimestamp() {
            return timestamp;
        }
    
        public String getStatus() {
            return status;
        }
    
        public String getNotes() {
            return notes;
        }
    }

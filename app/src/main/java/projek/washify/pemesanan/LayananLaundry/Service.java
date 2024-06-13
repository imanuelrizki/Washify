package projek.washify.pemesanan.LayananLaundry;

public class Service {
    private String serviceId;
    private String name;
    private String description;
    private double price;

    // Konstruktor default diperlukan untuk Firestore
    public Service(String key, String name, String description, double v) {
    }

    // Konstruktor untuk membuat objek Service dengan nilai awal
    public Service(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // Getter dan setter untuk semua atribut
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

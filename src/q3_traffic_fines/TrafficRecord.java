package q3_traffic_fines;

public abstract class TrafficRecord {
    protected String driverId;
    protected String driverName;
    protected String vehiclePlate;
    protected String violationType;
    protected double fineAmount;
    protected String paymentStatus;

    public TrafficRecord(String driverId, String driverName, String vehiclePlate, String violationType) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.vehiclePlate = vehiclePlate;
        this.violationType = violationType;
        this.paymentStatus = "UNPAID";
    }

    public abstract void recordViolation();
    public abstract void assessFine();
    public abstract void processPayment();

    // Getters
    public String getDriverId() { return driverId; }
    public String getDriverName() { return driverName; }
    public String getVehiclePlate() { return vehiclePlate; }
    public String getViolationType() { return violationType; }
    public double getFineAmount() { return fineAmount; }
    public String getPaymentStatus() { return paymentStatus; }
}
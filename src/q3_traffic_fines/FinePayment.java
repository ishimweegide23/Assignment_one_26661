package q3_traffic_fines;

public class FinePayment extends TrafficRecord {
    public FinePayment(String driverId, String driverName, String vehiclePlate, String violationType) {
        super(driverId, driverName, vehiclePlate, violationType);
    }

    @Override
    public void recordViolation() {
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║ ❌ Error: Invalid operation   ║");
        System.out.println("║    for Fine Payment          ║");
        System.out.println("╚════════════════════════════════╝");
    }

    @Override
    public void assessFine() {
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║ ❌ Error: Invalid operation   ║");
        System.out.println("║    for Fine Payment          ║");
        System.out.println("╚════════════════════════════════╝");
    }

    @Override
    public void processPayment() {
        if (paymentStatus.equals("PAID")) {
            System.out.println("\n╔════════════════════════════════╗");
            System.out.println("║ ❌ Error: Fine already paid   ║");
            System.out.println("╚════════════════════════════════╝");
            return;
        }

        if (fineAmount <= 0) {
            System.out.println("\n╔════════════════════════════════╗");
            System.out.println("║ ❌ Error: No fine to pay      ║");
            System.out.println("╚════════════════════════════════╝");
            return;
        }

        paymentStatus = "PAID";
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║        PAYMENT RECEIPT        ║");
        System.out.println("╠════════════════════════════════╣");
        System.out.printf("║ %-12s: %-15s ║\n", "Driver", driverName);
        System.out.printf("║ %-12s: %-15s ║\n", "ID", driverId);
        System.out.printf("║ %-12s: %-15s ║\n", "Plate", vehiclePlate);
        System.out.printf("║ %-12s: %-15s ║\n", "Violation", violationType);
        System.out.printf("║ %-12s: %-15s ║\n", "Amount Paid", String.format("%,.0f RWF", fineAmount));
        System.out.printf("║ %-12s: %-15s ║\n", "Status", paymentStatus);
        System.out.println("╚════════════════════════════════╝");
    }
}
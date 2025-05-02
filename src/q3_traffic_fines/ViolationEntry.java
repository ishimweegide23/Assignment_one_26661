package q3_traffic_fines;

public class ViolationEntry extends TrafficRecord {
    private static final String[] ALLOWED_VIOLATIONS = {
            "SPEEDING", "RED_LIGHT", "NO_HELMET", "DUI",
            "NO_SEATBELT", "WRONG_WAY", "ILLEGAL_PARKING"
    };

    public ViolationEntry(String driverId, String driverName, String vehiclePlate, String violationType) {
        super(driverId, driverName, vehiclePlate, violationType);
    }

    @Override
    public void recordViolation() {
        if (!isValidViolationType()) {
            System.out.println("\n╔════════════════════════════════╗");
            System.out.println("║ ❌ Error: Invalid violation  ║");
            System.out.println("║    type                     ║");
            System.out.println("╚════════════════════════════════╝");
            return;
        }

        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║ ✅ Violation Recorded:        ║");
        System.out.printf("║ %-12s: %-15s ║\n", "Driver", driverName);
        System.out.printf("║ %-12s: %-15s ║\n", "ID", driverId);
        System.out.printf("║ %-12s: %-15s ║\n", "Plate", vehiclePlate);
        System.out.printf("║ %-12s: %-15s ║\n", "Violation", violationType);
        System.out.println("╚════════════════════════════════╝");
    }

    private boolean isValidViolationType() {
        for (String validType : ALLOWED_VIOLATIONS) {
            if (validType.equalsIgnoreCase(violationType)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void assessFine() {
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║ ❌ Error: Invalid operation   ║");
        System.out.println("║    for Violation Entry       ║");
        System.out.println("╚════════════════════════════════╝");
    }

    @Override
    public void processPayment() {
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║ ❌ Error: Invalid operation   ║");
        System.out.println("║    for Violation Entry       ║");
        System.out.println("╚════════════════════════════════╝");
    }
}
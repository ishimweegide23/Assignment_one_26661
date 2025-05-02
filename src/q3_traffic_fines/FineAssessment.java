package q3_traffic_fines;

public class FineAssessment extends TrafficRecord {
    public FineAssessment(String driverId, String driverName, String vehiclePlate, String violationType) {
        super(driverId, driverName, vehiclePlate, violationType);
    }

    @Override
    public void recordViolation() {
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║ ❌ Error: Invalid operation   ║");
        System.out.println("║    for Fine Assessment       ║");
        System.out.println("╚════════════════════════════════╝");
    }

    @Override
    public void assessFine() {
        switch (violationType.toUpperCase()) {
            case "SPEEDING":
                fineAmount = 50000;
                break;
            case "RED_LIGHT":
                fineAmount = 80000;
                break;
            case "NO_HELMET":
                fineAmount = 30000;
                break;
            case "DUI":
                fineAmount = 150000;
                break;
            case "NO_SEATBELT":
                fineAmount = 25000;
                break;
            case "WRONG_WAY":
                fineAmount = 60000;
                break;
            case "ILLEGAL_PARKING":
                fineAmount = 20000;
                break;
            default:
                System.out.println("\n╔════════════════════════════════╗");
                System.out.println("║ ❌ Error: Unrecognized       ║");
                System.out.println("║    violation type            ║");
                System.out.println("╚════════════════════════════════╝");
                return;
        }

        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║        FINE ASSESSMENT        ║");
        System.out.println("╠════════════════════════════════╣");
        System.out.printf("║ %-12s: %-15s ║\n", "Driver", driverName);
        System.out.printf("║ %-12s: %-15s ║\n", "Plate", vehiclePlate);
        System.out.printf("║ %-12s: %-15s ║\n", "Violation", violationType);
        System.out.printf("║ %-12s: %-15s ║\n", "Fine", String.format("%,.0f RWF", fineAmount));
        System.out.println("╚════════════════════════════════╝");
    }

    @Override
    public void processPayment() {
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║ ❌ Error: Invalid operation   ║");
        System.out.println("║    for Fine Assessment       ║");
        System.out.println("╚════════════════════════════════╝");
    }
}
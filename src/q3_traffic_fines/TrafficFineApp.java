package q3_traffic_fines;

import java.util.Scanner;

public class TrafficFineApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n╔════════════════════════════════════════════════╗");
        System.out.println("║     🚔 RWANDA NATIONAL POLICE - TRAFFIC FINES   ║");
        System.out.println("╠════════════════════════════════════════════════╣");
        System.out.println("║           Road Safety Management System        ║");
        System.out.println("╚════════════════════════════════════════════════╝");

        String driverId = validateInput(scanner, "🆔 Enter Driver ID : ", "^\\d{16s}$",
                "❌ Invalid ID! Must be exactly 16 digits");

        String driverName = validateName(scanner);

        String vehiclePlate = validatePlate(scanner);

        String violationType = validateViolationType(scanner);

        ViolationEntry violation = new ViolationEntry(driverId, driverName, vehiclePlate, violationType);
        FineAssessment assessment = new FineAssessment(driverId, driverName, vehiclePlate, violationType);
        FinePayment payment = new FinePayment(driverId, driverName, vehiclePlate, violationType);

        while (true) {
            System.out.println("\n╔════════════════════════════════╗");
            System.out.println("║        🚦 MAIN MENU           ║");
            System.out.println("╠════════════════════════════════╣");
            System.out.println("║ 1. 📝 Record Violation        ║");
            System.out.println("║ 2. 💵 Assess Fine             ║");
            System.out.println("║ 3. 💳 Process Payment         ║");
            System.out.println("║ 4. 🚪 Exit                    ║");
            System.out.println("╚════════════════════════════════╝");
            System.out.print("🔘 Select option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    violation.recordViolation();
                    break;
                case "2":
                    assessment.assessFine();
                    payment.fineAmount = assessment.getFineAmount();
                    break;
                case "3":
                    payment.processPayment();
                    break;
                case "4":
                    System.out.println("\n╔════════════════════════════════╗");
                    System.out.println("║   🏁 Thank you for using      ║");
                    System.out.println("║     our police system!       ║");
                    System.out.println("╚════════════════════════════════╝");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("\n⚠️ Invalid option! Please enter 1-4");
            }
        }
    }

    private static String validateInput(Scanner scanner, String prompt, String regex, String errorMsg) {
        while (true) {
            System.out.print("\n" + prompt);
            String input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            }
            System.out.println("\n" + errorMsg);
        }
    }

    private static String validateName(Scanner scanner) {
        while (true) {
            System.out.print("\nEnter Driver Name : ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("\n⚠️ Name cannot be empty");
                continue;
            }

            String[] nameParts = input.split("\\s+");

            if (nameParts.length < 2 || nameParts.length > 3) {
                System.out.println("\n⚠️ Please enter 2-3 names only");
                continue;
            }

            boolean valid = true;
            for (String part : nameParts) {
                if (!part.matches("[a-zA-Z]{3,20}")) {
                    System.out.println("\n⚠️ Each name must be 3-20 letters");
                    valid = false;
                    break;
                }
            }

            if (valid) return input;
        }
    }

    private static String validatePlate(Scanner scanner) {
        while (true) {
            System.out.print("\nEnter Vehicle Plate : ");
            String input = scanner.nextLine().trim().toUpperCase();

            if (input.matches("^[A-Z]{2,3}\\d{3}[A-Z]$")) {
                return input;
            }
            System.out.println("\n⚠️ Invalid plate! Use format like RAB123D");
        }
    }

    private static String validateViolationType(Scanner scanner) {
        while (true) {
            System.out.print("\nEnter Violation Type (e.g., SPEEDING): ");
            String input = scanner.nextLine().trim().toUpperCase();

            if (input.matches("SPEEDING|RED_LIGHT|NO_HELMET|DUI|NO_SEATBELT|WRONG_WAY|ILLEGAL_PARKING")) {
                return input;
            }
            System.out.println("\n⚠️ Invalid violation type! Choose from:");
            System.out.println("SPEEDING, RED_LIGHT, NO_HELMET, DUI, NO_SEATBELT, WRONG_WAY, ILLEGAL_PARKING");
        }
    }
}
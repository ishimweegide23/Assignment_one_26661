package q1_site_construction;

import java.util.Scanner;

public class SiteConstructionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n  ╔════════════════════════════════════════════════╗");
        System.out.println("  ║        🏗️ CONSTRUCTION SITE MANAGER           ║");
        System.out.println("  ╚════════════════════════════════════════════════╝");

        String id = validateContractorId(scanner);
        String name = validateContractorName(scanner);

        MaterialDelivery delivery = new MaterialDelivery(id, name);
        MaterialUsage usage = new MaterialUsage(id, name);
        CostEstimation cost = new CostEstimation(id, name);

        while (true) {
            System.out.println("\n  ╔════════════════════════════════╗");
            System.out.println("  ║          MAIN MENU             ║");
            System.out.println("  ╠════════════════════════════════╣");
            System.out.println("  ║ 1. 📦 Material Delivery        ║");
            System.out.println("  ║ 2. 🏭 Material Usage           ║");
            System.out.println("  ║ 3. 💰 Cost Estimation          ║");
            System.out.println("  ║ 4. 🚪 Exit                     ║");
            System.out.println("  ╚════════════════════════════════╝");
            System.out.print("Select option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    handleDelivery(scanner, delivery, usage);
                    break;
                case "2":
                    handleUsage(scanner, usage, delivery);
                    break;
                case "3":
                    cost.materialQuantity = usage.getMaterialBalance();
                    cost.estimateCost();
                    break;
                case "4":
                    System.out.println("\n  ╔══════════════════════════════════════╗");
                    System.out.println("  ║  \uD83C\uDF89 Thank you for using ou ║");
                    System.out.println("  ║   construction system!               ║");
                    System.out.println("  ╚══════════════════════════════════════╝");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("\n⚠️ Invalid option! Please enter 1-4");
            }
        }
    }

    private static String validateContractorId(Scanner scanner) {
        while (true) {
            System.out.print("\nEnter Contractor ID : ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("\n⚠️ ID cannot be empty");
                continue;
            }

            if (!input.matches("^[0-9]{3,16}$")) {
                System.out.println("\n⚠️ ID must be 3-16 digits only");
                continue;
            }

            return input;
        }
    }

    private static String validateContractorName(Scanner scanner) {
        while (true) {
            System.out.print("\nEnter Contractor Name : ");
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

            if (valid) {
                return input;
            }
        }
    }

    private static void handleDelivery(Scanner scanner, MaterialDelivery delivery, MaterialUsage usage) {
        while (true) {
            System.out.print("\nEnter delivery amount (1-10 tons): ");
            try {
                double quantity = Double.parseDouble(scanner.nextLine());
                delivery.receiveMaterial(quantity);
                usage.materialBalance = delivery.getMaterialBalance();
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n⚠️ Please enter a valid number");
            }
        }
    }

    private static void handleUsage(Scanner scanner, MaterialUsage usage, MaterialDelivery delivery) {
        while (true) {
            System.out.print("\nEnter usage amount: ");
            try {
                double quantity = Double.parseDouble(scanner.nextLine());
                usage.useMaterial(quantity);
                delivery.materialBalance = usage.getMaterialBalance();
                break;
            } catch (NumberFormatException e) {
                System.out.println("\n⚠️ Please enter a valid number");
            }
        }
    }
}
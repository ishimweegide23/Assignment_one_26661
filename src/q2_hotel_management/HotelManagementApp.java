package q2_hotel_management;

import java.util.Scanner;

public class HotelManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n╔════════════════════════════════════════════════╗");
        System.out.println("║          🏨 LEMIGO HOTEL MANAGEMENT          ║");
        System.out.println("╠════════════════════════════════════════════════╣");
        System.out.println("║            Efficient Guest Services           ║");
        System.out.println("╚════════════════════════════════════════════════╝");

        String guestId = validateInput(scanner, "🆔 Enter Guest ID : ", "^[0-9]{3,16}$",
                "❌ Invalid ID! Must be 3-16 digits");

        String guestName = validateName(scanner);

        String roomType = validateRoomType(scanner);

        int stayDays = validateStayDays(scanner);

        RoomBooking booking = new RoomBooking(guestId, guestName, roomType, stayDays);
        GuestCheckout checkout = new GuestCheckout(guestId, guestName, roomType, stayDays);
        Billing billing = new Billing(guestId, guestName, roomType, stayDays);

        while (true) {
            System.out.println("\n╔════════════════════════════════╗");
            System.out.println("║        🏨 MAIN MENU           ║");
            System.out.println("╠════════════════════════════════╣");
            System.out.println("║ 1. 🛏️  Book Room             ║");
            System.out.println("║ 2. 🚪 Checkout Guest         ║");
            System.out.println("║ 3. 💰 Generate Bill          ║");
            System.out.println("║ 4. 🏃 Exit                   ║");
            System.out.println("╚════════════════════════════════╝");
            System.out.print("🔘 Select option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    booking.bookRoom();
                    break;
                case "2":
                    checkout.checkoutGuest();
                    break;
                case "3":
                    billing.generateBill();
                    break;
                case "4":
                    System.out.println("\n╔════════════════════════════════╗");
                    System.out.println("║   🙏 Thank you for using      ║");
                    System.out.println("║     our hotel system!        ║");
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
            System.out.print("\nEnter Guest Name : ");
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

    private static String validateRoomType(Scanner scanner) {
        while (true) {
            System.out.print("\nEnter Room Type (STANDARD/DELUXE/SUITE): ");
            String input = scanner.nextLine().trim().toUpperCase();

            if (input.matches("STANDARD|DELUXE|SUITE")) {
                return input;
            }
            System.out.println("\n⚠️ Invalid room type! Choose STANDARD, DELUXE, or SUITE");
        }
    }

    private static int validateStayDays(Scanner scanner) {
        while (true) {
            System.out.print("\nEnter Stay Duration (1-30 days): ");
            try {
                int days = Integer.parseInt(scanner.nextLine());
                if (days >= 1 && days <= 30) {
                    return days;
                }
                System.out.println("\n⚠️ Stay must be 1-30 days");
            } catch (NumberFormatException e) {
                System.out.println("\n⚠️ Please enter a valid number");
            }
        }
    }
}
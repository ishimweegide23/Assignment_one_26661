package q2_hotel_management;

import java.text.NumberFormat;
import java.util.Locale;

public class Billing extends HotelService {
    public Billing(String guestId, String guestName, String roomType, int stayDays) {
        super(guestId, guestName, roomType, stayDays);
    }

    @Override
    public void bookRoom() {
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║ ❌ Error: Invalid operation   ║");
        System.out.println("║    for Billing               ║");
        System.out.println("╚════════════════════════════════╝");
    }

    @Override
    public void checkoutGuest() {
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║ ❌ Error: Invalid operation   ║");
        System.out.println("║    for Billing               ║");
        System.out.println("╚════════════════════════════════╝");
    }

    @Override
    public void generateBill() {
        if (!roomType.matches("STANDARD|DELUXE|SUITE")) {
            System.out.println("\n╔════════════════════════════════╗");
            System.out.println("║ ❌ Error: Invalid room type   ║");
            System.out.println("╚════════════════════════════════╝");
            return;
        }

        if (stayDays < 1) {
            System.out.println("\n╔════════════════════════════════╗");
            System.out.println("║ ❌ Error: Invalid stay days   ║");
            System.out.println("╚════════════════════════════════╝");
            return;
        }

        double rate = 0;
        switch (roomType) {
            case "STANDARD": rate = 50000; break;
            case "DELUXE": rate = 80000; break;
            case "SUITE": rate = 120000; break;
        }

        double total = rate * stayDays;
        NumberFormat fmt = NumberFormat.getNumberInstance(Locale.US);

        System.out.println("\n╔════════════════════════════════════════════════╗");
        System.out.println("║                  HOTEL BILL                   ║");
        System.out.println("╠════════════════════════════════════════════════╣");
        System.out.printf("║ %-15s: %-30s ║\n", "Guest", guestName);
        System.out.printf("║ %-15s: %-30s ║\n", "ID", guestId);
        System.out.println("╟────────────────────────────────────────────────╢");
        System.out.printf("║ %-15s: %-30s ║\n", "Room Type", roomType);
        System.out.printf("║ %-15s: %-30d ║\n", "Stay Duration", stayDays);
        System.out.printf("║ %-15s: %-30s ║\n", "Rate per night", fmt.format(rate) + " RWF");
        System.out.println("╟────────────────────────────────────────────────╢");
        System.out.printf("║ %-15s: %-30s ║\n", "TOTAL", fmt.format(total) + " RWF");
        System.out.println("╚════════════════════════════════════════════════╝");
    }
}
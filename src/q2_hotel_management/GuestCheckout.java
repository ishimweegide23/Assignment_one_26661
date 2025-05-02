package q2_hotel_management;

public class GuestCheckout extends HotelService {
    public GuestCheckout(String guestId, String guestName, String roomType, int stayDays) {
        super(guestId, guestName, roomType, stayDays);
    }

    @Override
    public void bookRoom() {
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║ ❌ Error: Invalid operation   ║");
        System.out.println("║    for Guest Checkout        ║");
        System.out.println("╚════════════════════════════════╝");
    }

    @Override
    public void checkoutGuest() {
        if (!roomStatus.equals("OCCUPIED")) {
            System.out.println("\n╔════════════════════════════════╗");
            System.out.println("║ ❌ Error: Room is already     ║");
            System.out.println("║     available                ║");
            System.out.println("╚════════════════════════════════╝");
            return;
        }

        roomStatus = "AVAILABLE";
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║ ✅ Checkout successful for:   ║");
        System.out.printf("║ %-15s: %-10s ║\n", "Guest", guestName);
        System.out.printf("║ %-15s: %-10s ║\n", "Room Type", roomType);
        System.out.println("║ Room is now available       ║");
        System.out.println("╚════════════════════════════════╝");
    }

    @Override
    public void generateBill() {
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║ ❌ Error: Invalid operation   ║");
        System.out.println("║    for Guest Checkout        ║");
        System.out.println("╚════════════════════════════════╝");
    }
}
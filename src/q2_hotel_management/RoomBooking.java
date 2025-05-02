package q2_hotel_management;

public class RoomBooking extends HotelService {
    public RoomBooking(String guestId, String guestName, String roomType, int stayDays) {
        super(guestId, guestName, roomType, stayDays);
    }

    @Override
    public void bookRoom() {
        if (!roomType.matches("STANDARD|DELUXE|SUITE")) {
            System.out.println("\n╔════════════════════════════════╗");
            System.out.println("║ ❌ Error: Invalid room type   ║");
            System.out.println("║ Choose STANDARD/DELUXE/SUITE ║");
            System.out.println("╚════════════════════════════════╝");
            return;
        }

        if (stayDays < 1 || stayDays > 30) {
            System.out.println("\n╔════════════════════════════════╗");
            System.out.println("║ ❌ Error: Stay duration must  ║");
            System.out.println("║     be 1-30 days             ║");
            System.out.println("╚════════════════════════════════╝");
            return;
        }

        if (!roomStatus.equals("AVAILABLE")) {
            System.out.println("\n╔════════════════════════════════╗");
            System.out.println("║ ❌ Error: Room is already     ║");
            System.out.println("║     occupied                 ║");
            System.out.println("╚════════════════════════════════╝");
            return;
        }

        roomStatus = "OCCUPIED";
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║ ✅ Booking confirmed for:     ║");
        System.out.printf("║ %-15s: %-10s ║\n", "Guest", guestName);
        System.out.printf("║ %-15s: %-10s ║\n", "Room Type", roomType);
        System.out.printf("║ %-15s: %-10d days ║\n", "Stay Duration", stayDays);
        System.out.println("╚════════════════════════════════╝");
    }

    @Override
    public void checkoutGuest() {
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║ ❌ Error: Invalid operation   ║");
        System.out.println("║    for Room Booking          ║");
        System.out.println("╚════════════════════════════════╝");
    }

    @Override
    public void generateBill() {
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║ ❌ Error: Invalid operation   ║");
        System.out.println("║    for Room Booking          ║");
        System.out.println("╚════════════════════════════════╝");
    }
}
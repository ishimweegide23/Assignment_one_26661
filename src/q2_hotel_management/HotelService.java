package q2_hotel_management;

public abstract class HotelService {
    protected String guestId;
    protected String guestName;
    protected String roomType;
    protected int stayDays;
    protected String roomStatus;

    public HotelService(String guestId, String guestName, String roomType, int stayDays) {
        this.guestId = guestId;
        this.guestName = guestName;
        this.roomType = roomType;
        this.stayDays = stayDays;
        this.roomStatus = "AVAILABLE"; // Default status
    }

    public abstract void bookRoom();
    public abstract void checkoutGuest();
    public abstract void generateBill();

    // Getters
    public String getGuestId() { return guestId; }
    public String getGuestName() { return guestName; }
    public String getRoomType() { return roomType; }
    public int getStayDays() { return stayDays; }
    public String getRoomStatus() { return roomStatus; }
}
//Presentation Layer-Handles user interaction
class BookingUI {
    private BookingService bookingService;

    public BookingUI() {
        this.bookingService = new BookingService();
    }

    public void bookVehicle(String userId, String vehicleId) {
        System.out.println("Attempting to book vehicle...");
        boolean success = bookingService.bookVehicle(userId, vehicleId);
        if (success) {
            System.out.println("Booking successful!");
        } else {
            System.out.println("Booking failed.");
        }
    }
}

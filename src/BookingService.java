//Business Layer-Implements business logic
class BookingService {
    private BookingRepository bookingRepository;

    public BookingService() {
        this.bookingRepository = new BookingRepository();
    }

    public boolean bookVehicle(String userId, String vehicleId) {
        if (bookingRepository.checkAvailability(vehicleId)) {
            bookingRepository.saveBooking(userId, vehicleId);
            return true;
        }
        System.out.println("Vehicle not available for booking.");
        return false;
    }
}
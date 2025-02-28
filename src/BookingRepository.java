//Data Layer-Handles data storage and retrieval
class BookingRepository {
    public boolean checkAvailability(String vehicleId) {
        // Simulating database check
        System.out.println("Checking availability for vehicle: " + vehicleId);
        return true; // Assume always available
    }

    public void saveBooking(String userId, String vehicleId) {
        System.out.println("Booking saved: User " + userId + " booked vehicle " + vehicleId);
    }
}
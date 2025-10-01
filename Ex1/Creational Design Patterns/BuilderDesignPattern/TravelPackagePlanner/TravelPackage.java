import java.util.ArrayList;
import java.util.List;

// Product class representing a Travel Package
class TravelPackage {
    private String flight;
    private String hotel;
    private String carRental;
    private List<String> tours = new ArrayList<>();

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public void setCarRental(String carRental) {
        this.carRental = carRental;
    }

    public void addTour(String tour) {
        tours.add(tour);
    }

    public void showPackageDetails() {
        System.out.println("Travel Package Details:");
        System.out.println("Flight: " + flight);
        System.out.println("Hotel: " + hotel);
        System.out.println("Car Rental: " + carRental);
        System.out.println("Tours Included:");
        for (String tour : tours) {
            System.out.println(" - " + tour);
        }
    }
}

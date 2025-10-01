// Concrete builder for Budget Package
class BudgetTravelPackageBuilder implements TravelPackageBuilder {
    private TravelPackage travelPackage = new TravelPackage();

    public void buildFlight() {
        travelPackage.setFlight("Economy flight with basic amenities");
    }

    public void buildHotel() {
        travelPackage.setHotel("3-star budget hotel");
    }

    public void buildCarRental() {
        travelPackage.setCarRental("Economy car rental");
    }

    public void buildTours() {
        travelPackage.addTour("City walking tour");
        travelPackage.addTour("Museum visit");
    }

    public TravelPackage getPackage() {
        return travelPackage;
    }
}
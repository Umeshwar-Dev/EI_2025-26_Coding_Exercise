// Concrete builder for Luxury Package
class LuxuryTravelPackageBuilder implements TravelPackageBuilder {
    private TravelPackage travelPackage = new TravelPackage();

    public void buildFlight() {
        travelPackage.setFlight("Business class flight with lounge access");
    }

    public void buildHotel() {
        travelPackage.setHotel("5-star luxury resort");
    }

    public void buildCarRental() {
        travelPackage.setCarRental("Luxury sedan rental");
    }

    public void buildTours() {
        travelPackage.addTour("Private guided city tour");
        travelPackage.addTour("Helicopter sightseeing");
        travelPackage.addTour("Gourmet dining experience");
    }

    public TravelPackage getPackage() {
        return travelPackage;
    }
}
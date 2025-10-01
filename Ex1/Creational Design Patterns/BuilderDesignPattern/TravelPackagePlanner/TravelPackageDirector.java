// Director
class TravelPackageDirector {
    private TravelPackageBuilder builder;

    public TravelPackageDirector(TravelPackageBuilder builder) {
        this.builder = builder;
    }

    public void constructPackage() {
        builder.buildFlight();
        builder.buildHotel();
        builder.buildCarRental();
        builder.buildTours();
    }

    public TravelPackage getPackage() {
        return builder.getPackage();
    }
}
// Builder interface
interface TravelPackageBuilder {
    void buildFlight();
    void buildHotel();
    void buildCarRental();
    void buildTours();
    TravelPackage getPackage();
}
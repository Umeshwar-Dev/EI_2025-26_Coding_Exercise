public class LaysManufacturingUnit {
    public static void produceSnack(LaysFactory factory) {
        Flavor flavor = factory.createFlavor();
        Packaging packaging = factory.createPackaging();

        System.out.println("Flavor: " + flavor.taste());
        System.out.println("Packaging: " + packaging.packType());
    }

    public static void main(String[] args) {
        System.out.println("Producing Classic Lays:");
        LaysFactory classicFactory = new ClassicLaysFactory();
        produceSnack(classicFactory);

        System.out.println("\nProducing Spicy Lays:");
        LaysFactory spicyFactory = new SpicyLaysFactory();
        produceSnack(spicyFactory);
    }
}
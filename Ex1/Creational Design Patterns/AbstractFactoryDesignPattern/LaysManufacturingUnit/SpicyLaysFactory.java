class SpicyLaysFactory implements LaysFactory {
    public Flavor createFlavor() {
        return new SpicyFlavor();
    }
    public Packaging createPackaging() {
        return new SpicyPackaging();
    }
}

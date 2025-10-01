class ClassicLaysFactory implements LaysFactory {
    public Flavor createFlavor() {
        return new ClassicFlavor();
    }
    public Packaging createPackaging() {
        return new ClassicPackaging();
    }
}
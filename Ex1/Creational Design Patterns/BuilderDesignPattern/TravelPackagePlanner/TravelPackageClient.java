// Client demo
public class TravelPackageClient {
    public static void main(String[] args) {
        System.out.println("Budget Travel Package:");
        TravelPackageBuilder budgetBuilder = new BudgetTravelPackageBuilder();
        TravelPackageDirector director = new TravelPackageDirector(budgetBuilder);
        director.constructPackage();
        director.getPackage().showPackageDetails();

        System.out.println("\nLuxury Travel Package:");
        TravelPackageBuilder luxuryBuilder = new LuxuryTravelPackageBuilder();
        director = new TravelPackageDirector(luxuryBuilder);
        director.constructPackage();
        director.getPackage().showPackageDetails();
    }
}
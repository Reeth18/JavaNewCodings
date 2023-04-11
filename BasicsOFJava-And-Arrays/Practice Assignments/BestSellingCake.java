package CodesWithoutPackages;

class Cake {
    private String name;
    private double price;
    private int salesCount;

    // Create a Constructor
    public Cake(String cakeName, double cakePrice, int cakeSalesCount) {
        this.name = cakeName;
        this.price = cakePrice;
        this.salesCount = cakeSalesCount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getSalesCount() {
        return salesCount;
    }

    public static Cake getBestseller(Cake[] cakes) {
        Cake bestSeller = null;
        int maxSales = 0;

        for (Cake cake : cakes) {
            if (cake.salesCount > maxSales) {
                bestSeller = cake;
                maxSales = cake.salesCount;
            }
        }

        return bestSeller;
    }
}

public class BestSellingCake {
    public static void main(String[] args) {
        Cake[] cakes = new Cake[3];
        cakes[0] = new Cake("Strawberry", 300, 8);
        cakes[1] = new Cake("Vanilla", 250, 6);
        cakes[2] = new Cake("Chocolate", 350, 10);

        Cake bestSeller = Cake.getBestseller(cakes);

        System.out.println("Cake Name: " + bestSeller.getName());
        System.out.println("Price: " + bestSeller.getPrice());
        System.out.println("Count: " + bestSeller.getSalesCount());
    }
}

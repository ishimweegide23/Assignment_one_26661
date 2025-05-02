package q1_site_construction;

public class MaterialDelivery extends ConstructionMaterial {
    public MaterialDelivery(String contractorId, String contractorName) {
        super(contractorId, contractorName);
    }

    @Override
    public void receiveMaterial(double quantity) {
        if (quantity < 1 || quantity > 10) {
            System.out.println("\n╔════════════════════════════════╗");
            System.out.println("║ ❌ Error: Delivery must be    ║");
            System.out.println("║     between 1-10 tons         ║");
            System.out.println("╚════════════════════════════════╝");
            return;
        }
        this.materialQuantity = quantity;
        this.materialBalance += quantity;
        System.out.println("\n╔════════════════════════════════╗");
        System.out.printf("║ ✅ Delivered: %-8.1f tons     ║\n", quantity);
        System.out.printf("║ New Balance: %-8.1f tons     ║\n", materialBalance);
        System.out.println("╚════════════════════════════════╝");
    }

    @Override
    public void useMaterial(double quantity) {
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║ ❌ Error: Invalid operation   ║");
        System.out.println("║    for Material Delivery      ║");
        System.out.println("╚════════════════════════════════╝");
    }

    @Override
    public void estimateCost() {
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("║ ❌ Error: Invalid operation   ║");
        System.out.println("║    for Material Delivery      ║");
        System.out.println("╚════════════════════════════════╝");
    }
}
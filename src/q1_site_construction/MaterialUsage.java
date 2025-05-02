package q1_site_construction;

public class MaterialUsage extends ConstructionMaterial {
    public MaterialUsage(String contractorId, String contractorName) {
        super(contractorId, contractorName);
    }

    @Override
    public void receiveMaterial(double quantity) {
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("  ║ ❌ Error: Invalid operation    ║");
        System.out.println("  ║    for Material Usage          ║");
        System.out.println("  ╚════════════════════════════════╝");
    }

    @Override
    public void useMaterial(double quantity) {
        if (quantity <= 0) {
            System.out.println("\n╔════════════════════════════════╗");
            System.out.println("  ║ ❌ Error: Usage must be        ║");
            System.out.println("  ║     positive                   ║");
            System.out.println("  ╚════════════════════════════════╝");
            return;
        }
        if ((materialBalance - quantity) < 2) {
            System.out.println("\n╔════════════════════════════════╗");
            System.out.println("  ║ ❌ Error: Insufficient       ║");
            System.out.printf("║ Current: %-5.1f tons         ║\n", materialBalance);
            System.out.println("  ║ Min Required: 2 tons        ║");
            System.out.println("  ╚════════════════════════════════╝");
            return;
        }
        this.materialBalance -= quantity;
        System.out.println("\n  ╔════════════════════════════════╗");
        System.out.printf("║ ✅ Used: %-9.1f tons           ║\n", quantity);
        System.out.printf("║ Remaining: %-5.1f tons         ║\n", materialBalance);
        System.out.println("    ╚════════════════════════════════╝");
    }

    @Override
    public void estimateCost() {
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("  ║ ❌ Error: Invalid operation    ║");
        System.out.println("  ║    for Material Usage          ║");
        System.out.println("  ╚════════════════════════════════╝");
    }
}
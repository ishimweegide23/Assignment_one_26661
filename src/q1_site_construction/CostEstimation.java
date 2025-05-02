package q1_site_construction;  // Corrected package name

import java.text.NumberFormat;
import java.util.Locale;

public class CostEstimation extends ConstructionMaterial {
    public CostEstimation(String contractorId, String contractorName) {
        super(contractorId, contractorName);  // Fixed constructor implementation
    }

    @Override
    public void receiveMaterial(double quantity) {
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("  ║ ❌ Error: Invalid operation    ║");
        System.out.println("  ║    for Cost Estimation         ║");
        System.out.println("  ╚════════════════════════════════╝");
    }

    @Override
    public void useMaterial(double quantity) {
        System.out.println("\n╔════════════════════════════════╗");
        System.out.println("  ║ ❌ Error: Invalid operation    ║");
        System.out.println("  ║    for Cost Estimation         ║");
        System.out.println("  ╚════════════════════════════════╝");
    }

    @Override
    public void estimateCost() {
        if (getMaterialQuantity() <= 0) {  // Changed to use getter
            System.out.println("\n╔════════════════════════════════╗");
            System.out.println("║ ❌ Error: No materials to    ║");
            System.out.println("║     estimate                ║");
            System.out.println("╚════════════════════════════════╝");
            return;
        }

        double costPerTon = getMaterialQuantity() > 15 ? 180000 : 200000;  // Changed to use getter
        double totalCost = getMaterialQuantity() * costPerTon;  // Changed to use getter
        NumberFormat fmt = NumberFormat.getNumberInstance(Locale.US);

        System.out.println("\n╔════════════════════════════════════════════════╗");
        System.out.println("║                COST ESTIMATION                ║");
        System.out.println("╠════════════════════════════════════════════════╣");
        System.out.printf("║ 🆔 Contractor: %-30s ║\n", getContractorName());  // Changed to use getter
        System.out.printf("║ 📍 ID: %-36s ║\n", getContractorId());  // Changed to use getter
        System.out.println("╟────────────────────────────────────────────────╢");
        System.out.printf("║ 📦 Materials: %-29.1f tons ║\n", getMaterialQuantity());  // Changed to use getter
        System.out.printf("║ 💵 Rate: %-35s RWF ║\n", fmt.format(costPerTon));
        System.out.println("╟────────────────────────────────────────────────╢");
        System.out.printf("║ 💰 TOTAL: %-36s RWF ║\n", fmt.format(totalCost));
        System.out.println("╚════════════════════════════════════════════════╝");
    }
}
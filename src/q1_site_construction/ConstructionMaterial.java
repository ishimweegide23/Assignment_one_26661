package q1_site_construction;

public abstract class ConstructionMaterial {
    protected String contractorId;
    protected String contractorName;
    protected double materialQuantity;
    protected double materialBalance;

    public ConstructionMaterial(String contractorId, String contractorName) {
        this.contractorId = contractorId;
        this.contractorName = contractorName;
        this.materialBalance = 0;
    }

    public abstract void receiveMaterial(double quantity);
    public abstract void useMaterial(double quantity);
    public abstract void estimateCost();

    // Concrete getters (removed abstract declarations)
    public String getContractorId() { return this.contractorId; }
    public String getContractorName() { return this.contractorName; }
    public double getMaterialQuantity() { return this.materialQuantity; }
    public double getMaterialBalance() { return this.materialBalance; }
}
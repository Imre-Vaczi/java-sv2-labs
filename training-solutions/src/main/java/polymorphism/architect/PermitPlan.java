package polymorphism.architect;

public class PermitPlan extends SketchPlan implements Header{

    protected String nameOfClient;
    protected String addressOfBuilding;

    public PermitPlan(int pagesOfDocumentation, String title, String nameOfClient, String addressOfBuilding) {
        super(pagesOfDocumentation, title);
        this.nameOfClient = nameOfClient;
        this.addressOfBuilding = addressOfBuilding;
    }

    public String getNameOfClient() {
        return nameOfClient;
    }

    public String getAddressOfBuilding() {
        return addressOfBuilding;
    }

    public String getHeader() {
        return getNameOfClient() + " " + getAddressOfBuilding();
    }

}

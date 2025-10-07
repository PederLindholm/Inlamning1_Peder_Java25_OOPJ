public class Plants implements VattnaVäxt{
    private String name;
    private double height;
    private String typeOfFluid;

    public Plants(String name, double height, String typeOfFluid) {
        this.name = name;
        this.height = height;
        this.typeOfFluid = typeOfFluid;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public String getTypeOfFluid() {
        return typeOfFluid;
    }

    public void vattnaVäxt() {
    }
}


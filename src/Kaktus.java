public class Kaktus extends Plants{

    //Private - Bara kaktus klassen som använder dom
    private OperandFörVattning vattning = OperandFörVattning.KAKTUS;
    private double mängdVatten = vattning.operandFörVattning;

    public Kaktus(String name, double height, String typeOfFluid) {
        super(name, height, typeOfFluid);
    }

    public void vattnaVäxt() {
        System.out.println(getName() + " ska ha " + mängdVatten + " cl " + getTypeOfFluid());
    }
}


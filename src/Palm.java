public class Palm extends Plants {

    private OperandFörVattning vattning = OperandFörVattning.PALM;

    double mängdVatten = vattning.operandFörVattning * getHeight();

    public Palm(String name, double height, String typeOfFluid) {
        super(name, height, typeOfFluid);
    }

    public void vattnaVäxt() {
        System.out.println(getName() + " ska ha " + mängdVatten + " l " + getTypeOfFluid());
    }
}


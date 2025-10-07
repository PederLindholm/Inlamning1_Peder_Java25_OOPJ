public class Palm extends Plants {

    //Private - Bara Palm klassen som använder dom
    private OperandFörVattning vattning = OperandFörVattning.PALM;
    private double mängdVatten = vattning.operandFörVattning * getHeight();

    public Palm(String name, double height, String typeOfFluid) {
        super(name, height, typeOfFluid);
    }

    public void vattnaVäxt() {
        System.out.println(getName() + " ska ha " + mängdVatten + " l " + getTypeOfFluid());
    }
}


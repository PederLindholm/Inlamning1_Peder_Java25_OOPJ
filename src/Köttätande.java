public class Köttätande extends Plants{

    private OperandFörVattning vattning = OperandFörVattning.KÖTTÄTANDE;
    private OperandFörVattning extraVattning = OperandFörVattning.KÖTTÄTANDEEXTRA;

    double mängdVatten = vattning.operandFörVattning + (extraVattning.operandFörVattning * getHeight());

    public Köttätande(String name, double height, String typeOfFluid) {
        super(name, height, typeOfFluid);
    }

    public void vattnaVäxt() {
        System.out.println(getName() + " ska ha " + mängdVatten + " l " + getTypeOfFluid());
    }
}

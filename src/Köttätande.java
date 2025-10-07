public class Köttätande extends Plants{

    //Private - Bara Köttätande klassen som använder dom
    private Vätska vätska = Vätska.PROTEINDRYCK;
    private OperandFörVattning vattning = OperandFörVattning.KÖTTÄTANDE;
    private OperandFörVattning extraVattning = OperandFörVattning.KÖTTÄTANDEEXTRA;

    private double mängdVatten = vattning.operandFörVattning + (extraVattning.operandFörVattning * getHeight());

    public Köttätande(String name, double height) {
        super(name, height);
    }

    public void vattnaVäxt() {
        System.out.println(getName() + " ska ha " + mängdVatten + " l " + vätska.vätska);
    }
}

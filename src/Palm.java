public class Palm extends Plants {

    //Private - Bara Palm klassen som använder dom
    private Vätska vätska = Vätska.KRANVATTEN;
    private OperandFörVattning vattning = OperandFörVattning.PALM;
    private double mängdVatten = vattning.operandFörVattning * getHeight();

    public Palm(String name, double height) {
        super(name, height);

    }

    public void vattnaVäxt() {
        System.out.println(getName() + " ska ha " + mängdVatten + " l " + vätska.vätska);
    }
}


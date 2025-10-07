public class Kaktus extends Plants{

    //Private - Bara kaktus klassen som använder dom
    private Vätska vätska = Vätska.MINERALVATTEN;
    private OperandFörVattning vattning = OperandFörVattning.KAKTUS;
    private double mängdVatten = vattning.operandFörVattning;

    public Kaktus(String name, double height) {
        super(name, height);
    }

    public void vattnaVäxt() {
        System.out.println(getName() + " ska ha " + mängdVatten + " cl " + vätska.vätska);
    }
}


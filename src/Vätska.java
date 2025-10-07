public enum Vätska {
    //Enums - Då typen av vätska är fast för typen av växt
    MINERALVATTEN("MineralVatten"),
    PROTEINDRYCK("Protein Dryck"),
    KRANVATTEN ("Kranvatten");

    public final String vätska;

    Vätska(String vätska) {
        this.vätska = vätska;
    }
}


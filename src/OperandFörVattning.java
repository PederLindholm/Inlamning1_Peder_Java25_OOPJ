public enum OperandFörVattning {
    //Enums - Då operanden för vattning ändras aldrig
    PALM (0.5),
    KAKTUS (2),
    KÖTTÄTANDE (0.1),
    KÖTTÄTANDEEXTRA(0.2);

    public final double operandFörVattning;

    OperandFörVattning(double operandFörVattning) {
        this.operandFörVattning = operandFörVattning;
    }
}


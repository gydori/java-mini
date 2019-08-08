public final class RefractorTelescope extends Telescope {

    private int numberOfLenses;

    public RefractorTelescope(double diameter, int fLength, int numberOfLenses) throws NegativeException {
        super(diameter, fLength);
        if (numberOfLenses < 0) {
            throw new NegativeException("Nem lehet negatív!");
        } else {
            this.numberOfLenses = numberOfLenses;
        }
    }

    @Override
    public boolean hasColorError() {
        return true;
    }

    public int getNumberOfLenses() {
        return this.numberOfLenses;
    }

    public void setNumberOfLenses(int numberOfLenses) throws NegativeException {
        if (numberOfLenses < 0) {
            throw new NegativeException("Nem lehet negatív!");
        } else {
            this.numberOfLenses = numberOfLenses;
        }
    }

    @Override
    public String toString() {
        return "Refractor telescope: " + super.toString() + ", number of lenses: " + this.numberOfLenses;
    }
}

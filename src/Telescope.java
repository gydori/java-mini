public abstract class Telescope {
    private double diameter;
    private int fLength;

    public Telescope(double diameter, int fLength) throws NegativeException {
        if (diameter < 0) {
            throw new NegativeException("Nem lehet negatív!");
        } else {
            this.diameter = diameter;
        }

        if (fLength < 0) {
            throw new NegativeException("Nem lehet negatív!");
        } else {
            this.fLength = fLength;
        }

    }

    public double getDiameter() {
        return this.diameter;
    }

    public void setDiameter(double diameter) throws NegativeException {
        if (diameter < 0) {
            throw new NegativeException("Nem lehet negatív!");
        } else {
            this.diameter = diameter;
        }
    }

    public int getfLength() {
        return this.fLength;
    }

    public void setfLength(int fLength) throws NegativeException {
        if (fLength < 0) {
            throw new NegativeException("Nem lehet negatív!");
        } else {
            this.fLength = fLength;
        }
    }

    @Override
    public String toString() {
        return "diameter: " + this.diameter + ", fLength: " + this.fLength;
    }

    public abstract boolean hasColorError();
}

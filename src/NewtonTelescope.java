public final class NewtonTelescope extends Telescope {

    private double secondMirrorSize;

    public NewtonTelescope(double diameter, int fLength, double secondMirrorSize) throws NegativeException {
        super(diameter, fLength);
        if (secondMirrorSize < 0) {
            throw new NegativeException("Nem lehet negatív!");
        } else {
            this.secondMirrorSize = secondMirrorSize;
        }
    }

    @Override
    public boolean hasColorError() {
        return false;
    }

    public double getSecondMirrorSize() {
        return this.secondMirrorSize;
    }

    public void setSecondMirrorSize(double secondMirrorSize) throws NegativeException {
        if (secondMirrorSize < 0) {
            throw new NegativeException("Nem lehet negatív!");
        } else {
            this.secondMirrorSize = secondMirrorSize;
        }
    }

    @Override
    public String toString() {
        return "Newton telescope: " + super.toString() + ", second mirror size: " + this.secondMirrorSize;
    }
}

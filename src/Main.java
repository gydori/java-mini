public class Main {
    public static void main(String[] args) {
        NewtonTelescope nt1 = new NewtonTelescope(1.3, 6, 2.4);
        System.out.println(nt1);
        RefractorTelescope rt1 = new RefractorTelescope(1.5, 4, 2);
        System.out.println(rt1);
    }
}

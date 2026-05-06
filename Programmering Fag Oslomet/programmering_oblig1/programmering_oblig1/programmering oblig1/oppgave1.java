package statiske;

public class oppgave1 {

    public static double beregnAreal(double radius) {
        double areal = Math.PI * Math.pow(radius, 2);
        return areal;
    }

    public static double beregnDiameter(double radius) {
        double diameter = (radius * 2);
        return diameter;
    }

    public static double beregnOmkrets(double radius) {
        double omkrets = Math.PI * radius * 2;
        return omkrets;
    }

    public static void main(String[] args) {
        double radius = 23.23;

        double areal = beregnAreal(radius);
        double diameter = beregnDiameter(radius);
        double omrekts = beregnOmkrets(radius);

        System.out.println("sikrel har radius med: " + radius + ".  Arealet til sirkel er "
                + String.format("%.2f", areal) + " og diameter er : " + String.format("%.2f", diameter)
                + ". i tilegg har du omkrets som er: " + String.format("%.2f", omrekts));

    }

}

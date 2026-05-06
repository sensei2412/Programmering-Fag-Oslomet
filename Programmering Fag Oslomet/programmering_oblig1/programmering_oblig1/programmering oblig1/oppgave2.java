import javax.swing.JOptionPane;

public class oppgave2 {
    private String navn;
    private int antall;
    private double pris;

    // Konstruktør med alle attributter
    public Vare(String navn, int antall, double pris) {
        this.navn = navn;
        this.antall = antall;
        this.pris = pris;
    }

    // Getters and Setters
    public String getNavn() {
        return navn;
    }
    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        if (antall > 0) {
            this.antall = antall;
        } else {
            System.out.println("Antall må være større enn null.");
        }
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        if (pris > 0) {
            this.pris = pris;
        } else {
            System.out.println("Pris må være større enn null.");
        }
    }

    // Metode for å beregne totalpris (pris * antall)
    public double beregnTotalPris() {
        return pris * antall;
    }
    public static void main(String[] args) {
        // Les inn navn, antall og pris for vare 1
        String navn1 = JOptionPane.showInputDialog("Skriv inn navn for vare 1:");
        int antall1 = 0;
        double pris1 = 0.0;
        try {
            antall1 = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall for vare 1:"));
            pris1 = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn pris for vare 1:"));
        } catch (NumberFormatException e) {
            System.out.println("Feil ved konvertering av antall eller pris for vare 1.");
            return;
        }
// Les inn navn, antall og pris for vare 2
        String navn2 = JOptionPane.showInputDialog("Skriv inn navn for vare 2:");
        int antall2 = 0;
        double pris2 = 0.0;
        try {
            antall2 = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall for vare 2:"));
            pris2 = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn pris for vare 2:"));
        } catch (NumberFormatException e) {
            System.out.println("Feil ved konvertering av antall eller pris for vare 2.");
            return;
        }

        // Opprett to vare-objekter med de innleste verdiene
        Vare vare1 = new Vare(navn1, antall1, pris1);
        Vare vare2 = new Vare(navn2, antall2, pris2);

        // Beregn totalpris for alle varer
        double totalPris = vare1.beregnTotalPris() + vare2.beregnTotalPris();

        // Skriv ut totalprisen
        System.out.println("Totalprisen ble: " + totalPris + " kr");
    }
}


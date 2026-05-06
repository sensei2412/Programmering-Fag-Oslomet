import javax.swing.*;
import java.util.Arrays;
import static javax.swing.JOptionPane.*;
import java.lang.String;


class Array {

    int[] bokser = new int [Integer.parseInt(visMelding("skriv inn hvor lang arrayen din skal være"))];

    public int tilfeldigTall() {
        return (int) (Math.random()* 900 + 100);
    }
    public String visMelding(String melding) {
        return JOptionPane.showInputDialog(null, melding);
    }


    public boolean skjekk(int tall) {
        for(int i = 0; i < bokser.length; i++) {

            if(bokser[i] == tall) {
                return true;
            }
        }
        return false;
    }

    public void fylle() {
        int tall = 0;
        for (int i = 0; i < bokser.length; i++) {
                if(skjekk(tall) == false) {
                    break;
                } else {
                    tall = tilfeldigTall();
                }
                bokser[i] = tall;
        }
    }

    public int minst() {
        Arrays.sort(bokser);
        return bokser[0];
    }

    public int storst() {
        Arrays.sort(bokser);
        return bokser[bokser.length-1];
    }

    public String gjennomSnitt() {
        double sum = 0;
        for(int i = 0; i< bokser.length; i++) {
            sum += bokser[i];
        }
        double gjennomsnitt = sum / bokser.length;

        String snitt = String.format("%.2f", gjennomsnitt);
        return snitt;

    }






}




public class Oblig3Oppgave1 {
    public static void main(String[] args) {

        Array oppg3 = new Array();
        oppg3.fylle();
        String ut = "\n";
        for(int i = 0; i < oppg3.bokser.length; i++ ) {
            if(oppg3.bokser[i] > 1) {
                ut += oppg3.bokser[i] + " ";
            }
            if(i%10 == 0 && i > 1) {
                ut += "\n";
            }
        }

        showMessageDialog(null, "minste tallet er:" + oppg3.minst() + " og største tallet er:  " + oppg3.storst() + " , men gjennomsnitett e: " +   oppg3.gjennomSnitt() + " " + ut);



    }
}
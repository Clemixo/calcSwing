package fr.formation.calcSwing.ihm;

import javax.swing.SwingUtilities;

public class Exec {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                CalcEcran ecran = new CalcEcran();
                ecran.setVisible(true);
            }
        });
    }

}

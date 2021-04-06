package fr.formation.calcSwing.ihm;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcEcran extends JFrame {

    private JTextField txA;
    private JTextField txB;
    private JButton btPlus;
    private JButton btMoins;
    private JButton btFois;
    private JButton btDiv;
    private JLabel lbRes;

    public void actionPlus() {
        try {
            Integer res = Integer.parseInt(getTxA().getText()) + Integer.parseInt(getTxB().getText());
            getLbRes().setText(res.toString());
        } catch (NumberFormatException e) {
            getLbRes().setText("Entier demandé");
        }
    }

    public void actionMoins() {
        try {
            Integer res = Integer.parseInt(getTxA().getText()) - Integer.parseInt(getTxB().getText());
            getLbRes().setText(res.toString());
        } catch (NumberFormatException e) {
            getLbRes().setText("Entier demandé");
        }
    }

    public void actionFois() {
        try {
            Integer res = Integer.parseInt(getTxA().getText()) * Integer.parseInt(getTxB().getText());
            getLbRes().setText(res.toString());
        } catch (NumberFormatException e) {
            getLbRes().setText("Entier demandé");
        }
    }

    public void actionDiv() {
        try {
            Integer res = Integer.parseInt(getTxA().getText()) / Integer.parseInt(getTxB().getText());
            getLbRes().setText(res.toString());
        } catch (NumberFormatException e) {
            getLbRes().setText("Entier demandé");
        }
    }

    public CalcEcran() {
        this.setTitle("Calculatrice");
        this.setSize(new Dimension(300, 300));
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        initIHM();
    }

    private void initIHM() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // première ligne
        gbc.gridy = 0;
        gbc.gridx = 0;
        panel.add(getTxA(), gbc);

        gbc.gridy = 0;
        gbc.gridx = 2;
        panel.add(getTxB(), gbc);

        // seconde ligne
        gbc.gridy = 1;
        gbc.gridx = 0;
        panel.add(getBtPlus(), gbc);

        gbc.gridy = 1;
        gbc.gridx = 2;
        panel.add(getBtMoins(), gbc);

        // troisième ligne
        gbc.gridy = 2;
        gbc.gridx = 0;
        panel.add(getBtFois(), gbc);

        gbc.gridy = 2;
        gbc.gridx = 2;
        panel.add(getBtDiv(), gbc);

        // Quatrième ligne
        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        panel.add(getLbRes(), gbc);

        this.setContentPane(panel);
    }

    private JButton getBtDiv() {
        if (btDiv == null) {
            btDiv = new JButton("/");
            btDiv.addActionListener(e -> actionDiv());
        }
        return btDiv;
    }

    private JButton getBtFois() {
        if (btFois == null) {
            btFois = new JButton("*");
            btFois.addActionListener(e -> actionDiv());
        }
        return btFois;
    }

    private JButton getBtMoins() {
        if (btMoins == null) {
            btMoins = new JButton("-");
            btMoins.addActionListener(e -> actionDiv());
        }
        return btMoins;
    }

    private JButton getBtPlus() {
        if (btPlus == null) {
            btPlus = new JButton("+");
            btPlus.addActionListener(e -> actionDiv());
        }
        return btPlus;
    }

    private JTextField getTxB() {
        if (txA == null) {
            txA = new JTextField(3);
        }
        return txA;
    }

    private JTextField getTxA() {
        if (txB == null) {
            txB = new JTextField(3);
        }
        return txB;

    }

    private JLabel getLbRes() {
        if (lbRes == null) {
            lbRes = new JLabel();
        }
        return lbRes;
    }

}

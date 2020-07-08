package pl.toxicproject;

import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private JFrame frame;
    private JLabel label;
    private JPanel panel;
    int count = 0;

    public GUI() {

        frame = new JFrame();

        JButton button = new JButton("- - - Click - - -");
        button.addActionListener(this);

        label = new JLabel("Number of clicks " + count);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Clicking");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks " + count);
    }
}

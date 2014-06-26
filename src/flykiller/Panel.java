/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flykiller;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Sandman
 */
public class Panel extends JPanel {

    public Timer timer;
    private JPanel jm = new JPanel();

    public Panel(Dimension d) {
        this.setSize(d);
        this.setPreferredSize(d);
        this.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        this.setBackground(Color.BLUE);
        this.repaint();
    }
}

package com.rock.exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Yan
 * @version 1.0
 * @date 2024/3/23
 */
public class Exercise extends JApplet implements ActionListener {
    public static void main(String[] args) {
        Exercise exercise = new Exercise();
        JFrame jFrame = new JFrame();
        jFrame.setLayout(new FlowLayout());
        Container contentPane = jFrame.getContentPane();
        JPanel jPanel = new JPanel();
        JButton jb = new JButton("理论");
        jb.add(exercise);
        jPanel.add(jb);
        contentPane.add(jPanel);
        jFrame.setSize(500,500);
        jFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("按下");

    }
}

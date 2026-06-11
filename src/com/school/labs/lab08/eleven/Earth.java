package com.school.labs.lab08.eleven;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Earth extends JLabel implements ActionListener {
    JLabel moon;
    Timer timer;
    double pointX[] = new double[360], pointY[] = new double[360];
    int w = 200, h = 200, i = 0;

    Earth() {
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(w, h));
        timer = new Timer(20, this);           // 【代码1】创建timer,振铃间隔20毫秒
        setIcon(new ImageIcon("earth.jpg"));
        setHorizontalAlignment(SwingConstants.CENTER);
        moon = new JLabel(new ImageIcon("moon.jpg"), SwingConstants.CENTER);
        add(moon);
        moon.setPreferredSize(new Dimension(60, 60));
        pointX[0] = 0;
        pointY[0] = h / 2;
        double angle = 1 * Math.PI / 180;
        for (int i = 0; i < 359; i++) {
            pointX[i + 1] = pointX[i] * Math.cos(angle) - Math.sin(angle) * pointY[i];
            pointY[i + 1] = pointY[i] * Math.cos(angle) + pointX[i] * Math.sin(angle);
        }
        for (int i = 0; i < 360; i++) {
            pointX[i] = 0.8 * pointX[i] + w / 2;
            pointY[i] = 0.8 * pointY[i] + h / 2;
        }
        timer.start();
    }

    public void actionPerformed(ActionEvent e) {
        i = (i + 1) % 360;
        moon.setLocation((int) pointX[i] - 30, (int) pointY[i] - 30);
    }
}

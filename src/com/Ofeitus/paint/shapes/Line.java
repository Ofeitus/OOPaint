package com.Ofeitus.paint.shapes;

import com.Ofeitus.paint.Shape;

import java.awt.*;

public class Line extends Shape {

    public Line(int x, int y, int x1, int y1) {
        super(x, y, x1, y1);
    }

    public void draw(Graphics2D g2) {
        g2.setColor(strokeColor);
        g2.setStroke(new BasicStroke(stroke));
        g2.drawLine(x, y, x1, y1);
    }
}
package com.Ofeitus.paint.shapes;

import java.awt.*;

import static java.lang.Math.abs;
import static java.lang.Math.min;

public class Rectangle extends PrimitiveShape {

    public Rectangle(int x, int y, int x1, int y1) {
        super(x, y, x1, y1);
    }

    public void draw(Graphics2D g2) {
        g2.setStroke(stroke);
        g2.setColor(fillColor);
        g2.fillRect(min(x, x1), min(y, y1), abs(x - x1), abs(y - y1));
        g2.setColor(strokeColor);
        g2.drawRect(min(x, x1), min(y, y1), abs(x - x1), abs(y - y1));
    }
}

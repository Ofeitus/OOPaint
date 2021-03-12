package com.Ofeitus.paint.shapeFactories;

import com.Ofeitus.paint.Shape;
import com.Ofeitus.paint.ShapeFactory;
import com.Ofeitus.paint.shapes.PolyLine;

public class PolyLineFactory extends ShapeFactory {

    @Override
    public Shape factoryMethod(int x, int y, int x1, int y1, int option) {
        return new PolyLine(x, y, x1, y1);
    }
}
import java.awt.*;
import java.awt.Color;
import java.awt.geom.Rectangle2D;

public class PRectangle extends PShape {
    Color color;
    int x, y, w, h;
    float stroke;

    public PRectangle(int x, int y, int w, int h) {
        super();
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        color = Color.black;
        stroke = 2.0f;
    }

    public void draw(Graphics2D g2) {
        g2.setColor(color);
        g2.setStroke(new BasicStroke(stroke));
        g2.draw(new Rectangle2D.Double(x, y, w, h));
    }
}

import TurtleGraphics.*;
import BreezySwing.*;
import java.awt.Color;

public class ShapeMaker {

    public static void main(String[] args) {
        Pen p = new RainbowPen(new SketchPadWindow (400,400));
        Shape s1 = new Circle (20,20,20);
        Shape s2 = new Wheel (-20,-20,20,6);
        s1.draw(p);
        s2.draw(p);
        
    }
}

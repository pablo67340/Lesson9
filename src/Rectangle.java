
import TurtleGraphics.Pen;

public class Rectangle extends AbstractShape {

    private double width, height;

    public Rectangle(){
        super();
        width = 1;
        height = 1;
    }

    public Rectangle(double x, double y, double w, double h){
        super(x,y);
        width = w;
        height = h;
    }

    public double area(){
        return width * height;
    }
    
    public void stretchBy(double factor){
        width *= factor;
        height *= factor;
    }

    public void draw(Pen p){
        p.up();
        p.move(xPos, xPos);
        p.down();
        p.setDirection(0);
        p.move(width);
        p.turn(-90);
        p.move(height);
        p.turn(-90);
        p.move(width);
        p.turn(-90);
        p.move(height);
    }

    public String toString(){
        String str = "This is a Rectangle\n";
        str += "Width: " + width + "\tHeight: " + height + "\n";
        str += "\n" + super.toString();
        return str;
    }

}

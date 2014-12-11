
import TurtleGraphics.Pen;

public class Circle extends AbstractShape{

    protected double radius;

    public Circle(){
        super();
        radius = 1;
    }

    public Circle(double x, double y, double r){
        super(x,y);
        radius = r;
    }

    public double area(){
        return Math.PI * radius * radius;
    }
    
    public void stretchBy(double factor){
        radius *= factor;
    }

    public void draw(Pen p){
        double side = 2.0 * Math.PI * radius / 120;
        p.up();
        p.move(xPos + radius, xPos - side / 2.0);
        p.down();
        p.setDirection(90);
        for (int i = 0; i < 120; i++) {
            p.move(side);
            p.turn(3);
        }

    }
    
    public String toString(){
        String str = "This is a CIRCLE\n";
        str += "Radius: " + radius + "\n";
        str += "\n"+super.toString();
        return str;
    }

}

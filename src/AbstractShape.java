
abstract public class AbstractShape implements Shape {
    protected double xPos, yPos;
    
    public AbstractShape(){
        xPos=0;
        yPos=0;
        
    }
    public AbstractShape(double x, double y){
        xPos=x;
        yPos=y;
    }
    public final double getXPos(){
        return xPos;
    }
    public final double getYPos(){
        return yPos;
    }
    public final void move(double xLoc, double yLoc){
        xPos = xLoc;
        yPos = yLoc;
    }
    public String toString(){
        String str = "X-Y Position "+xPos+", "+ yPos;
        str +="\nArea= "+area();
        return str;
    }
}

class Circle {
    private double r;
    private double d;
    private double l;

    void setR(double r1){
        r = r1;
        d = 2*r1;
        l = d*Math.PI;
    }

    double getR(){
        return r;
    }
    double getD(){
        return d;
    }
    double getL(){
        return l;
    }
}

public class CircleTest{
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setR(3);

        System.out.println("Radius: " + circle.getR() + "\nDiameter: " + circle.getD() + "\nLength: " + circle.getL());
    }
}
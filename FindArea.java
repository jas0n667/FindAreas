import java.awt.*;

public class FindArea {
    public static void main(String[] args) {
        Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(8, 5);
        Triangle t = new Triangle(10, 8, 9);

        Figure figure;
        figure = r;
        r.getArea();

        figure = t;
        t.getArea();

        figure = f;
        System.out.println("Figure's area equals to " + f.area());
    }
}

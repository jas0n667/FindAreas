public class Triangle extends Figure{
    double dim3;

    Triangle(double d1, double d2, double d3){
        super(d1, d2);
        dim3 = d1;
    }

    double area(){
        double halfP = (dim1 + dim2 + dim3) / 2;
        return Math.sqrt(halfP * (halfP-dim1) * (halfP-dim2) * (halfP-dim3));
    }

    void getArea(){
        System.out.println("Triangle's area : " + area());
    }


}

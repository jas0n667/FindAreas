class Rectangle extends Figure{
    Rectangle(double d1, double d2){
        super(d1, d2);
    }

    double area(){
        return dim1*dim2;
    }

    void getArea(){
        System.out.println("Rectangle's area : " + area());
    }


}

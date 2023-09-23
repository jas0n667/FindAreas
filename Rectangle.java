class Rectangle extends Figure{
    Rectangle(double d1, double d2){
        super(d1, d2);
    }

    void getArea(){
        System.out.println("Rectangle's area : " + super.area());
    }


}

class Rectangle extends Figure{
    Rectangle(int d1, int d2){
        super(d1, d2);
    }

    void getArea(){
        System.out.println("Rectangle's area : " + super.area());
    }


}

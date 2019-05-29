package src;

public class SquareTest  {
    public static void main(String[] args) {

        //Tao 1 mảng square,1 ptu mang, hien thi dien tich của nó
        //Nếu phần tử đó là colorable thi gọi ra howToColor
        Square[]  squares = new Square[3];

        squares[0] = new Square(2.3);
        double dt1 = squares[0].getPerimeter();
        squares[1] = new Square();
        double dt2 = squares[1].getPerimeter();
        squares[2] = new Square(5.8,"yellow",true);
        double dt3 = squares[2].getPerimeter();


    }
}

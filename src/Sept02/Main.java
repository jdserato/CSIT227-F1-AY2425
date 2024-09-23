package Sept02;

public class Main {
    public static void main(String[] args) {
        Object rect = new Rectangle(4, 7);
        System.out.println(rect.toString());
//        System.out.println(rect.area());
//        System.out.println(rect.perimeter());
        Shape squ = new Rectangle.Square(5);
        System.out.println(squ.area());
        System.out.println(squ.perimeter());
    }
}

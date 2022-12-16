public class Main {
    public static void main(String[] args) {
        System.out.println("введите радиус круга\n");
        Kolo kolo = new Kolo(Kolo.s);
        System.out.printf("Коло" + kolo.getfigury() + "\n");
        System.out.println("введите сторону квадрата");
        Square square = new Square(Square.s);
        System.out.println("Квадрат" + square.getfigury() + "\n");


        Trungls trungls = new Trungls(Trungls.s);
        System.out.println("Треугольник" + trungls.getfigury() + "\n");


        double obshaya = kolo.getfigury() + trungls.getfigury() + square.getfigury();
        System.out.println("общая сумма\n");
        System.out.printf("%.2f.", obshaya);
    }
}

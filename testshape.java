public class testshape {
    public static void main(String[] args){
        Shape shape = new Shape();
        shape.describe();
        Rectanglr r = new Rectanglr(3,4);
        r.describe();


        Rectanglr r1 = new Rectanglr(blue,white);
        Rectanglr r2 = new Rectanglr(blue,white);
        System.out.println(r1.equals(r2));
    }
}

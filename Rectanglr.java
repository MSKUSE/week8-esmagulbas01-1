public class Rectanglr extends Shape{
    int sideA = 0 , sideB = 0 ;
    public Rectanglr(){

    }

    public Rectanglr(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }



    @Override
    public void describe() {
        super.describe();
        System.out.println("sideA"+ sideA+"sideB"
                +sideB);
    }

    @Override
    public boolean equals(Object obj) {
        Rectanglr rectanglr = (Rectanglr) Object;

       if (this.SideA==rectanglr.sideA
       && this.sideB == rectanglr.sideB
       && this.getcolor().equals(rectanglr.getcolor()){
           return true;
        }

    }
}

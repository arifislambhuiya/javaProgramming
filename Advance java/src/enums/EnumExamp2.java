package enums;


enum Color {
RED,WHITE,GREEN,YELLOW,BLACK
}

class Test {
    Color myColor;
    public Test(Color myColor) {
        this.myColor = myColor;
    }
    public void orderPizza() {
        switch(myColor) {
            case RED:
                System.out.println("I like red color");
                break;
            case WHITE:
                System.out.println("I like white color");
                break;
            default:
                System.out.println("I don't know what color i like.");
                break;
        }
    }
}

public class EnumExamp2 {
    public static void main(String[] args) {
        Test t1 = new Test(Color.WHITE);
        t1.orderPizza();
    }
}
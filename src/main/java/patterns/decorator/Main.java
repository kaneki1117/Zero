package patterns.decorator;

public class Main {


    public static void main(String[] args) {
        Beverage moca = new Moca();
        CocoCondiment cocoCondiment = new CocoCondiment(moca);
        System.out.println(cocoCondiment.getCost());
    }
}

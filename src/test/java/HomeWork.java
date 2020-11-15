public class HomeWork {
    public static void main(String[] args) {
        creditCalculator();
        stringCounter();
    }
    public static void creditCalculator() {
        float startSum = 4000;
        float percents = 2.5f;
        float percentSum =  startSum * percents / 100;
        float finalSum = startSum + percentSum;
        System.out.println("Percents sum: " + percentSum);
        System.out.println("Final sum: " + finalSum);
    }
    public static void stringCounter() {
        String myString = "Hello world";
        System.out.println(myString.length());
    }
}

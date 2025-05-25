public class FClass1 {
    public static void main(String args[]) {
        int x;
        x = 1;

        if (x) { // It Will Generate Error, Since It Can't Conver Integer To Boolean
            System.out.println(x);
        } else {
            System.out.println("2");
        }
    }
}

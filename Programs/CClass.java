class Point {

    private int x;
    private int y;

    public Point(int x, int z) {
        x = x;
        y = z;
    }

    public void printPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }

}

class CClass {
    public static void main(String[] args) {

        Point p = new Point(10, 20);
        p.printPoint();

    }
}

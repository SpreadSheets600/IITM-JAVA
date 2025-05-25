class Employee {
    int eid;
    String ename;

    public void display() {
        System.out.println("eid: " + eid);
        System.out.println("ename: " + ename);
    }
}

class FClass4 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.display();
    }
}

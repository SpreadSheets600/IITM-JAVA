import java.util.*;

class Employee {
    String eid;
    String ename;
    String eprojects[];

    public Employee(String id, String name, String[] projects) {
        this.eid = id;
        this.ename = name;
        this.eprojects = projects.clone();
    }

    public Employee(Employee e) {
        this.eid = e.eid;
        this.ename = e.ename;
        this.eprojects = e.eprojects.clone();
    }

    public void display() {
        System.out.println("id:" + this.eid);
        System.out.println("name:" + this.ename);
        System.out.println("projects:");

        for (String project : this.eprojects) {
            if (project != null) {
                System.out.print(project + ":");
            }
        }
        System.out.println();
    }

    public void mutator() {
        this.ename = "Mr " + this.ename;
        this.eprojects[0] = null;
    }

}

public class FClass2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String project[] = { "P001", "P002", "P003" };

        // Enter the ID of the employee
        String id = s.nextLine();

        // Enter the name of the employee
        String name = s.nextLine();

        // Create an Employee object using the parameterized constructor
        Employee e1 = new Employee(id, name, project);

        // Create a copy of the Employee object using the copy constructor
        Employee e2 = new Employee(e1);

        // Mutate the data of the first employee
        e1.mutator();

        // Display the details of the second employee
        e2.display();
    }
}

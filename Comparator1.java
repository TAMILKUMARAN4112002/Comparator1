import java.util.*;
class Demo6 implements Comparator<Employee>{
    @Override
    public int compare(Employee e1,Employee e2){
        Integer id1 = e1.getId();
        Integer id2 = e2.getId();

        return -1 * id1.compareTo(id2);
    }
}
class Demo1 implements Comparator<Employee>{
    @Override
    public int compare(Employee e1,Employee e2){
        Integer id1 = e1.getId();
        Integer id2 = e2.getId();

        return  id1.compareTo(id2);
    }
}
class Demo2  implements Comparator<Employee>{
    @Override
    public int compare(Employee e1,Employee e2){
        String  name1 = e1.getName();
        String name2  = e2.getName();

        return  name1.compareTo(name2);
    }
}
class Demo3 implements Comparator<Employee>{
    @Override
    public int compare(Employee e1,Employee e2){
        String email1 = e1.getEmail();
        String email2 = e2.getEmail();

        return  email1.compareTo(email2);
    }
}
class Demo4 implements Comparator<Employee>{
    @Override
    public int compare(Employee e1,Employee e2){
        Integer salary1 = e1.getSalary();
        Integer salary2 = e2.getSalary();

        return  salary1.compareTo(salary2);
    }
}
class Demo5 implements Comparator<Employee>{
    @Override
    public int compare(Employee e1,Employee e2){
        String department1 = e1.getDepartment();
        String department2 = e2.getDepartment();

        return  department1.compareTo(department2);
    }
}
class Employee  {
    private int id;
    private String name;
    private String email;
    private int salary;
    private String department;

    public Employee(){

    }
    public Employee(int id, String name, String email, int salary, String department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + email + " " + salary + " " + department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


}
public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Demo1 d1= new Demo1();
             Demo2 d2 = new Demo2();
             Demo3 d3 = new Demo3();
             Demo4 d4 = new Demo4();
             Demo5 d5 = new Demo5();
            Demo6 d6 = new Demo6();
             System.out.println("Sort Based On\n 1.ID(High to Low)\n  2.ID(lOW to High)\n 3.Name\n 4.Email\n 5.Salary\n 6.Department\n Enter an option: ");
             int option = sc.nextInt();
             TreeSet<Employee> map = null;
             switch (option){
                 case 1 :map = new TreeSet<Employee>(d1);
                  break;
                 case 2 :map = new TreeSet<Employee>(d6);
                 break;
                 case 3 :map = new TreeSet<Employee>(d2);
                 break;
                 case 4 :map = new TreeSet<Employee>(d3);
                 break;
                 case 5:map = new TreeSet<Employee>(d4);
                 break;
                 case 6:map = new TreeSet<Employee>(d5);
                 break;
                 default:
                     System.out.println("Invalid Input");
                     break;
             }
             System.out.print("Enter the how many player : ");
             int n = sc.nextInt();
            sc.nextLine();
            for(int i=0;i<n;i++){
                Employee e1 = new Employee();
                System.out.println("Enter the details");
                String str =sc.nextLine();
                String arr[] = str.split(",");
                e1.setId(Integer.parseInt(arr[0]));
                e1.setName(arr[1]);
                e1.setEmail(arr[2]);
                e1.setSalary(Integer.parseInt(arr[3]));
                e1.setDepartment(arr[4]);

                map.add(e1);
            }


            System.out.println(map);




        }
    }

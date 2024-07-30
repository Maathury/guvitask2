
public class Person {
    String name;
    int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Person name:"+name );
        System.out.println("Person age:"+age);
    }

    }


class Employee extends Person{
    String employeeId;
    double salary;

    public Employee(String name,int age,String employeeId,double salary){
        super(name, age);
        this.employeeId=employeeId;
        this.salary=salary;

    }

   public void display(){
        super.display();
       System.out.println("Employee Id:"+employeeId);
       System.out.println("Salary :"+salary);
    }

    public static void main(String[] args) {
        Employee employee=new Employee("Maathury",25,"AB067",45000);
        employee.display();
    }
}


import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student(101,"haris",new Adress("lahore","Bahria town"),new Stationary(888,"Pencil"));
        System.out.println(s1);



       Employee e1 = new Employee("202","Minahil",new Adress("lahore","Bahria town"));
        //deep copy with constructor
        Employee e2 = new Employee(e1);
        System.out.println(e2);  //copy constructor deep copy with composition
        //deep copy with clone
        e2= (Employee) e1.clone();
        System.out.println(e2);








        /*Student s1 = new Student(1,"haris");
        //Student s2 = new Student(s1);
        System.out.println(s2.getName());
        System.out.println(s2.getId());

        //Overloading method
        System.out.println(s1.sum(5,6));
        System.out.println(s1.sum(10,11,12));
        System.out.println(s1.sum(12.1,13.1));

        //equals
        System.out.println(s1.equals(s2));

        //clone
        s2 = (Student)s1.clone();
        System.out.println(s2);*/
    }



}
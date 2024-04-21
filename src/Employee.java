import java.util.Objects;

public class Employee {

private String empId;
private String empName;
private Adress add;


    public Employee(String empId, String empName, Adress add) {
        this.empId = empId;
        this.empName = empName;
        this.add = add;
    }
    Employee(Employee other){
       this.empId= other.empId;
       this.empName= other.empName;
       this.add=other.add;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(empId, employee.empId) && Objects.equals(empName, employee.empName) && Objects.equals(add, employee.add);
    }


    public Object clone(){
        return  new Employee(this.empId,this.empName,this.add);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", add=" + add +
                '}';
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }





    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Adress getAdd() {
        return add;
    }

    public void setAdd(Adress add) {
        this.add = add;
    }
}

import java.util.Objects;

public class Student {

   private int id;
   private String name;
   private Adress add;

   private Stationary stat;




    //constructor
    Student(int id,String name,Adress add,Stationary stat){
      this.id=id;
      this.name=name;
      this.add=add;
      this.stat=stat;
      //System.out.println(id);
        // System.out.println(name);
   }

 //copy Constructor
   Student(Student other){
   this.id= other.id;
   this.name= other.name;
   this.add= other.add;
   this.stat=other.stat;
   }

   public Object clone(){
        return new Student(this.id,this.name,this.add,this.stat);
   }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(add, student.add) && Objects.equals(stat, student.stat);
    }



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", add=" + add +
                ", stat=" + stat +
                '}';
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

    public Adress getAdd() {
        return add;
    }

    public void setAdd(Adress add) {
        this.add = add;
    }

    public Stationary getStat() {
        return stat;
    }

    public void setStat(Stationary stat) {
        this.stat = stat;
    }
}






/*    //method overloading
    public int sum(int x , int y){
        return x+y;
    }
    public int sum(int x , int y,int z){
        return x+y+z;
    }
    public double sum(double x , double y){
        return x+y;
    }*/








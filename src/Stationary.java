import java.util.Objects;

public class Stationary {

    private  int sId;
    private  String sName;


    public Stationary(int sId, String sName) {
        this.sId = sId;
        this.sName = sName;
    }
    Stationary(Stationary other){
      this.sId=other.sId;
      this.sName=other.sName;
    }


    public Object clone(){
        return  new Stationary(this.sId,this.sName);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stationary that = (Stationary) o;
        return sId == that.sId && Objects.equals(sName, that.sName);
    }



    @Override
    public String toString() {
        return "Stationary{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                '}';
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
}

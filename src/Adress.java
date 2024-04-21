import java.util.Objects;

public class Adress {
    private String cityName;
    private String streetName;


    public Adress(String cityName, String streetName) {
        this.cityName = cityName;
        this.streetName = streetName;
    }

    @Override
    public Object clone(){
      return new Adress (this.cityName, this.streetName);
    }

    public String toString(){
      return String.format("The city name is %S | The street name is %S",cityName,streetName);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return Objects.equals(cityName, adress.cityName) && Objects.equals(streetName, adress.streetName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityName, streetName);
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetName() {
        return streetName;
    }
}

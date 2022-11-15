package main;
// adding comment for git commit
// adding comment for conflict
public class Address implements Cloneable{
    private int id;

    private String streetName;
    private String city;
    private String state;

    public Address(String streetName, String city, String state) {
        this.streetName = streetName;
        this.city = city;
        this.state = state;
    }

    public Address() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    protected Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

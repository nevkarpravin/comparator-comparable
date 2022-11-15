package main;

import java.util.Date;

public final class ImmutableStudent {
    private int id;
    private String name;
    private Address address;
    private Date date;

    @Override
    public String toString() {
        return "ImmutableStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address.toString() + ", date = '" + date+
                '}';
    }

    public ImmutableStudent(int id, String name, Address address, Date date) throws CloneNotSupportedException {
        this.id = id;
        this.name = name;
        this.address = address.clone();
        this.date = (Date) date.clone();
       // this.date = new Date(date.getTime());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Date getDate() {
        return date;
    }
  public Address getAddress() {
        return address;
    }
}

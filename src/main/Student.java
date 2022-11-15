package main;

public class Student implements Cloneable, Comparable<Student>{

    public int id;
    private String name;
    private int age;
   // private Address address;

    public static String collegeName = "ABC College";

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
       // this.address = address;
    }

    //Getter
    public int getId(){
        return id;
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
       // student.address = address.clone();
        return student;
    }

    //Setter
    public void setId(int id){
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public Student() {
    }


    public void sampleMethod(){
        System.out.println("In Student  Class SampleMethod");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student student) {

        return Integer.compare(this.id, student.id);
    }
}

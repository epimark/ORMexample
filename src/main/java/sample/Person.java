package sample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "person")
public class Person {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "f_name")
    private String firstName;
    @Column(name = "l_name")
    private String lastName;
    @Column(name = "age")
    private int age;

    public Person(){

    }

    public Person(String firstName,String lastName,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}

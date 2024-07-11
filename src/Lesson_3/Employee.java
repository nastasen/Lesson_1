package Lesson_3;

public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;

    public Employee(String firstName, String lastName,String position, String email, int phoneNumber, int salary, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setPosition(position);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        setSalary(salary);
        setAge(age);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition(){
        return position;
    }

    public String getEmail() {
        return email;
    }

    public int getAge(){
        return age;
    }

    public int getSalary(){
        return salary;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public String getFullName() {
        return getLastName() + " " + getFirstName();
    }

    public void setFirstName(String firstName) {
        if (firstName.length() > 1) {
            this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        } else {
            this.firstName = firstName.toUpperCase();
        }
    }

    public void setLastName(String lastName) {
        if (lastName.length() > 1) {
            this.lastName = Character.toUpperCase(lastName.charAt(0)) + lastName.substring(1).toLowerCase();
        } else {
             this.lastName = lastName;
        }
    }

    public void setPosition(String position){
        this.position=position;
    }
    public void setSalary(int salary) {
        this.salary=salary;
    }
    public void setEmail(String email) {
        this.email= email;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber=phoneNumber;

    }
}

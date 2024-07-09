package Lesson_3;

public class Employee {
    private String firstName;
    private String lastName;
    private String email;
    private int salary;
    private int age;
    private int phoneNumber;

    public static class Park{
        private String park;
        private int timeOpen;
        private int timeClose;

        public Park(String park, int timeOpen, int timeClose){
            this.timeOpen=timeOpen;
            this.timeClose=timeClose;
            this.park=park;
        }

        public int getTimeOpen() {
            return timeOpen;
        }

        public int getTimeClose(){
            return timeClose;
        }

        public String getPark(){
            return park;
        }

        public int setTimeOpen(){


            return timeOpen;
        }

        public int setTimeClose(){

            return timeClose;
        }

        public String setPark(){

            return park;
        }
    }
    public Employee(String firstName, String lastName, String email, int phoneNumber, int salary, int age) {

        setFirstName(firstName);
        setLastName(lastName);
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


    public void setEmail(String email) {
        this.email= email;
    }

    private void setAge(int age) {
        this.age=age;
    }

    private void setSalary(int salary) {
        this.salary=salary;

    }

    private void setPhoneNumber(int phoneNumber) {
        this.phoneNumber=phoneNumber;

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

    public String getFullName() {
        return getLastName() + " " + getFirstName();
    }
}

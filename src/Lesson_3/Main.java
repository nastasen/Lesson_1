package Lesson_3;

public class Main {
    public static void main(String[] args){

            Employee emp1=new Employee("Ivan","IvanoV","some1@mail.com", 1234567,20000,20);
            Employee emp2=new Employee("semen","Sidorov","some2@mail.com", 102136,50000,23);
            Employee emp3=new Employee("PAVEL","Ponomarev","some3@mail.com", 184541,30000,28);
            Employee emp4=new Employee("AnDrey","AhUjkrby","some4@mail.com", 65412,40000,33);
            Employee emp5=new Employee("Evgeni","Taran","some5@mail.com", 654122,100000,35);

                System.out.println(emp1.getFullName()+" "+emp1.getEmail()+" "+emp1.getPhoneNumber()+" "+emp1.getSalary()+" "+emp1.getAge());
                System.out.println(emp2.getFullName()+" "+emp2.getEmail()+" "+emp2.getPhoneNumber()+" "+emp2.getSalary()+" "+emp2.getAge());
                System.out.println(emp3.getFullName()+" "+emp3.getEmail()+" "+emp3.getPhoneNumber()+" "+emp3.getSalary()+" "+emp3.getAge());
                System.out.println(emp4.getFullName()+" "+emp4.getEmail()+" "+emp4.getPhoneNumber()+" "+emp4.getSalary()+" "+emp4.getAge());
                System.out.println(emp5.getFullName()+" "+emp5.getEmail()+" "+emp5.getPhoneNumber()+" "+emp5.getSalary()+" "+emp5.getAge());

        Employee [] empNext=new Employee[5];
        empNext[0]=new Employee("Alice","6 Wonder","some6@mail.com", 654122,100000,35);
        empNext[1]=new Employee("Alice","7 Wonder","some7@mail.com", 654122,100000,35);
        empNext[2]=new Employee("Alice","8 Wonder","some8@mail.com", 654122,100000,35);
        empNext[3]=new Employee("Alice","9 Wonder","some9@mail.com", 654122,100000,35);
        empNext[4]=new Employee("Alice","10 Wonder","some10@mail.com", 654122,100000,35);
        System.out.println("-----------------------------------------------------------------------------");
        for(int i=0;i<5;i++) {
            System.out.println(empNext[i].getFullName() + " " + empNext[i].getEmail() + " " + empNext[i].getPhoneNumber() + " " + empNext[i].getSalary() + " " + empNext[i].getAge());
        }
        System.out.println("-----------------------------------------------------------------------------");
        Employee.Park p1=new Employee.Park("Park Victory",10,18);
        System.out.println(p1.getPark()+" часы работы: "+p1.getTimeOpen()+"-"+p1.getTimeClose());

    }


}

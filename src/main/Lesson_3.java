package main;

public class Lesson_3 {
    public static void main(String[] args){

            Employee emp1=new Employee("Ivan","IvanoV","Worker","some1@mail.com", 1234567,20000,20);
            Employee emp2=new Employee("semen","Sidorov","QC","some2@mail.com", 102136,50000,23);
            Employee emp3=new Employee("PAVEL","Ponomarev","QA","some3@mail.com", 184541,30000,28);
            Employee emp4=new Employee("AnDrey","AhUjkrby","somePosition","some4@mail.com", 65412,40000,33);
            Employee emp5=new Employee("Evgeni","Taran","Principal","some5@mail.com", 654122,100000,35);

            System.out.println(emp1.getFullName()+" "+emp1.getPosition()+" "+emp1.getEmail()+" "+emp1.getPhoneNumber()+" "+emp1.getSalary()+" "+emp1.getAge());
            System.out.println(emp2.getFullName()+" "+emp2.getPosition()+" "+emp2.getEmail()+" "+emp2.getPhoneNumber()+" "+emp2.getSalary()+" "+emp2.getAge());
            System.out.println(emp3.getFullName()+" "+emp3.getPosition()+" "+emp3.getEmail()+" "+emp3.getPhoneNumber()+" "+emp3.getSalary()+" "+emp3.getAge());
            System.out.println(emp4.getFullName()+" "+emp4.getPosition()+" "+emp4.getEmail()+" "+emp4.getPhoneNumber()+" "+emp4.getSalary()+" "+emp4.getAge());
            System.out.println(emp5.getFullName()+" "+emp5.getPosition()+" "+emp5.getEmail()+" "+emp5.getPhoneNumber()+" "+emp5.getSalary()+" "+emp5.getAge());

        Employee [] empNext=new Employee[5];
            empNext[0]=new Employee("Alice","Wonder","position 6 ","some6@mail.com", 654122,100000,35);
            empNext[1]=new Employee("Alice","Wonder","position 7 ","some7@mail.com", 654122,100000,35);
            empNext[2]=new Employee("Alice","Wonder","position 8 ","some8@mail.com", 654122,100000,35);
            empNext[3]=new Employee("Alice","Wonder","position 9 ","some9@mail.com", 654122,100000,35);
            empNext[4]=new Employee("Alice","Wonder","position 10 ","some10@mail.com", 654122,100000,35);
        System.out.println("-----------------------------------------------------------------------------");
            for(int i=0;i<5;i++) {
                System.out.println(empNext[i].getFullName() + " "+empNext[i].getPosition()+" " + empNext[i].getEmail() + " " + empNext[i].getPhoneNumber() + " " + empNext[i].getSalary() + " " + empNext[i].getAge());
            }
        System.out.println("-----------------------------------------------------------------------------");

            Employee.Park p1=new Employee.Park("Park Victory",10,18);
            Employee.Park p2=new Employee.Park();
                p2.setPark("Gagarin");
                p2.setTimeOpen(11);
                p2.setTimeClose(19);
        System.out.println("Парк: "+p1.getPark()+"\n"+"Часы работы: "+p1.getTimeOpen()+"-"+p1.getTimeClose());
        System.out.println("Парк: "+p2.getPark()+"\n"+"Часы работы: "+p2.getTimeOpen()+"-"+p2.getTimeClose());

    }


}

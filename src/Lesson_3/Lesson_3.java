package Lesson_3;

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

        Park p1=new Park("Park Victory");
        System.out.println("Парк: "+p1.getPark());
        Park.Attraction a1= new Park.Attraction();
        Park.Attraction a2= new Park.Attraction("car",10,20);
        a1.setSlides("Горки");
        a1.setTime(10);
        a1.setPrice(30);
        System.out.println(a1.getSlides()+"\n"+"Работает с:  "+ a1.getTime()+"\n"+"Стоимость: "+a1.getPrice());
        System.out.println(a2.getSlides()+"\n"+"Работает с:  "+ a2.getTime()+"\n"+"Стоимость: "+a2.getPrice());
    }


}

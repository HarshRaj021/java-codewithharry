package ch08_oops.practiceQuestions;
class Employee {
    static int salary;
    static String name;
    public int getSalary(){
        return salary;

    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    }

public class Question1 {
    public static void main(String[] args) {
        Employee harsh = new Employee();

        Employee.name ="HARSH";
        Employee.salary = 14; 
        
        System.out.println(harsh.getName());
        System.out.println(harsh.getSalary());
        harsh.setName("harshu");
        System.out.println(harsh.getName());
    }
}


    
     
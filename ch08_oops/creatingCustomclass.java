package ch08_oops;

class Employee{
int id;
String name;
public void printDetails(){
    System.out.println("MY ID IS :\t" + id);
    System.out.println("MY NAME IS :\t" + name);
}
}
public class creatingCustomclass {
    public static void main(String[] args) {
        System.out.println("THIS IS OUR CUSTOM CLASS");
        Employee harsh = new Employee();
        Employee ankita = new Employee();

        harsh.id = 21;
        harsh.name = "BOSS HARSH";
        ankita.id = 22;
        ankita.name = "BOSS Anki";
       /*  System.out.println(harsh.id);
        System.out.println(harsh.name); */
        harsh.printDetails();
        ankita.printDetails();
    }
    

}


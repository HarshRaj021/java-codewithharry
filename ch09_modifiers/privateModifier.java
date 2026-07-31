package ch09_modifiers;
class Employee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}

public class privateModifier {
    public static void main(String[] args) {
        Employee harsh = new Employee();

        harsh.setName("harshu");
        System.out.println(harsh.getName());
        
    }
    
}

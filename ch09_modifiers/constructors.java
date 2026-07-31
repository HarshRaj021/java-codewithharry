package ch09_modifiers;


    class MyEmployee{
        private int id;
        private String name;
        
        public MyEmployee(String MyName,  int MyId ){
            id = MyId;
            name = MyName;
        }
        
        public String getName(){return name;}
        public void setName(String n) {this.name =n;}
        public void setId(int i){this.id= i;}
        public int getId() {return id;}
    }

    public class constructors {
        public static void main(String[] args) {
            MyEmployee harsh = new MyEmployee("harsh",12 );
           
            System.out.println(harsh.getId());
            System.out.println(harsh.getName());
        }

    
}

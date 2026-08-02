package ch11_abstract;
interface camera{
    void takesnap();
    void recordVideo();
    private void greet7(){
        System.out.println("good morning");
    }
    default void record4kvideo(){
        System.out.println("recording in 4k");
    }
}
interface wifi{
    String[] getNetwork();
    void connecttonetwork(String network);
}
class mycellphone{
    void callnumber(int phonenumber){
        System.out.println("calling" + phonenumber);
    }
    void pickcall(){
        System.out.println("connecting....");
    }
  
}
class smartphone65 extends mycellphone implements wifi , camera{
     public  void takesnap(){
    
        System.out.println("taking snap");
    }
    public void recordvideo(){
        System.out.println("recording video");
    }
    public String[] getNetwork(){
        System.out.println("geting list of nos");
        String[] networkList = {"harsh","shivam","nikhil"};
        return networkList;
    }
    @Override
    public void recordVideo() {
        
        System.out.println("recording video");
    }
    @Override
    public void connecttonetwork(String network) {
        
        System.out.println("connecting to network");
    }
}
public class defaultMethods {
    public static void main(String[] args) {
        smartphone65 hr = new smartphone65();
        hr.record4kvideo();

        String [] ar = hr.getNetwork();
        System.out.println("\t");
        for(String item : ar) {
            System.out.println(item);
            
        }
    }
    
}

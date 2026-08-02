package ch11_abstract;
interface bicycle{
 void applyBrake(int decrement);
 void speedUp(int increment);
}
class avoncycle implements bicycle{
    int speed = 10;
    int decrement = 7;
    int increment = 8;
    
    @Override
    public void applyBrake(int decrement) {
        
        speed = speed - decrement;
    
        System.out.println("break is applied   "+ decrement);
    }
    @Override
    public void speedUp(int increment) {
       speed = speed + increment;
       System.out.println("speed is boosted   "+ increment);
    }
} 
public class interfaces {
    public static void main(String[] args) {
        avoncycle x = new avoncycle();
        x.applyBrake(14);;
        x.speedUp(450);;
        
    }
    
}

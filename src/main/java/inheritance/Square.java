package inheritance;
import java_objects.Rectangle;

public class Square extends Rectangle{

    @Override
    public double calculateParameter() {
        return sides * length;
    }

    public void print(String what){
        System.out.println("I am a " + what);
    }
}

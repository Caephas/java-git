import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        myClass myInfo = new myClass();
        myInfo.age = 21;
        myInfo.bio = "I am a programmer and a football player";
        myInfo.id = 1999;
        myInfo.name = "Peter";

        System.out.println("My name is " + myInfo.name + " and " + myInfo.bio + "..... I'm " + myInfo.age + "..... My id number is " + myInfo.id);

        myClass another_instance = new myClass();
        another_instance.bio = "I've laernt how to create an instance";
        System.out.println(another_instance.bio);

    }
}

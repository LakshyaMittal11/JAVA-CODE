import java.util.*;
class Vowelsconstant
{
    public static void main(String K[])
    {
        Scanner ob =new Scanner(System.in);
        System.out.print("enter the vowels=");
        String ch=ob.next();
        switch(ch)
        {
            case "a":
            case "e":
            case "i":            
            case "o":            
            case "u":            
            case "A":            
            case "E":            
             case "I":
            case "O":            
            case "U":
            System.out.println("VOWELS");
           break;
            default:
                 System.out.println("constant");
        }
    }
}
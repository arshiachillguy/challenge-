public class secondDay {
public void change() {
     String a = "java";
     String b = "code";

     a = a + b; // javacode
     int index = a.length() - b.length();
     b = a.substring(0, index);//java
     a = a.substring(index); //code
     System.out.println("a " + a  + "\n" +"b "+ b );
    }
}

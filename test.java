import java.util.Scanner;

public class test {
    public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);
System.out.println("Hello, world! How are you?");
String State = leitor.nextLine();
System.out.println("Good to know you're " + State + "!\nif a = 12 and b = 23 then how much is a + b?");
String resultado = leitor.nextLine();
System.out.println(resultado + " huh? so...");
if (resultado == "35") {
    System.out.println("You're right! The result is " + resultado); }
else {
    System.out.println("That is wrong!"); }

    }
}

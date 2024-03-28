import java.util.Scanner;

public class test {
    public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);
int a = 12;
int b = 23;
int resultado = 0;
System.out.println("Hello, world! How are you?");
String State = leitor.nextLine();
System.out.println("Good to know you're " + State + "!\nif a = 12 and b = 23 how much is a + b?");
String resultado = leitor.nextLine();
if (resultado == 35) {
    System.out.println("You're right!"); }
else {
    System.out.println(resultado + " is not correct!"); }

    }
}

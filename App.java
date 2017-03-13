import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Enter the length of the first side");
    int inputSide1 = Integer.parseInt(console.readLine());
    System.out.println("Enter the length of the second side");
    int inputSide2 = Integer.parseInt(console.readLine());
    System.out.println("Enter the length of the third side");
    int inputSide3 = Integer.parseInt(console.readLine());

    Triangle newTriangle = new Triangle(inputSide1, inputSide2, inputSide3);
    System.out.println("The values you entered are " + newTriangle.triangleType());
  }
}

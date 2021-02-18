import java.util.Scanner;

/** A HelloWorld class.
 * @author Bhuppal Kumar
 */
//https://defkey.com/jetbrains-intellij-idea-macos-shortcuts

public class HelloWorld {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello my name is " + name);
    }
}

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ExampleClass {
    public static void main(String[] args) {
//        System.out.println("StringUtils.reverse(\"Kat\") = " + StringUtils.reverse("Kat"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something: ");
        String userInput = sc.nextLine();
        System.out.println("StringUtils.isNumeric(userInput) = " + StringUtils.isNumeric(userInput));
        System.out.println("StringUtils.swapCase(userInput) = " + StringUtils.swapCase(userInput));
        System.out.println("StringUtils.reverse(userInput) = " + StringUtils.reverse(userInput));
    }
}

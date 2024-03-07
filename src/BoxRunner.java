import java.util.Scanner;

public class BoxRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many Box objects do you want to instantiate? ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Box " + (i + 1));
            System.out.print("Enter publicVar1: ");
            String publicVar1 = scanner.next();

            System.out.print("Enter publicVar2: ");
            int publicVar2 = scanner.nextInt();

            System.out.print("Enter privateVar1: ");
            String privateVar1 = scanner.next();

            System.out.print("Enter privateVar2: ");
            int privateVar2 = scanner.nextInt();

            System.out.print("Enter protectedVar1: ");
            String protectedVar1 = scanner.next();

            System.out.print("Enter protectedVar2: ");
            int protectedVar2 = scanner.nextInt();

            Box box = new Box(publicVar1, publicVar2, privateVar1, privateVar2, protectedVar1, protectedVar2);
            // Do something with the created Box object
        }
    }
}

import java.util.Scanner;

// Client class
public class RemoteFileSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Remote File System Simulator ===");
        while (true) {
            System.out.print("\nEnter filename to access (or 'exit' to quit): ");
            String filename = sc.nextLine();
            if (filename.equalsIgnoreCase("exit")) break;
            RemoteFile file = new RemoteFileProxy(filename);
            file.display();
        }
        sc.close();
        System.out.println("Exiting Remote File System Simulator. Goodbye!");
    }
}

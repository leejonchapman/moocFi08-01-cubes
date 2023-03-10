import java.util.Scanner;

public class UserInterface {
    Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }
    public void start(){
       boolean runMenu = true;
        while (runMenu) {
            String uI = scanner.nextLine();
            if (uI.equals("end")){
                runMenu = false;
                break;
            }
            System.out.println((int) Math.pow(Integer.valueOf(uI), 3));
        }
    }
}

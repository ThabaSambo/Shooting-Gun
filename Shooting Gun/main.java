import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        ShortGun myShotgun = new ShortGun("Gun R5", 3); // Creating a shotgun with custom name and ammo capacity
        while (true) {
            System.out.println("1=======shoot========");
            System.out.println("2========reload=======");
            System.out.println("3========Exit=======");

            System.out.println("Please enter your option :");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            int Hits = 0;

            switch (option) {
                case 1:
                    myShotgun.shoot(Hits, sc);
                    System.out.println("Hits");
                    break;
                case 2:
                    myShotgun.reload();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }

    }

}

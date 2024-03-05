import java.util.Scanner;

public class ShortGun {
    private String name;
    private String[] ammoArray;

    public ShortGun(String name, int max) {
        this.name = name;
        this.ammoArray = new String[max];
        reload(); // Initialize ammo array
    }

    public int GenerateRondomPosition() {
        return (int) Math.floor(Math.random() * 3);
    }

    public void shoot(int Hits, Scanner sc) {
        if (ammoArray.length > 0) {
            System.out.println(name + "  shooting!");

            int position = GenerateRondomPosition() + 1;

            System.out.println("position" + position);

            System.out.println("==SELECT SHOOTING POSITION from 1 to 3==");
            if (sc.nextInt() == position) {
                Hits++;
                System.out.println("you have hitten the target");
            } else {
                System.out.println("You have missed the target");

            }
            // Shift ammo array to represent shooting
            for (int i = ammoArray.length - 1; i > 0; i--) {
                ammoArray[i] = ammoArray[i - 1];
            }
            ammoArray[0] = " "; // Representing shot ammo as empty space
            displayAmmoCount();

        } else

        {
            System.out.println("Out of ammo! Reload " + name + "!");
        }
    }

    public void reload() {
        for (int i = 0; i < ammoArray.length; i++) {
            ammoArray[i] = "*"; // Representing loaded ammo as "*"
        }
        System.out.println(name + " is reloaded!");
        displayAmmoCount();
    }

    private void displayAmmoCount() {
        System.out.print("Ammunition Count: ");
        for (String ammo : ammoArray) {
            System.out.print(ammo.equals(" ") ? "-" : "*");
        }
        System.out.println("");
    }

}

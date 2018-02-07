package command;

public class Help implements Command {
    public static void printHelp(){
        System.out.println("info: Display information about the hero and the current level");
        System.out.println("attack: Attack the monster");
        System.out.println("take: Pick up the item in the room");
        System.out.println("dropWeapon: Drop weapon");
        System.out.println("dropShield: Drop shield");
        System.out.println("dropArmor: Drop armor");
        System.out.println("north: Move north");
        System.out.println("south: Move south");
        System.out.println("east: Move east");
        System.out.println("west: Move west");
    }

    @Override
    public void execute() {
        printHelp();
    }
}

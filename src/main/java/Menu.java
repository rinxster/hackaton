import java.util.Scanner;

public class Menu {
    boolean exit;

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.printMenu();
        menu.runMenu();
    }

public void printMenu(){
    System.out.println("\n Let's play the game!");
    System.out.println("Press 1 for Game1");
    System.out.println("Press 2 for Game2");
    System.out.println("Type EXIT to exit\n");
}

public void runMenu(){
        while (!exit){
            String choice = getInput();
        }
}

public String getInput(){
      String choice ="";
      Scanner kb = new Scanner(System.in);
      public choice = kb.nextLine();

      switch (choice){
          case "1":
              System.out.println("Playing game1");
              break;
          case "2":
              System.out.println("Playing game2");
              break;
          case "EXIT":
              System.out.println("now i am about to exit!");
              exit = true;
              break;
          default:
              System.out.println("unknown symbol.");
      }

      return choice;
    }
}

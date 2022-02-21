import java.util.Scanner;
public class Driver {


    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();

        boolean game = true;
        Scanner scan = new Scanner(System.in);
        String decision = new String("");
        while(game){
            System.out.println("What would you like to do?");
            System.out.println("Push: enter A");
            System.out.println("Pop: enter P");
            System.out.println("Peek: enter K");
            System.out.println("Size: enter S");
            System.out.println("Exit: enter E");
            System.out.println("Input:");
            decision = scan.next();
            if(decision.length() > 1){
                System.out.println("Invalid input!");
                continue;
            }
            switch(decision.toUpperCase()){
                case"A":
                    menu.push();
                    break;
                case"P":
                    menu.pop();
                    break;
                case"K":
                    menu.peek();
                    break;
                case"S":
                    menu.getSize();
                    break;
                case"E":
                    game = false;
                    break;
                default:
                    System.out.println("Invalid input!");
                    continue;
            }
        }

    }
}
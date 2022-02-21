import java.util.Scanner;

public class Menu {
    private Stack stack = new Stack();
    Scanner scan = new Scanner(System.in);

    public void push(){
        String input = "";
        boolean added = false;
        while (!added){
            System.out.println("Please enter a value to be added: ");
            input = scan.next();
            if(input == "")
            {
                System.out.println("Error!");
                continue;
            }
            stack.push(input);
            added = true;
        }
    }
    public void pop(){
        try {
            System.out.println(this.stack.pop());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void peek(){
        try {
            System.out.println(this.stack.peek());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void getSize(){
        System.out.println(this.stack.getSize());
    }
}

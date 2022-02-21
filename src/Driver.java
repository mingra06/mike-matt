public class Driver {


    public static void main(String[] args) {



        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        try{
            System.out.print(stack.peak());
            System.out.print(stack.pop());
            System.out.print(stack.pop());
            System.out.print(stack.pop());
        }catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}

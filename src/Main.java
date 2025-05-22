import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws MyEmptyStackExceptions {

        Stack stack = new Stack();
        try {
            stack.pop();
        }catch (Exception e){
            System.out.println(e);
        }



        /*
        ArrayList<Object> stringArrayList =new ArrayList<>(); // object yazarsak istediğimizi ekleyebiliyoz
        stringArrayList.add("String");
        stringArrayList.add(1);
        HashMap<String , Double>grades = new HashMap<>();
        grades.put("Ali" , 0.0);
        System.out.println(grades);
        grades.put("Pelin",90.0);
        System.out.println(grades);
        grades.put("Enes",10.0);
        System.out.println((grades));
        grades.put("Ali",35.0);                     //son yazdığımız değil ilk yazdığımız alinin notunu döndürüyoz
        System.out.println(grades);
        System.out.println((grades.keySet() instanceof List));

        Stack stack = new StackLinkedList();
        stack.push("This is a string");
        stack.push(5);
        stack.peek();
        System.out.println("Is empty "
                +stack.isEmpty() );
        System.out.println("Pop = " +
                stack.pop());
        stack.peek();
    }                                       */
    }
}

package dogcatqueue;
import java.util.LinkedList;
import java.util.Scanner;


public class DogCatQueue {

        private static LinkedList<Dog> d=new LinkedList<Dog>();
        private static LinkedList<Cat> c=new LinkedList<Cat>();
        private static int order;
    public static void main(String[] args) {
        
       
        Scanner sc=new Scanner(System.in);
        
        int choice;
        boolean flag=false;
        String ani;
        while(true)
        {
            System.out.println("Enter the operation Enqueue(1), DequeueAny(2), DequeueDog(3), DequeueCat(4), Exit(-1)");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter an animal");
                    ani=sc.next();
                    if(ani.toLowerCase().equals("dog"))
                        enqueue(new Dog("dog"));
                    else
                        enqueue(new Cat("cat"));
                    break;
                case 2:
                    System.out.println("You can adopt " + dequeueAny());
                    break;
                case 3:
                    if(!dequeueDog())
                        System.out.println("There are no dogs to adopt");
                    break;
                case 4:
                    if(!dequeueCat())
                        System.out.println("There are no cats to adopt");
                    break;
                case -1:
                    flag=true;
                    break;
            }
                    
             if(flag)
                 break;
                    
        }
            
    }
     
    
    public static void enqueue(Animal a)
    {
        a.setOrder(order);
        order++;
        if(a instanceof Dog)
            d.addLast((Dog)a);
        else
            c.addLast((Cat)a);
        
    }
    public static String dequeueAny()
    {
        String res;
        if(d.size()==0 && c.size()==0)
        {
            System.out.println("Queue is empty");
            return "";
        }
        else if(d.size()==0)
        {
            return c.removeFirst().name;
        }
        else if(c.size()==0)
        {
            return d.removeFirst().name;
        }
        if(d.getFirst().compare(c.getFirst()))
            res=d.removeFirst().name;
        else
            res=c.removeFirst().name;
        
        return res;
    }
    public static boolean dequeueDog()
    {
        if(d.size()!=0)
        {
            System.out.println("Dog has been dequeued");
            d.removeFirst();
            return true;
        }
        return false;
    }
    public static boolean dequeueCat()
    {
        if(c.size()!=0)
        {
            System.out.println("Cat has been dequeued");
            c.removeFirst();
            return true;
        }
        return false;
    }
}

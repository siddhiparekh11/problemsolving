
package anonymous;


public class Anonymous {
    
    
    interface printing
    {
        public void print(String str);
    }

    
    public static void main(String[] args) {
        
        printing obj = new printing(){
            
           String s = "Siddhi Parekh";
            public void print(String str)
            {
               System.out.println(s);
               System.out.println(str);
            }
        };
        
        obj.print("Ishani Parekh");
        
    }
    
    
    
}

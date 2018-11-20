
package dogcatqueue;


abstract public class Animal {
    
    String name;
    int order;
    Animal(String name)
    {
        this.name=name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
    
    public boolean compare(Animal a)
    {
        return this.getOrder() < a.getOrder();
    }
    
    
   
}

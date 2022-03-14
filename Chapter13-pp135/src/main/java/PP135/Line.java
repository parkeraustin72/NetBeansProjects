
package PP135;

import java.util.LinkedList;

public class Line {
    
    LinkedList queue;
    
    public Line(){
        queue = new LinkedList();
    }
    
    public void addCustomer(Customer person){
        queue.addLast(this);
    }
    
    public Customer nextCustomer(){
        return (Customer) queue.removeFirst();
    }
    
    public boolean isEmpty()
    {
        return queue.isEmpty();
    }
    
    public int size(){
        return queue.size();
    }
    
    
}


package binarytreeexample;

/**
 *
 * @author bousabacw
 */
public class Node {
    //Class contains left and right child of current node 
    //in addition to the key value
    
    int key;
    
    Node left, right;
    
    public Node (int item)
    {
        key = item;
        left = right = null;
    }
}

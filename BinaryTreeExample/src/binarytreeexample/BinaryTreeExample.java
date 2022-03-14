/*
 * Unlike Linked lists, stacks, and queues, which are linear
 * data structures, trees are hierarchical data structures.

* The topmost node is called root of the tree;
* The elements that are directly inder an element are called
* Children; the element directly abobe something is called
* its parent;
* Finally, elements with no children are called leaves;

 */

//Why Trees?
//1- to store information that naturally forms a hierarchy;
//2- trees provide moderate access/search (Quicker than
// Linkedlist and slower than arrays)
//3- trees provide moderate insertion/deletion (quicker than Arrays 
// and slower than un-ordered linkedlist)
//4- Similar to Linkedlists and unlike arrays, trees do not have
// an upper limit on the number of nodes;

package binarytreeexample;

/**
 *
 * @author bousabacw
 */
public class BinaryTreeExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree bintree = new BinaryTree();
        //create bintree root
        bintree.root = new Node(1);
        
        // The following is created after the above statement
        //                1
        //               / \
        //           null  null
        
        bintree.root.left = new Node(2);
        bintree.root.right = new Node(3);
        
        // The following is created after the above statement
        //                 1          
        //               /   \        
        //              2     3       
        //            / \     / \     
        //        null null null null 
        
        bintree.root.left.left = new Node (5);
        // The following is created after the above statement
        //                 1           
        //               /   \         
        //              2     3        
        //            / \     / \      
        //          5  null null null  
        //         / \                 
        //     null null               
                
        bintree.root.left.right = new Node (7);
        bintree.root.right.right = new Node (11);
        
        System.out.println("Preorder traversal of binary tree is:");
        bintree.printPreorder();
        
        System.out.println("\nInorder traversal of binary tree is:");
        bintree.printInorder();
        
        System.out.println("\nPostorder traversal of binary tree is:");
        bintree.printPostorder();
    }
    
}

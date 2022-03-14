package binarytreeexample;

/**
 *
 * @author bousabacw
 */
public class BinaryTree {
    Node root; //this is the Root of the binary tree
    
    BinaryTree()
    {
        root = null;
    }
    
    
    //Constructor
    BinaryTree (int key)
    {
        root = new Node(key);
    }
    
    //Given a binary tree, print its nodes
    //according to the "bottom-up" postorder traversal
    void printPostorder(Node node)
    {
        if (node == null)
            return;
        //first recur on left subtree
        printPostorder(node.left);
        //then recur on right subtree
        printPostorder(node.right);
        //now handle the node
        System.out.print(node.key + " ");
    }
    
    
    //Given a binary tree, print its nodes in order
    void printInorder(Node node)
    {
        if (node == null)
            return;
        //first recur on left child
        printInorder(node.left);
        //then print the data of the node
        System.out.print(node.key + " ");
        
        //now recur on right child
        printInorder(node.right);

    }
    
    //Given a binary tree, print its nodes preorder
    void printPreorder (Node node)
    {
        if (node == null)
            return;
        //first print data of node
        System.out.print(node.key + " ");
        //thenrecur on left subtree
        printPreorder(node.left);
        //now recur on right subtree
        printPreorder(node.right);
        
    }
    
    //Wrappers over above recursive functions
    void printPostorder(){ printPostorder(root);}
    void printInorder(){ printInorder(root);}
    void printPreorder(){ printPreorder(root);}
    
}

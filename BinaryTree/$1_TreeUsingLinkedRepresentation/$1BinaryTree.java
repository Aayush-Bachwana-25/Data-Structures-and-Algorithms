import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class $1BinaryTree{
    Node root;

    private class Node{
        int data;
        Node leftChild;
        Node rightChild;

        Node(int data){
            this.data=data;
            leftChild=rightChild=null;
        }
    }

    $1BinaryTree(){
        int value;
        Node p;
        Queue <Node> queue=new LinkedList<>();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter root element::");
        root=new $1BinaryTree.Node(scanner.nextInt());
        queue.add(root);

        do{
            p=queue.remove();

            System.out.println("Enter left child of "+p.data+"::");
            value=scanner.nextInt();
            if(value!=-1){
                p.leftChild=new Node(value);
                queue.add(p.leftChild);
            }

            System.out.println("Enter right child of "+p.data+"::");
            value=scanner.nextInt();
            if(value!=-1){
                p.rightChild=new Node(value);
                queue.add(p.rightChild);
            }
        }while(!queue.isEmpty() && p!=null);

        scanner.close();
    }

    private void preOrder(Node p){
        //root-> left -> right

        if(p==null){
            return;
        }

        System.out.print(p.data+" ");
        preOrder(p.leftChild);
        preOrder(p.rightChild);
    }

    void preOrderTraversalRecursive(){
        System.out.print("Pre-order Traversal::");
        preOrder(root);
        System.out.println();
    }

    private void inOrder(Node p){
        // left -> root -> right

        if(p==null){
            return;
        }

        inOrder(p.leftChild);
        System.out.print(p.data+" ");
        inOrder(p.rightChild);
    }

    void inOrderTraversalRecursive(){
        System.out.print("In-order Traversal::");
        inOrder(root);
        System.out.println();
    }

    private void postOrder(Node p){
        // left -> right -> root

        if(p==null){
            return;
        }

        postOrder(p.leftChild);
        postOrder(p.rightChild);
        System.out.print(p.data+" ");
    }

    void postOrderTraversalRecursive(){
        System.out.print("Post-order Traversal::");
        postOrder(root);
        System.out.println();
    }

    void preOrderTraversalIterative(){
        Node p=root;
        Stack <Node> stack=new Stack<>();

        System.out.println("Traversing Pre-Order Iteratively::");

        while(!stack.isEmpty() || p!=null){
            if(p!=null){
                System.out.print(p.data+" ");
                stack.push(p);
                p=p.leftChild;
            }
            else{
                p=stack.pop();
                p=p.rightChild;
            }
        }
        System.out.println();
    }

    void inOrderTraversalIterative(){
        Node p=root;
        Stack <Node> stack=new Stack<>();

        System.out.println("Traversing In-Order Iteratively::");

        while(!stack.isEmpty() || p!=null){
            if(p!=null){
                stack.push(p);
                p=p.leftChild;
            }
            else{
                p=stack.pop();
                System.out.print(p.data+" ");
                p=p.rightChild;
            }
        }
        System.out.println();
    }

    int countNoOfNodesInTree(){
        return countNodes(root);
    }
    private int countNodes(Node p){
        //Recursive function to count Nodes in tree
        if(p!=null){
            int nodes_in_left=countNodes(p.leftChild);
            int nodes_in_right=countNodes(p.rightChild);

            return (1 + nodes_in_left + nodes_in_right);
        }
        return 0;
    }


    int countNodes_having_both_left_and_right_child(){
        return countNodesBothLR(root);
    }
    private int countNodesBothLR(Node p){
        if(p!=null){
            int nodes_in_left=countNodesBothLR(p.leftChild);
            int nodes_in_right=countNodesBothLR(p.rightChild);

            if(p.leftChild!=null && p.rightChild!=null){
                return (1+nodes_in_left+nodes_in_right);
            }
            return nodes_in_left+nodes_in_right;
        }
        return 0;
    }

    void countNodesWithDegree(){
        System.out.print("Nodes having degree 0::");
        System.out.println(countNodesHavingDegreeZero(root));

        System.out.print("Nodes having degree 1::");
        System.out.println(countNodesHavingDegreeOne(root));

        System.out.print("Nodes having degree 2::");
        System.out.println(countNodesBothLR(root));

    }

    private int countNodesHavingDegreeZero(Node p){
        if(p!=null){
            int nodes_in_left=countNodesHavingDegreeZero(p.leftChild);
            int nodes_in_right=countNodesHavingDegreeZero(p.rightChild);

            if(p.leftChild==null && p.rightChild==null){
                return (1+nodes_in_left+nodes_in_right);
            }
            return nodes_in_left+nodes_in_right;
        }
        return 0;
    }

    private int countNodesHavingDegreeOne(Node p){
        if(p!=null){
            int nodes_in_left=countNodesHavingDegreeOne(p.leftChild);
            int nodes_in_right=countNodesHavingDegreeOne(p.rightChild);

            if((p.leftChild==null && p.rightChild==null) || (p.leftChild!=null && p.rightChild!=null)){
                return (nodes_in_left+nodes_in_right);
            }
            return (1+nodes_in_left+nodes_in_right);
        }
        return 0;
    }

    void count_Leaf_and_nonLeaf_nodes(){
        if(root!=null){
            System.out.println("Leaf Nodes::"+countNodesHavingDegreeZero(root));
            System.out.println("Non-Leaf Nodes::"+(countNodesHavingDegreeOne(root)+countNodesBothLR(root)));
        }
    }

    void sumOfAllNodes(){
        System.out.print("Sum of nodes::");
        if(root!=null){
            System.out.println(sumofNodesRunnable(root));
        }
        else{
            System.out.println("Root is null");
        }

    }

    private int sumofNodesRunnable(Node p){
        if(p!=null){
            int sumOfLeft=sumofNodesRunnable(p.leftChild);
            int sumOfRight=sumofNodesRunnable(p.rightChild);

            return sumOfLeft+sumOfRight+p.data;
        }
        return 0;
    }

    void levelOrderTraversal(){
        Queue<Node> queue=new LinkedList<>();

        System.out.print("Level-Order Traversal::");
        if(root!=null){
            queue.add(root);

            while(!queue.isEmpty()){
                Node p=queue.remove();
                System.out.print(p.data+" ");
                
                if(p.leftChild!=null){
                    queue.add(p.leftChild);
                }

                if(p.rightChild!=null){
                    queue.add(p.rightChild);
                }
            }
        }
        System.out.println();

    }

    int calculateHeightOfTree(Node p){
        if(p!=null){
            int height_left=calculateHeightOfTree(p.leftChild);
            int height_right=calculateHeightOfTree(p.rightChild);

            if(height_left<height_right){
                return height_right+1;
            }
            else{
                return height_left+1;
            }
        }
        return 0;
    }
}
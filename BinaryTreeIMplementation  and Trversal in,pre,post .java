class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
    }
}
class BinaryTree{
    Node root;
    public void insert(int data){
        root = insertRec(root,data);
    }
    public  Node insertRec(Node root,int data){
        if(root == null){
            root = new Node(data);
        }
        else if(data<root.data){
            root.left = insertRec(root.left,data);
        }
        else if(data>root.data){
            root.right = insertRec(root.right,data);
        }
        else{
            return null;
        }
         return root;
    }
   public void inorder(){
    System.out.println("Inorder Traversal : \n");
    inorderRec(root);
   }
   public void inorderRec(Node root){
       if(root != null){
           inorderRec(root.left);
           System.out.print(root.data + " ");
           inorderRec(root.right);
       }
   }
}
public class Main
{
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.insert(8);
		tree.insert(15);
		tree.insert(2);
		tree.insert(22);
		tree.insert(21);
		tree.insert(9);
		tree.inorder();
	}
}

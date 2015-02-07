public class HelloWorld{

     public static void main(String []args){
     Node root=new Node(20);
     root.left = new Node(8);
     root.right = new Node(22);
     root.left.left = new Node(4);
     root.left.right = new Node(12);
     root.left.right.left = new Node(10);
     root.left.right.right = new Node(14);
     findlca(root, 10, 14);
     }

     public static void findlca(Node root, int n1, int n2){
     while(root!=null){
         if(root.data>n1 && root.data>n2){
             root = root.left;
         }else
         if(root.data<n1 && root.data<n2){
             root = root.right;
         }
         else{break;}
     }
     System.out.println(root.data);
     }
}

class Node{
    int data;
    Node left;
    Node right;

    public Node(int dat){
        this.data = dat;
    }
}
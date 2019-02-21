import java.util.Queue;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.Vector;
// Pre-Order / In-order /Post-order Usage : Simple words
//
// Pre-order: Used to create a copy of tree Example : If you want to create a replica of a tree and need node values in an array and when you insert
              // those values from index 0 to end in a new tree, you get a replica
//
// In-order: : To get values of node in non-increasing order
//
// Post-order: : When you want to delete a tree from leaf to root


// When to use Pre-Order, In-order or Post-Order?
//
// The traversal strategy the programmer selects depends on the specific needs of the algorithm being designed. The goal is speed, so pick the strategy that brings you the nodes you require the fastest.
//
//     If you know you need to explore the roots before inspecting any leaves, you pick pre-order because you will encounter all the roots before all of the leaves.
//
//     If you know you need to explore all the leaves before any nodes, you select post-order because you don't waste any time inspecting roots in search for leaves.
//
//     If you know that the tree has an inherent sequence in the nodes, and you want to flatten the tree back into its original sequence, than an in-order traversal should be used. The tree would be flattened in the same way it was created. A pre-order or post-order traversal might not unwind the tree back into the sequence which was used to create it.


public class Tree{

  class Node{
    int key;
    Node left,right;

    public Node(int item){
      key=item;
      left=null;
      right=null;
    }
  }

  Node root;
  Tree(){
    root=null;
  }
int size=0;
  void insert(int key)
  {
    size++;
    root=insertRec(root,key);
  }

  Node insertRec(Node root,int key)
  {
    if(root==null)
    {
      root=new Node(key);
      return root;
    }
    if(key<root.key){
      root.left=insertRec(root.left,key);
    }
    else if (key>root.key){
      root.right=insertRec(root.right,key);
    }
    return root;
  }
  void inorder()  {
         inorderRec(root);
      }
      // A utility function to do inorder traversal of BST

      void inorderRec(Node root) {
          if (root != null) {
              inorderRec(root.left);
              System.out.println(root.key);
              inorderRec(root.right);
          }
      }


public void treeUse(){
Vector<Integer> v=new Vector<Integer>();
v.add(1);
v.add(2);
v.add(3);
v.add(2,8);
System.out.println(v);
System.out.println(v.get(0));//get zero index value
TreeMap<Integer,String> x=new TreeMap<Integer,String>();
x.put(1,"vinay");
x.put(2,"kumar");
System.out.println(x);
// System.out.println(x.get(1));   //get value of key=1
TreeMap<Integer,Vector<Integer>> m=new TreeMap<Integer,Vector<Integer>>();


}
public void count(){
    int x=countnode(root);
    System.out.println("number of nodes "+x);
}
public int countnode(Node x){
    int count=1;
    if(x==null){
      return 0;
    }
    count=count+countnode(x.left);
    count=count+countnode(x.right);
return count;
}
public void height(){
    int x=countheight(root);
    System.out.println("height of tree"+x);
}
public int countheight(Node x){
int left=1;
int right=1;
if(x==null){
  return 0;
}
left=left+countheight(x.left);
right=right+countheight(x.right);

return Math.max(left,right);
}


public void leafcount(){
int x=leaf(root);
System.out.println("Leaf node" +x);
}
public int leaf(Node z){
  int count=0;
  if(z==null ){
    return 0;
  }
  if(z.left==null && z.right==null)
  {
    return 1;
  }
  count=count+leaf(z.left);
  count=count+leaf(z.right);
  return count;
}

public static void main(String[] args){
  Tree t=new Tree();
  t.insert(8);
  t.insert(3);
  t.insert(10);
  t.insert(6);
  t.insert(9);
  t.insert(1);
  t.insert(22);
  t.insert(13);
  t.insert(12);
  t.inorder();
  t.treeUse();
  t.count();
  t.height();
  t.leafcount();
}

}

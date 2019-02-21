class Tree{

  class Node
  {
    int data;
    Node left;
    Node right;
    Node(int item)
      {
      data=item;
      left=null;
      right=null;
      }
  }

  Node root;
  Tree()
  {
    root=null;
  }

void insert(int data)
{
  root=createNode(root,data);
}

public Node createNode(Node root,int data){
  if(root==null)
    {
      root=new Node(data);
      return root;
    }
    if(root.data<data){
      root.left=createNode(root.left,data);
    }
    else if(root.data>data){
      root.right=createNode(root.right,data);
    }
return root;
}
void inorder()
{
  inorderRec(root);
}
void inorderRec(Node root)
{
  if (root != null) {
      inorderRec(root.left);
      System.out.println(root.data);
      inorderRec(root.right);
  }
}
void deleteNode(int data)
{
root=deletRec(root,data);
}
Node deletRec(Node root,int data)
{
if(root==null){
  return null;
}
if(root.data<data){
  root.left=deletRec(root.left,data);
}
else if(root.data>data){
  root.right=deletRec(root.right,data);
}
else{
  if(root.left==null){
    return root.right;
  }
  else if(root.right==null)
  {
    return root.left;
  }
root.key=minVal(root.right);

root.right=deletRec(root.right,root.key);
}
return root;
}
int minVal(Node root){
  int min=root.key;
  while(root.left!=null){
    root=root.left;
    min=root.key;
  }
}

public static void main(String[] args){
  Tree t=new Tree();
  t.insert(15);
  t.insert(7);
  t.insert(12);
  t.insert(9);
  t.insert(70);
  t.insert(3);
  t.inorder();
}
}

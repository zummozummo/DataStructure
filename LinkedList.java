class LinkedList{

  class Node{
    int data;
    Node next;
Node(int d){data=d;next=null;}
  }
  Node head=null;

public void push(int new_data){
  Node new_node=new Node(new_data);
  new_node.next =head;
  head=new_node;
}

public void pushBack(int new_data){
if(head==null){
  head=new Node(new_data);

}
else
{
  Node temp=head;
while(temp.next!=null){
  temp=temp.next;
}
temp.next=new Node(new_data);
}
}
public void insertmid(int x){
Node temp=head;
Node temp1=head.next;
while(temp1!=null && temp1.next!=null){
    temp=temp.next;
    temp1=temp1.next.next;
  }
  Node n=new Node(x);
  Node let=temp.next;
  temp.next=n;
  n.next=let;
}
public void removeDublic(){
  Node temp=head;
  int flag=0;
  while(temp!=null && temp.next!=null){
    if(temp.data==temp.next.data){
      System.out.println(temp.data);
      Node let=temp.next;
      temp.next=let.next;
      let.next=null;
      // flag=1;
    }
    else{
      temp=temp.next;
    }
  }
}


public void reverse(){
  Node next=head;
  Node prev=null;
  Node current=head;
  while(current!=null){
    next=current.next;
    current.next=prev;
    prev=current;
    current=next;
  }
head=prev;
}

public void print(){
  Node temp=head;
while(temp!=null){
  System.out.println(temp.data);
  temp=temp.next;
}
}

public static void main(String []args){
  LinkedList l=new LinkedList();
  l.pushBack(11);
  l.pushBack(11);
  l.pushBack(11);
  l.pushBack(21);
  l.pushBack(43);
  l.pushBack(43);
  l.pushBack(60);
  // l.removeDublic();
  l.reverse();
  l.print();
}

}

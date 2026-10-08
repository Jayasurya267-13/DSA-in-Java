import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;     
    }
}
public class Product_ID_Insertion_in_Inventory {
    public static Node insert(Node head,int data){
        Node newNode=new Node(data);
        if(head==null){
            return newNode;
        }
        
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        
        return head;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=null;
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            head=insert(head,data);
        }
        display(head);
    }

   
}
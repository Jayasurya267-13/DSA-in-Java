import java.util.*;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
class Task_ID_Management_System{
    public static node insert(node head,int data){
        node newNode=new node(data);
        newNode.next=head;
        head=newNode;
        return head;
    }
    public static void display(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        node head=null;
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            head=insert(head,data);
        }
        display(head);
        sc.close();
    }
}
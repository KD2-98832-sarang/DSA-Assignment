
public class Q3CircularLinkedList {

	static class Node
	{
		private int data;
		private Node next;
		public Node(int val) {
			data = val;
			next = null;
		}
		
	}
	private Node head=null;
	private Node tail=null;
	
	
	public void addFirst(int val)
	{
		Node newNode=new Node(val);
		if(head==null )
		{
			head=newNode;
			head.next=newNode;
			tail=newNode;
		}
		else
		{
			newNode.next=head;
			head=newNode;
			tail.next=newNode;
			
		}
	}
	public void addPosition(int val,int pos)
	{
		int count=1;
		Node newNode=new Node(val);
		if(head==null )
		{
			head=newNode;
			head.next=newNode;
			tail=newNode;
		}
		else
		{
			if(pos<=1)
			{
				newNode.next=head;
				head=newNode;
				tail.next=newNode;
			}
			else {
			Node trav=head;
			
			while(trav.next!=head && count<pos-1 )
			{
				trav=trav.next;	
				count++;
			}
			if(trav.next!=head)
			{
			newNode.next=trav.next;
			trav.next=newNode;
			}
			else {
				trav.next=newNode;
				newNode.next=head;
				tail=newNode;
			}
		
		}
		}
	}
	public void addLast(int val)
	{
		Node newNode=new Node(val);
		if(head==null )
		{
			head=newNode;
			head.next=newNode;
			tail=newNode;
		}
		else
		{
		
			tail.next=newNode;
			newNode.next=head;
			tail=newNode;
			
		}
	}
	public void deleteFirst()
	{
			if(head==null )
		{
				System.out.println("LinkedList is empty");
		}
			if(tail==head)
			{
				head=tail=null;
			}
		else
		{
			tail.next=head.next;
			head=head.next;
		}		
		
		}
	public void deletePosition(int pos)
	{
		int count=1;
		
		if(head==null || pos<1)
		{
			System.out.println("LinkedList is empty or invalid position ");
		}
		else
		{
			if(pos==1)
			{
				tail.next=head.next;
				head=head.next;
				
			}else {
			Node trav=head;
			
			while(trav.next!=head && count<pos-1 )
			{
				trav=trav.next;	
				count++;
			}
			if(trav.next!=head)
			{
			trav.next=trav.next.next;
			}else
			{
				tail=trav.next;
				trav.next=head;
				
			}
			
		}
		}
	}
	public void deleteLast()
	{
			if(head==null )
		{
				System.out.println("LinkedList is empty");
		}
		else
		{
			if(head.next==head ) {
				tail=null;
				head=null;
			}
			else {			
			Node trav=head;
			while(trav.next.next!=head)			
				trav=trav.next;	
			tail=trav;
			trav.next=head;
			}
			
		}
	}
	public void deleteAll()
	{
		head=null;
		tail=null;
	}
	
		public void display()
		{
			if(head==null && tail==null)
			{
				System.out.println("LinkedList is empty");
			}
			else
			{
				Node trav=head;
				
				do
				{
					System.out.print(trav.data+" ");
					trav=trav.next;	
				}while(trav!=head);
				
			}
		}
	
	public static void main(String[] args) {
		Q3CircularLinkedList linearLL= new Q3CircularLinkedList();
		linearLL.addFirst(10);
		linearLL.addFirst(20);
		linearLL.addFirst(30);
		linearLL.addFirst(40);
		linearLL.addLast(50);
	linearLL.addPosition(5,100);
//		linearLL.deletePosition(5);
//		linearLL.deleteFirst();
//		linearLL.deleteLast();
		//linearLL.addPosition(1,3);
		linearLL.deletePosition(8);
		//linearLL.deleteAll();
		
		linearLL.display();
		

	}


}
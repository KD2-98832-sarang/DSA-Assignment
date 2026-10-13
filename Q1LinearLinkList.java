

public class Q1LinearLinkList {


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
	public void addBefore(int val,int v)
	{
		
		Node newNode=new Node(val);
		if(head==null )
		{
			System.out.println("List is empty");
		}
		else
		{
			if(head.data==v)
			{
				newNode.next=head;
				head=newNode;
				tail.next=newNode;
			}
			else {
			Node trav=head;
			while( trav.next!=head && trav.next.data!=v)
			{
				trav=trav.next;	
				
			}
			if(trav.next.data==v)
			{
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
			else {
				System.out.println("Your given data is not present");
			}
			
			}
		}
		}
	public void addAfter(int val,int v)
	{
		Node newNode=new Node(val);
		if(head==null )
		{
			System.out.println("List is empty");
		}
		else
		{
			boolean f=false;
			if(tail.data==v)
			{
				tail.next=newNode;
				newNode.next=head;
				tail=newNode;
			}
			else {
			Node trav=head;
			do
			{
				
				if(trav.data==v)
				{
					newNode.next=trav.next;
					trav.next=newNode;
					f=true;					
				}
				trav=trav.next;	
				
			}while( trav!=head);
			
			if(!f) {
				System.out.println("Your given data is not present");
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
			System.out.println("LinkedList is empty or invalid position");
		}
		else
		{
			if(pos==1)
			{
				tail.next=head.next;
				head=head.next;
				
			}else {
			Node trav=head;
			
			while(trav.next!=tail && count<pos-1 )
			{
				trav=trav.next;	
				count++;
			}
			if(trav!=head)
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
			if(head==null)
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
			if(head==null )
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
		Q1LinearLinkList linearLL= new Q1LinearLinkList();
		linearLL.addFirst(10);
		linearLL.addFirst(20);
		linearLL.addFirst(30);
		linearLL.addFirst(40);
		linearLL.addLast(50);
	//linearLL.addBefore(5,110);
		linearLL.addAfter(1, 50);
	//linearLL.addAfter(55, 40);
//		linearLL.deletePosition(5);
//		linearLL.deleteFirst();
//		linearLL.deleteLast();
		//linearLL.addPosition(1,3);
	//	linearLL.deletePosition(3);
		//linearLL.deleteAll();
		
		linearLL.display();
		

	}


}

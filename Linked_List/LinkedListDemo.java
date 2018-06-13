import java.util.Scanner;

class LinkedList 
{
	int data;
	LinkedList link;
	LinkedList(int data,LinkedList link)
	{
		this.data=data;
		this.link=link;
	}
}
class LinkedListDemo
{
	static LinkedList start=null;
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] arg)throws Exception
	{
		int ch,len;
		while(true)
		{
			System.out.println("1..InsertAtLast");
			System.out.println("2..InsertAtBegin");
			System.out.println("3..InsertAtMiddle");
			System.out.println("4..DeleteAtBegining");
			System.out.println("5..DeleteAtLast");
			System.out.println("6..DeleteAtmiddle");
			System.out.println("7..Search element in List");
			System.out.println("8..reverse element of List");
			System.out.println("9..Display");
			System.out.println("10..Length");
			System.out.println("11..exit from menu...");
			System.out.println("12..any other choice..");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1: insertAtLast();
					break;
					
				case 2: insertBegin();
					break;
					
				case 3: insertAtMiddle();
					break;
					
				case 4: deleteAtbegin();
					break;
					
				case 5: deleteAtLast();
					break;
				
				case 6: deleteAtMiddle();
					break;
				
				case 7: search();
					break;
				
				case 8: reverse();
					break;
				
				case 9: display();
					break;
					
				case 10: len=length();
					System.out.println("length of the list is:"+ len);
					break;
				case 11: 
						System.exit(0);
				default:
					System.out.println("Invalid choice");
					
			}
			
		}
	}
	
	
	
	public static void insertAtLast()
	{
		LinkedList l;
		System.out.println("Enter the element");
		int n=sc.nextInt();
		l=new LinkedList(n,null);
		if(start==null)
		{
			start=l;
		}
		else
		{
			LinkedList l2;
			l2=start;
			while(l2.link!=null)
			{
				l2=l2.link;
			}
			l2.link=l;
		}
		
	}
	
	public static void insertBegin()
	{
		LinkedList l;
		System.out.println("Enter the element");
		int n=sc.nextInt();
		l=new LinkedList(n,null);
		if(start==null)
		{
			start=l;
		}
		else
		{
			LinkedList temp=start;
			l.link=temp;
			start=l;
			
		}
	}
	
	public static void insertAtMiddle()
	{
		LinkedList l;
		int i=1;
		int len=length();
		System.out.println("Enter your location");
		int loc=sc.nextInt();
		
		
		if(loc>len)
		{
			System.out.println("Invalid Location");
			System.out.println("u have only"+" "+len+" "+"location");
		}
		else
		{
			LinkedList temp,p;
			p=start;
			while(i<loc)
			{
				p=p.link;
				i++;
			}
			System.out.println("Enter your data");
		    int n=sc.nextInt();
			l=new LinkedList(n,null);
			l.link=p.link;
			p.link=l;
		}
	}
	
	public static void deleteAtbegin()
	{
		LinkedList del;
		if(start==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			del=start;
			start=del.link;
			del.link=null;
		}
	}
	
	public static void deleteAtLast()throws Exception
	{
		
		if(start==null)
		{
			System.out.println("List is empty");
		}
		else if(start.link==null)
		{
			start=null;
		}
		else
		{
			LinkedList temp;
			temp=start;
			LinkedList curr=null;
			
			while(temp.link!=null)
			{
				curr=temp;
				temp=temp.link;
			}
			curr.link=null;
			temp=null;
			
		}
	}
	
	public static void deleteAtMiddle()
	{
		int i=1;
		LinkedList temp;
		System.out.println("Enter the location where u want to insert");
		int loc=sc.nextInt();
		int len=length();
		if(loc>len)
		{
			System.out.println("Invalid location");
		}
		else if(loc==1)
		{
			temp=start;
			start=temp.link;
			temp.link=null;
			temp=null;
		}
		else
		{
			LinkedList p,q;
			p=start;
			while(i<loc-1)
			{
				p=p.link;
				i++;
			}
			q=p.link;
			p.link=q.link;
			q.link=null;
			q=null;
		}
	}
	
	public static void search()
	{
		System.out.println("Enter the search Item");
		int search=sc.nextInt();
		int count=0;
		int loc=0;
		if(start==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			LinkedList temp;
			temp=start;
			while(temp!=null)
			{
				if(temp.data==search)
				{
					count++;
					break;
				}
				++loc;
				temp=temp.link;
			}
		}
		if(count==1)
		{
			System.out.println("Number found at location"+" "+(loc+1));
		}
		else
		{
			System.out.println("Not found");
		}
	}
	
	
	public static void display()
	{
		LinkedList t;
		if(start==null)
		{
			
			System.out.println("List is empty");
			
		}
		else
		{
			t=start;
			while(t!=null)
			{
				System.out.print(t.data+"->");
				t=t.link;
				
			}
		}
	}
	
	public static int length()
	{
		LinkedList temp;
		temp=start;
		int count=0;
		while(temp!=null)
		{
			count++;
			temp=temp.link;
		}
		return count;
	}
	
	public static void reverse()
	{
		int i=0;
		int len=length();
		int j=len-1;
		int temp;
		LinkedList p;
		LinkedList q;
		p=q=start;
		if(start==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			int k;
			while(i<j)
			{
				k=0;
				while(k<j)
				{
					q=q.link;
					k++;
				}
				temp=p.data;
				p.data=q.data;
				q.data=temp;
				i++;
				j--;
				p=p.link;
				q=start;
			}
		}
	}		
}
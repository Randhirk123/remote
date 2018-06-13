import java.util.*;
class QueueDemo1
{
	int rear=0;
	int front=0;
	void insert(int a[],int n,int value)
	{
			if(rear==n)
			{
				System.out.println("queue is full");
			}
			else
			{
				a[rear]=value;
				rear++;
			}
	}
	void pop(int a[])
	{
		if(front==rear)
		{
			System.out.println("Empty");
		}
		else
		{
			System.out.println(a[front++]);
		}
		
	}
	void display(int a[])
	{
		if(rear==front)
		{
			System.out.println("queue is empty");
		}
		else
		{
		  for( int i=front;i<rear;i++)
		    {
			System.out.print(a[i]+" ");
		    }
	    }
	}
	
}
class QueueDemo
{
	public static void main(String [] args)
	{
		QueueDemo1 d= new QueueDemo1();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of Queue");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		while(true)
		{
			System.out.println("1..insert the element");
			System.out.println("2..pop the element");
			System.out.println("3..display");
			System.out.println("enter the choice");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				System.out.println("enter the value");
				int value=sc.nextInt();
				    d.insert(a,n,value);
					break;
					
				case 2:
				  d.pop(a);
				   break;
				   
				case 3:
				{
					d.display(a);
				}
		    }
		}
	}
}

import java.util.*;
class StackDemo3
{
	int top=-1;
	void push(int a[] ,int n ,int z)
	{
		if(top==n-1)
		{
			System.out.println("stack is overflow");
			
		}
		else
		{
			a[++top]=z;
		}
	}
	void pop(int a[])
	{
		if(top==-1)
		{
			System.out.println("stack is underflow");
		}
		else
		{
			System.out.println( a[top--]);
		}
	}
	void display(int a[])
	{ 
		if(top==-1)
		{
			System.out.println("stack is empty");
		}
		else
		{
			for(int i=top;i>=0;i--)
			{
				System.out.println(a[i]);
			}	
		}
	}
	
}
class StackDemo2
{
	//StackDemo3 s=new StackDemo3();
	//Scanner sc=new Scanner(System.in);
	
	public static void main(String[]args)
	{
		StackDemo3 s=new StackDemo3();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Size of stack");
		int n=sc.nextInt();
		int a[]=new int[n];
		while(true)
		{
			System.out.println("1.push the element");
			System.out.println("2.pop the element");
			System.out.println("3.display the element");
			System.out.println("4.exit..");
			System.out.println("enter your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				System.out.println("enter the element");
				int z=sc.nextInt();
				    s.push(a,n,z);
					break;
				case 2:
				s.pop(a);
				break;
				case 3:
				s.display(a);
				break;
				case 4:
				System.exit(0);
			}
		}
	}	
}
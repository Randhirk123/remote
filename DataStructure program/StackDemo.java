import java.util.Scanner;

class StackOperation
{
	int top=-1;
	void push(int a[],int n,int val)
	{
		if(top==n-1)
		{
			System.out.println("Sorry user Stack is Full");
		}
		else
		{
			a[++top]=val;
		}
	}
	void pop(int a[])
	{
		if(top==-1)
		{
			System.out.println("stack is empty");
		}
		else
		{
			System.out.println(a[top--]);
		}
	}
	void display(int a[])
	{
		for(int i=top; i>=0; i--)
		{
			System.out.print(a[i]+"->");
		}
		System.out.println();
	}
}


class StackDemo
{
	public static void main(String[] arg)
	{
		StackOperation s=new StackOperation();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Stack..");
		int n=sc.nextInt();
		int a[]=new int[n];
		while(true)
		{
			System.out.println("1...Push The Elemet");
			System.out.println("2...Pop The Elemet");
			System.out.println("3...Display The Elemet");
			System.out.println("4...Exit........");
			System.out.println("Enter your choice...");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter the value...");
					int val=sc.nextInt();
					s.push(a,n,val);
				break;
				case 2:
					s.pop(a);
				break;
				
				case 3:
					s.display(a);
				break;
				case 4:
					System.exit(0);
				break;
			}
		}
	}
}
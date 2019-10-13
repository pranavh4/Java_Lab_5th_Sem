import java.util.Scanner;

interface DataStructure
{
	public void push(int elem);
	public int pop();
	public boolean isEmpty();
	public boolean isFull();
}

class Stack implements DataStructure
{
	int []arr;
	int len;
	int top=-1;
	
	Stack(int len)
	{
		arr = new int[len];
		this.len = len;
	}
	
	@Override
	public void push(int elem) {
		// TODO Auto-generated method stub
		if(!isFull())
			arr[++top] = elem;
		else
			System.out.println("Stack Full");
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if (!isEmpty())
			return arr[top--];
		System.out.println("Stack Empty");
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(top<0)
			return true;
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if(top==len-1)
			return true;
		return false;
	}
	
}

class Queue implements DataStructure
{
	int []arr;
	int len;
	int front = 0, rear = 0;
	Queue(int len)
	{
		arr = new int[len];
		this.len = len;
	}

	@Override
	public void push(int elem) {
		// TODO Auto-generated method stub
		if(isFull())
			System.out.println("Queue Full");
		else
		{
			arr[rear] = elem; 
			rear = (rear+1)%len;
		}
			
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(!isEmpty())
		{
			int val = arr[front];
			front = (front + 1)%len;
			return val;
		}
		System.out.println("Queue Empty");
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(front == rear)
			return true;
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if((rear+1)%len==front)
			return true;
		return false;
	}
	
}
public class DataStructure_Test {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Stack 2.Queue");
		int ch1 = sc.nextInt();
		switch(ch1)
		{
		case 1:
		{
			System.out.print("Enter Stack size");
			int len = sc.nextInt();
			System.out.println("1.Push\t2.Pop\t3.Exit");
			Stack s = new Stack(len);
			while(true)
			{
				int ch2 = sc.nextInt();
				switch(ch2)
				{
				case 1:
				{
					System.out.print("Enter number: ");
					s.push(sc.nextInt());
					break;
				}
				case 2:
				{
					int num = s.pop();
					if(num!=0)
						System.out.println("Popped Element: "+num);
					break;
				}
				case 3:
					System.out.println("Exited");
					System.exit(1);
				default:
					System.out.println("Invalid Choice");
				}
			}
		}
		case 2:
		{
			System.out.print("Enter Queue size: ");
			int len = sc.nextInt();
			System.out.println("1.Push\t2.Pop\t3.Exit");
			Queue q = new Queue(len);
			while(true)
			{
				int ch2 = sc.nextInt();
				switch(ch2)
				{
				case 1:
				{
					System.out.print("Enter number: ");
					q.push(sc.nextInt());
					break;
				}
				case 2:
				{
					int num = q.pop();
					if(num!=0)
						System.out.println("Popped Element: "+num);
					break;
				}
				case 3:
					System.out.println("Exited");
					System.exit(1);
				default:
					System.out.println("Invalid Choice");
				}
			}
		}
		}
	}
}

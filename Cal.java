import java.util.Scanner;
import java.util.*;
public class Cal extends Cal1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,choice;
		System.out.println("Enter two digits:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter choice:");
		System.out.println("1.Add");
		System.out.println("2.Subtract");
		System.out.println("3.Divide");
		System.out.println("4.Multiply");
		choice=sc.nextInt();
		while(choice>4){
			System.out.println("Enter valid Choice");
			choice=sc.nextInt();
		}
		Cal1 m=new Cal1();
		if(choice==1){
			c=m.add(a,b);
			System.out.println(c);
		}
		else if(choice==2){
			c=m.sub(a,b);
			System.out.println(c);
		}
		else if(choice==3){
			c=m.mul(a,b);
			System.out.println(c);
		}
		else if(choice==4){
			c=m.div(a,b);
			System.out.println(c);
		}

	}
}
class Cal1
{
	public int add(int x,int y){
		int z;
		z=x+y;
		return z;
	}
	public int sub(int x,int y){
		int z;
		z=x-y;
		return z;
	}
	public int mul(int x,int y){
		int z;
		z=x*y;
		return z;
	}
	public int div(int x,int y){
		int z;
		z=x/y;
		return z;
	}
}
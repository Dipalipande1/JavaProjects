import java.util.Scanner;
public class SwitchCase {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Calculator c=new Calculator();
	while(true)
	{
		System.out.println("1.Addition");
		System.out.println("2.Substraction\n"
				            +"3.Multiplication\n"
				            +"4.Divisin\n"
				            +"5.Exit" );
	
	System.out.println("Enter your choice");
	int ch=sc.nextInt();
	switch(ch)
	{
	case 1:
		c.add();
	break;
	case 2:
		c.sub();
		break;
	case 3:
		c.mul();
		break;
	case 4:
		c.div();
		break;
	case 5:
		System.exit(0);
	}
	}
}
}


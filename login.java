import java.io.*;
import java.util.*;
import java.text.DecimalFormat; 
public class Login extends Account{
	Scanner input=new Scanner(System.in);
	DecimalFormat money=new DecimalFormat("'$'###,##0.00");
	HashMap <String,Integer> data=new HashMap<String,Integer>();
	Account usr=new Account();
	String user;
	int pin;
	public int logmeth() {
		int x=1;
		do {
			try {
			data.put("priya", 12345);
			data.put("riya", 67890);
			System.out.println("WELCOME TO ATM INTERFACE.....");
			System.out.println("Enter user name..");
			String usr=this.user=input.next();
			System.out.println("Enter your pin..");
			this.pin=input.nextInt();
			}catch(Exception e) {
				System.out.println("invalid characters..");
				x=2;
			}
			if(data.containsKey(this.user)&& data.get(this.user)==this.pin){
				System.out.println("Valid login.."+" "+"You can now perform your transactions");
				usr.functionalities();
			}else {
				System.out.println("Invalid Login");
			}
	}while(x==1);
	return 0;
	}
}

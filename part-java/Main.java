import java.io.Console;

public class Main{
	
	
	public static void main(String[] args){
		Console console=System.console();
		System.out.println("welcome to group3 demo project");
		int selection=Integer.parseInt(console.readLine("1:Create account \n2:Login \n"));
		Account user;
		switch(selection){
			case 1:
				user=new Account(console.readLine("Username:"),console.readLine("Password:"));
				break;
			case 2:
				user=new Account(console.readLine("UserName:"));
				//user.exist();
				break;
			default:
				user=new Account("none");
				System.exit(0);
				break;
		}
		
		System.out.println("Hi "+user.getUserName()+" please enter your password");
		if(user.verifyPassword(console.readLine())){
			System.out.println("success");
			System.out.println(user.getOptions());
		}else{
			System.out.println("Wrong username or password");
		}
		
		
	}
}

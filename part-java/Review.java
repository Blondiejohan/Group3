public class Review{
	
	private final Account owner;
	private String date;
	private String text;
		
	
	public Review(Account user,String text){
		this.owner=user;
		this.date="today";
		this.text=text;
	}
	
	public String getDate(){
		return this.date;
	}
	
	public void changeText(String text){
		this.text=text;
	}
	
	public String getText(){
		return this.text;
	}
	
	public String getOwnerName(){
		return this.owner.getUserName();
	}
	
}

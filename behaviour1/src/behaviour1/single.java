package behaviour1;

public class single {

		  
		   private static single instance = new single();

		   
		   private single(){}

		   public static single getInstance(){
		      return instance;
		   }

		   public void showMessage(){
		      System.out.println("Welcome to single class");
		   }
		}


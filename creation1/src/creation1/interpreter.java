package creation1;

public class interpreter {
		   //Rule: Robert and John are male
		   public static exp getMaleexp(){
			   exp robert = new terminalexp("Robert");
			   exp john = new terminalexp("John");
		      return new orexp(robert, john);		
		   }

		   //Rule: Julie is a married women
		   public static exp getMarriedWomanExpression(){
			   exp julie = new terminalexp("Julie");
			   exp married = new terminalexp("Married");
		      return new andexp(julie, married);		
		   }

		   public static void main(String[] args) {
			   exp isMale = getMaleexp();
			   exp isMarriedWoman = getMarriedWomanExpression();

		      System.out.println("John is male? " + isMale.interpret("John"));
		      System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
		   }
		}


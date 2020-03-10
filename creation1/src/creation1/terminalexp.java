package creation1;

	public class terminalexp implements exp{
		
		   private String data;

		   public terminalexp(String data){
		      this.data = data; 
		   }

		   @Override
		   public boolean interpret(String context) {
		   
		      if(context.contains(data)){
		         return true;
		      }
		      return false;
		   }
		}
		


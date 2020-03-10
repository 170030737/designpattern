package creation1;

	public class orexp implements exp {
		 
		   private exp expr1 = null;
		   private exp expr2 = null;

		   public orexp(exp expr1, exp expr2) { 
		      this.expr1 = expr1;
		      this.expr2 = expr2;
		   }

		   @Override
		   public boolean interpret(String context) {		
		      return expr1.interpret(context) || expr2.interpret(context);
		   }
		}


package creation2;

public class itre_dp {
		
		   public static void main(String[] args) {
		      namerep namesRepository = new namerep();

		      for(iterator iter = namesRepository.getIterator(); iter.hasNext();){
		         String name = (String)iter.next();
		         System.out.println("Name : " + name);
		      } 	
		   }
		}


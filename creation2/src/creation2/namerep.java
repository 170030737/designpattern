package creation2;

	public class namerep implements container {
		   public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

		   @Override
		   public iterator getIterator() {
		      return new Nameiterator();
		   }

		   private class Nameiterator implements iterator {

		      int index;

		      @Override
		      public boolean hasNext() {
		      
		         if(index < names.length){
		            return true;
		         }
		         return false;
		      }

		      @Override
		      public Object next() {
		      
		         if(this.hasNext()){
		            return names[index++];
		         }
		         return null;
		      }		
		   }
		}


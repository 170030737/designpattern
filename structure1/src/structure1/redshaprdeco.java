package structure1;

	public class redshaprdeco extends shapedeco {

		   public redshaprdeco(shape decoratedShape) {
		      super(decoratedShape);		
		   }

		   @Override
		   public void draw() {
		      decoratedShape.draw();	       
		      setRedBorder(decoratedShape);
		   }

		   private void setRedBorder(shape decoratedShape){
		      System.out.println("Border Color: Red");
		   }
		}
	

package structure1;

	public abstract class shapedeco implements shape {
		   protected shape decoratedShape;

		   public shapedeco(shape decoratedShape){
		      this.decoratedShape = decoratedShape;
		   }

		   public void draw(){
		      decoratedShape.draw();
		   }	
	}

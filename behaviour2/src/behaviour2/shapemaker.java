package behaviour2;

public class shapemaker {
		   private shape round;
		   private shape rectgle;
		   private shape squre;

		   public shapemaker() {
		      round = new round();
		      rectgle = new rectgle();
		      squre = new squre();
		   }

		   public void drawround(){
			   round.draw();
		   }
		   public void drawrectgle(){
			   rectgle.draw();
		   }
		   public void drawsqure(){
			   squre.draw();
		   }
		}


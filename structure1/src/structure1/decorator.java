package structure1;

	public class decorator {
		   public static void main(String[] args) {

			   shape circle = new round();

			   shape redCircle = new redshaprdeco(new round());

			   shape redRectangle = new redshaprdeco(new rect());
		      System.out.println("Circle with normal border");
		      circle.draw();

		      System.out.println("\nCircle of red border");
		      redCircle.draw();

		      System.out.println("\nRectangle of red border");
		      redRectangle.draw();
		   }
		}

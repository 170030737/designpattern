package structure2;

	public class mp4ply implements advmediaply{

		   @Override
		   public void playVlc(String fileName) {
		      //do nothing
		   }

		   @Override
		   public void playMp4(String fileName) {
		      System.out.println("Playing mp4 file. Name: "+ fileName);		
		   }
		}

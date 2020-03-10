package structure2;

	public class vlcply implements advmediaply{
		   @Override
		   public void playVlc(String fileName) {
		      System.out.println("Playing vlc file. Name: "+ fileName);		
		   }

		   @Override
		   public void playMp4(String fileName) {
		      //do nothing
		   }
	}
		
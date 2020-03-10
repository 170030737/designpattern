package structure2;

	public class  mediaadpt implements mediaply {

		advmediaply advancedMusicPlayer;

		   public  mediaadpt(String audioType){
		   
		      if(audioType.equalsIgnoreCase("vlc") ){
		         advancedMusicPlayer = new vlcply();			
		         
		      }else if (audioType.equalsIgnoreCase("mp4")){
		         advancedMusicPlayer = new mp4ply();
		      }	
		   }

		   @Override
		   public void play(String audioType, String fileName) {
		   
		      if(audioType.equalsIgnoreCase("vlc")){
		         advancedMusicPlayer.playVlc(fileName);
		      }
		      else if(audioType.equalsIgnoreCase("mp4")){
		         advancedMusicPlayer.playMp4(fileName);
		      }
		   
		   }
	}
// AndroidMusicPlayer.java
public class AndroidMusicPlayer extends MusicPlayer {
  @Override
  public void playMusic(String track) {
      System.out.println("Playing music on Android: " + track);
  }

  @Override
  public void saveMusic() {
      System.out.println("Saving music on Android");
  }

  @Override
  public void stopMusic() {
      System.out.println("Stopping music on Android");
  }
}

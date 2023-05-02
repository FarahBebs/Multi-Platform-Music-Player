// DesktopMusicPlayer.java
public class DesktopMusicPlayer extends MusicPlayer {
  @Override
  public void playMusic(String track) {
      System.out.println("Playing music on Desktop: " + track);
  }

  @Override
  public void saveMusic() {
      System.out.println("Recording music on Desktop");
  }

  @Override
  public void stopMusic() {
      System.out.println("Stopping music on Desktop");
  }
}

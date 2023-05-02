// Main.java
public class Main {
  public static void main(String[] args) {
      MusicPlayer androidPlayer = new AndroidMusicPlayer();
      androidPlayer.playMusic("Track 1");
      androidPlayer.saveMusic();
      androidPlayer.stopMusic();

      MusicPlayer desktopPlayer = new DesktopMusicPlayer();
      desktopPlayer.playMusic("Track 2");
      desktopPlayer.saveMusic();
      desktopPlayer.stopMusic();
  }
}

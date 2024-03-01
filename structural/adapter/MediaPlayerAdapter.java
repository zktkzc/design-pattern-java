package structural.adapter;

/**
 * 媒体播放器适配器
 */
public class MediaPlayerAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(String audioType) {
        if ("vlc".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new VlcPlayer();
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if ("vlc".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playVlc(filename);
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.playMp4(filename);
        }
    }
}

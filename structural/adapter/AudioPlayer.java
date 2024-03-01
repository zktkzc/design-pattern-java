package structural.adapter;

public class AudioPlayer implements MediaPlayer {
    private MediaPlayerAdapter mediaPlayerAdapter;

    @Override
    public void play(String audioType, String filename) {
        if ("mp3".equalsIgnoreCase(audioType)) {
            // 音频文件
            System.out.println("播放mp3文件：" + filename);
        } else if ("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)) {
            // 视频文件
            mediaPlayerAdapter = new MediaPlayerAdapter(audioType);
            mediaPlayerAdapter.play(audioType, filename);
        }
    }
}

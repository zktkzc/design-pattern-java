package structural.adapter;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String filename) {
        // 当前格式为mp4，vlc格式不做实现
    }

    @Override
    public void playMp4(String filename) {
        System.out.println("播放mp4文件：" + filename);
    }
}

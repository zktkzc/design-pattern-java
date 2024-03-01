package structural.adapter;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String filename) {
        System.out.println("播放vlc文件：" + filename);
    }

    @Override
    public void playMp4(String filename) {
        // 当前格式为vlc，MP4格式不做具体实现
    }
}

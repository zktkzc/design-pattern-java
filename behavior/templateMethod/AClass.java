package behavior.templateMethod;

public abstract class AClass {
    protected final void makeClass() {
        this.makePPT();
        this.makeVideo();
        if (flag()) {
            this.makeNote();
        }
        this.doSomething();
    }

    public final void makePPT() {
        System.out.println("制作课程的PPT");
    }

    public final void makeVideo() {
        System.out.println("制作课程的视频");
    }

    public final void makeNote() {
        System.out.println("制作课程的讲义");
    }

    protected boolean flag() {
        return false;
    }

    public abstract void doSomething();
}

package creational.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Pig peki = new Pig();
        peki.setName("佩奇");
        peki.setDoSomething("喜欢吃蛋糕");
        System.out.println(peki);

        Pig george = (Pig) peki.clone();
        george.setName("乔治");
        george.setDoSomething("喜欢睡觉");
        System.out.println(george);

        Pig pigDad = (Pig) peki.clone();
        pigDad.setName("猪爸爸");
        pigDad.setDoSomething("喜欢开车");
        System.out.println(pigDad);

        Pig pigMom = (Pig) peki.clone();
        pigMom.setName("猪妈妈");
        pigMom.setDoSomething("喜欢做饭");
        System.out.println(pigMom);
    }
}

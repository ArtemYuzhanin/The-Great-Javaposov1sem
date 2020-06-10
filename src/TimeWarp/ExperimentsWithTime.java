package TimeWarp;

public class ExperimentsWithTime {
    public static void main(String[] args) {
        Time t = new Time(1,11);
        System.out.println(t.show());
        System.out.println(t.isMorning());
        System.out.println(t.isDay());
        System.out.println(t.isEvening());
        System.out.println(t.isNight());
        System.out.println(t.sayHello());
        t.add(163);
        System.out.println(t.show());

    }
}

package TimeWarp;

public class Time {
    private int Hours;
    private int Minutes;
    public Time(int Hours, int Minutes) {
        this.Hours = Hours;
        this.Minutes = Minutes;
    }

    public String show() {
        if (Minutes < 10)
            return Integer.toString(Hours)+":0"+Integer.toString(Minutes);
        else
            return Integer.toString(Hours)+":"+Integer.toString(Minutes);
    }


    public boolean isMorning() {
        return (Hours > 6 && Hours < 13);
    }


    public boolean isDay() {
        return (Hours > 12 && Hours < 18);
    }

    public boolean isEvening() {
        return (Hours > 16 && Hours < 23);
    }

    public boolean isNight() {
        return ((Hours >= 0 && Hours < 7) || (Hours == 23));
    }

    public String sayHello() {
        if (isMorning())
            return "Доброе утро!";
        if (isDay())
            return "Добрый день!";
        if (isEvening())
            return "Добрый вечер!";
        if (isNight())
            return "Доброй ночи!";
        return "Доброй жизни!";
    }

    public void add(int upper) {
        int upperH = upper / 60;
        int upperM = upper % 60;
        Hours += upperH;
        Minutes += upperM;
    }
}

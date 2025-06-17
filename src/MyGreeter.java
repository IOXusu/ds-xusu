import java.time.LocalTime;

public class MyGreeter {

    public String greeting() {

        // 获取当前时间
        int currentHour = LocalTime.now().getHour();

        // 判断当前时间所属区间
        if (currentHour >= 6 && currentHour < 12) {
            return "Good morning";
        } else if (currentHour >= 12 && currentHour < 18) {
            return "Good afternoon";
        } else {
            return "Good evening";
        }
    }
}

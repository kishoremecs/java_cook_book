import java.util.Date;

public class MaxDateTimeInLong {

    public static void main(String... args) {
        Date endOfTime = new Date(Long.MAX_VALUE);
        System.out.println("Java time overflows on " + endOfTime);
    }
}

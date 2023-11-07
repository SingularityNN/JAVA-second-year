package Clock;

public class Main {
    public static void main(String[] args) {
        Clock new_clock = new Clock(0, 0, "casio", 100);
        new_clock.Set_time(12, 15);
        new_clock.Move_time(3, 3);
        new_clock.Print_info();

        Clock_sec new_sec_clock = new Clock_sec(0, 0, 0, "aboba", 250);
        new_sec_clock.Set_time(3, 2, -10);
        new_sec_clock.Move_time(4, 10, 0);
        new_sec_clock.Print_info();
    }
}

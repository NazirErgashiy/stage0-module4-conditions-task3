package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if(month<=2&&month>0)
        {
            System.out.println("Winter");
        }
        if(month<=5&&month>2)
        {
            System.out.println("Spring");
        }
        if(month<=8&&month>5)
        {
            System.out.println("Summer");
        }
        if(month<=11&&month>8)
        {
            System.out.println("Autumn");
        }
        if(month==12)
        {
            System.out.println("Winter");
        }
        if(month<=0||month>12)System.out.println("wrong number!");
    }
}

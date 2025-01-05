
class FindDay {
    static int dayofweek(int d, int m, int y)
    {
        int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
        if (m < 3)
            y--;
        return (y + y / 4 - y / 100 + y / 400 + t[m - 1]
                + d)%7;
    }
 
    public static void main(String[] args)
    {
        int day = dayofweek(27, 06, 2022);
        if(day == 0) {
        	System.out.println("Sunday");
        }
        if(day == 1) {
        	System.out.println("Monday");
        }
        if(day == 2) {
        	System.out.println("Tusday");
        }
        if(day == 3) {
        	System.out.println("Wensday");
        }
        if(day == 4) {
        	System.out.println("Thusday");
        }
        if(day == 5) {
        	System.out.println("Friday");
        }
        if(day == 6) {
        	System.out.println("Saturday");
        }
    }
}
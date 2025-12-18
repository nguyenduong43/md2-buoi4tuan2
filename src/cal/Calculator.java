package cal;

public class Calculator {
    public int add(int x, int y) {
        if (x/2  + y/2  >= Integer.MAX_VALUE/2 ) {
            throw new RuntimeException("out of range exception");
        }
        return x + y;
    }
        public static int findAbsolute(int number){
            if (number < 0) return -number ;
            return number;
        }
        public static int day(int a[],int b[])
        {
            if (a[0]+1==b[0]) return 1;
            else return 0;
        }
    }
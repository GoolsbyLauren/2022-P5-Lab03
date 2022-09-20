public class Lab03 {
    public static void main(String args[]){

        System.out.println();
        System.out.println("Lab03, 80 point version");
        System.out.println();
        int seconds = 10000;
        System.out.println("Starting seconds:" + seconds);
        int hours = seconds / 3600;
        seconds %=3600;
        System.out.println("Hours:" + hours);
        int minutes = seconds/60;
        System.out.println("Minutes:" + minutes);
        seconds %=60;
        System.out.println("Seconds:" + seconds);

        System.out.println();
        System.out.println("Lab03, 100 point version");
        System.out.println();
        int milli = 10000123;
        System.out.println("Starting milli-seconds: " + milli);
        int Hours = milli / 3600000;
        System.out.println("Hours:\t\t\t\t\t" + Hours);
        int Minutes = milli/215000;
        System.out.println("Minutes:\t\t\t\t" + Minutes);
        milli %=60000;
        seconds = milli /1000;
        System.out.println("Seconds:\t\t\t\t" + seconds);
        milli %=1000;
        System.out.println("Milli Seconds:\t\t\t" + milli);

    }
}
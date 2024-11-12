// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
    public static void main(String[] args) {
        
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt ("" + args [0].charAt(3) + args [0].charAt(4));

        String day = "AM";
        
        if (hours == 0){
            hours = 0;
        } else if (hours == 12){
            day = "PM";
        } else if (hours > 12){
            hours = hours - 12;
            day = "PM";
        }

        String realMin;
        if (minutes < 10){
            realMin = "0" + minutes;
        } else {
            realMin = Integer.toString( minutes);
        }

        System.out.println( hours + ":" + realMin + " " + day);




    }
}
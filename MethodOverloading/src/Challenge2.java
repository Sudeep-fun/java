public class Challenge2 {
    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }
    private static String getDurationString(long minutes,long seconds){
        if((minutes<0)||(seconds<0)||(seconds>59)){
            return "Invalid Value";
        }
        long hours =minutes /60;
        long remainingMinutes = minutes % 60;
        return hours +" hours "+ remainingMinutes+" minutes " + seconds+" seconds";
    }
    private static String getDurationString(long seconds){
        if(seconds<0){
            return "invalid Value";
        }
        long minutes = seconds /60;
        long remSeconds =seconds %60;
        return getDurationString(minutes,remSeconds);
    }
}

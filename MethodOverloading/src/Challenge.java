public class Challenge {
    public static void main(String[] args) {
        calcFeetAndInches(6,0);
        calcFeetAndInches(7,0);
        calcFeetAndInches(100);
        calcFeetAndInches(156);
    }
    public static double calcFeetAndInches (double feet, double inches){
        //Validation of the limits of input
        if((feet <0)||((inches<0)||(inches>12))){
            System.out.println("Invalid Numbers for feet and inches");
            return -1;
        }
        double centimeters = (feet*12)*2.54;
        centimeters+=inches*2.54;
        System.out.println(feet+" feet, "+inches+" inches = "+centimeters+" cm");
        return centimeters;
    }
    public static double calcFeetAndInches (double inches){
        if(inches<0){
            return -1;
        }
        double feet=(int)inches/12;
        double remaininginches=(int)inches%12;
        System.out.println(inches+" inches is equal to "+feet+" feet and "+remaininginches+" inches");
        return calcFeetAndInches(feet,remaininginches);
    }
}

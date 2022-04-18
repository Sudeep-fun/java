public class Operators {
    public static void main(String[] args) {
        //Arithmetic Operators
        int result = 1 + 2; //1+2 =3
        System.out.println("1+2 =" + result);
        result = result - 1; //3-1 =2
        System.out.println("3-1 is equal to " + result);
        result *= 10; //2*10 =20 : using abbreviate operator
        System.out.println("2 *10 is equal to " + result);
        result = result % 3;//remainder of 20/3
        System.out.println("remainder of 20/3 is " + result);
        result /= 2; //2/2=1
        System.out.println("2 divided by 2 is " + result);

        //Logical Operators
        boolean isAlien = false;
        if (isAlien == false) {//checks the logical result
            System.out.println("It is not an Alien");
            System.out.println("I am scared of Aliens");
        }
        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the High Score !");
        }
        if (topScore >= 100) {
            System.out.println("You got the High Score!");
        }
        int secondTopScore =60;
        topScore=80;
        //logical AND : Requires both statement to be true
        if (topScore>secondTopScore && topScore<100){
            System.out.println("Greater than Second top score and less than 100");
        }
        //Logical OR : Atleast one of statement to be true
        if(topScore<100 || topScore<secondTopScore){
            System.out.println("Either or both the condition is true");
        }
        //Ternary Operator
        boolean isCar = true;
        boolean wasCar = isCar?true:false; //if iscar true , assign true else assign false
        System.out.println("Was Car ? "+ wasCar);
    }
}
public class Primitive {
    public static void main(String[] args) {
        //Integer Declaration - 32 bits
        int myFirstNumber =5;
        System.out.println(myFirstNumber);
        int sum = 10+5 ; //sum resolved during assignment of the variable
        System.out.println(sum);

        //Arithmetic Expressions
        int mySecondNumber=12;
        int myThirdNumber=6;
        // also supports +,-,*,/,%
        int total= myFirstNumber+mySecondNumber+myThirdNumber;
        System.out.println(total);

        // Primitive Data Types in Java: boolean,char,short,long,int,float and double
        int myMinValue =Integer.MIN_VALUE;// Integer is a wrapper class
        int myMaxValue=Integer.MAX_VALUE;
        System.out.println("Integer Minimum value: "+myMinValue);
        System.out.println("Integer Maximum Value: "+myMaxValue);
        //overflow of the max value-> wrap around
        System.out.println("Busted Max value: "+(myMaxValue+1));
        //Ctrl+D to duplicate the command
        System.out.println("Busted Min value: "+(myMinValue-1));
        
        //Byte Primitive Type - 8 bits
        byte myMinByteValue=Byte.MIN_VALUE;
        byte myMaxByteValue=Byte.MAX_VALUE;
        System.out.println("Byte Min Value: "+myMinByteValue);
        System.out.println("Byte Max Value: "+myMaxByteValue);

        //Short Primitive Type - 16 bits
        short myMinShortValue=Short.MIN_VALUE;
        short myMaxShortValue=Short.MAX_VALUE;
        System.out.println("Short Min Value: "+myMinShortValue);
        System.out.println("Short Max Value: "+myMaxShortValue);

        //Long Primitive Type - 64 bits
        long myMinLongValue=Long.MIN_VALUE;
        long myMaxLongValue=Long.MAX_VALUE;
        System.out.println("Long Min Value: "+myMinLongValue);
        System.out.println("Long Max Value: "+myMaxLongValue);
        long number = 100L; //long requires l or L at the end of declaration
        System.out.println("long number: "+number);

        //Type casting : Used to maintain same data type in an expression
        byte myNewNumber=(byte)(myMinByteValue/2); // byte casting : division returns integer
        System.out.println(myNewNumber);

        //Floating numbers
        //Single precision - 32 bits and Double Precision - 64 bits
        //Single Precision - float data type and Double Precision-double data type
        int myIntValue= 5/3; //displays only whole number for division
        float myFloatValue= 5.25f/3f; // only 5.25 will give error as default is double for floating numbers
        double myDoubleValue=5.25d/3d;
        System.out.println("Integer Division Value: "+myIntValue);
        System.out.println("Float Division Value: "+myFloatValue);
        System.out.println("Integer Division Value: "+myDoubleValue);

        //Challenge: Conversion of Pound to Kilogram
        // 1 pound = 0.45359237 kilogram & input will be in pounds
        double PoundValue= 10.5d;
        double KiloValue = 0.45359237d * PoundValue;
        System.out.println("The equivalent Kilograms for the pound "+PoundValue+" is : "+KiloValue);

        //character data type-Only holds one character
        char myChar='D';
        char myUnicodeChar='\u0044'; //unicode for the character D
        System.out.println("Unicode character for u0044 is: "+myUnicodeChar);
    }
}

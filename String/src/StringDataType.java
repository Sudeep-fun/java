public class StringDataType {
    public static void main(String[] args) {
        // String Declaration and concatenation with unicode character
        String myString = "This is a String";
        System.out.println("My String is equal to: "+myString);
        myString =myString+", and this is more"; //string concat
        System.out.println("My String is equal to: "+myString);
        myString =  myString +" \u00A9 2019"; //unicode for copyright symbol
        System.out.println("My String is equal to: "+myString);
    }
}

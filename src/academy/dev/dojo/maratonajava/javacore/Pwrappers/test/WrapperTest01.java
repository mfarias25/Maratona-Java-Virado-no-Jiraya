package academy.dev.dojo.maratonajava.javacore.Pwrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {


    byte byteP = 1;
    short shortP = 1;
    int intP = 1;
    long longeP = 1;
    float floatP = 1;
    double doubleP = 1;
    char charP = 1;
    boolean booleanP = true;

        //AUTOBOXING
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 1D;
        Character charW = 'W';
        Boolean booleanW = true;

        //UNBOXING
        int i = intW;
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeira = Boolean.parseBoolean("TruE");
        System.out.println(verdadeira);

        System.out.println(Character.isDigit('A')); //FALSE
        System.out.println(Character.isDigit('9'));//TRUE
        System.out.println(Character.isLetterOrDigit('!'));//FALSE
        System.out.println(Character.isUpperCase('!'));//FALSE
        System.out.println(Character.isLowerCase('!'));//FALSE
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));
    }
}

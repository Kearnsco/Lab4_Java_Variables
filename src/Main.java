public class Main
{
    public static void main(String[] args)
    {
        int intOperandA = 22;
        int intOperandB = 15;

        int intSum = 0;
        int intProduct = 0;
        int intDifference = 0;
        int intQuotient = 0;
        int intModulo = 0;

        double doubleOperandA = 23.5;
        double doubleOperandB = 16.5;

        double doubleSum = 0;
        double doubleProduct = 0;
        double doubleDifference = 0;
        double doubleQuotient = 0;
        double doubleModulo = 0;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum of using two integers of " + intOperandA + " and " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product of two integers of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        intDifference = intOperandA - intOperandB;
        System.out.println("the difference of two integers of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient of two integers of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo of two integers of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        double lunchCost = 15.50;

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum of two double integers of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product of two double integers of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference of two double integers of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient of two double integers of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);




    }
}
public class Main {

    public static void main(String[] args) {

        //Initializing new calculator object
        SimpleCalculator calculator = new SimpleCalculator();
        //Set numbers
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        //Call methods inside object for calculations
        System.out.println("Add = " + calculator.getAdditionResult());
        System.out.println("Subtract = " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("Multiply = " + calculator.getMultiplicationResult());
        System.out.println("Divide = " + calculator.getDivisionResult());
    }
}

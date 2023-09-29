package CoreJavaConcepts.OOPs_Concepts.Polymorphism.FinalKeyword_Constant;

public class InitiazeBlankFinalVariable {
    final String aadhaarCardNumber;
    static final String panCardNumber;

    // blank final variable can be initialized only in constructor
    InitiazeBlankFinalVariable(String aadhaarCardNumber) {
        this.aadhaarCardNumber = aadhaarCardNumber;
    }

    // A static final variable that is not initialized at the time of declaration is
    // known as static blank final variable. It can be initialized only in static
    // block.
    static {
        panCardNumber = "123";
    }

    void setAadhaarCardNumber(String aadhaarCardNumber) {
        // The final field InitiazeBlankFinalVariable.aadhaarCardNumber cannot be
        // assignedJava(33554512)
        // There is no setter methods i.e. we have no option to change the value of the
        // instance variable.
        // this.aadhaarCardNumber = aadhaarCardNumber;

    }

    public static void main(String[] args) {
        System.out.println(InitiazeBlankFinalVariable.panCardNumber);
        InitiazeBlankFinalVariable s = new InitiazeBlankFinalVariable("456");
    }

}

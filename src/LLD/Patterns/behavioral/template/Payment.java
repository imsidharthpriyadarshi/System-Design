package LLD.Patterns.behavioral.template;

public abstract class Payment {
    public abstract void validateRequest();
    public abstract void creditAmount();
    public abstract void debitAmount();
    public abstract void calculatePlatformFee();

    public final void sendMoney(){
        //* here i'll follow the flow
        //step1
        validateRequest();

        //step2
        calculatePlatformFee();

        //step3
        debitAmount();

        //step4
        creditAmount();
    }
}

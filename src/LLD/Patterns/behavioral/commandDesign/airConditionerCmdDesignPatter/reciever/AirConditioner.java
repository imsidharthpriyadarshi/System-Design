package LLD.Patterns.behavioral.commandDesign.airConditionerCmdDesignPatter.reciever;

public class AirConditioner {
    private int temp;
    private boolean is_on;
    public void turnOnAc(){
        this.is_on=true;
        System.out.println("Ac is on");
    }

    public void turnOfAc(){
        this.is_on=false;
        System.out.println("Ac is off");
    }

    public void setTemp(int temp){
        this.temp=temp;
        System.out.println("Temperature is set to "+this.temp);
    }

    public int getTemp() {
        return temp;
    }

    public boolean isIs_on() {
        return is_on;
    }

    public void setIs_on(boolean is_on) {
        this.is_on = is_on;
    }
}

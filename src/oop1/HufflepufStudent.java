package oop1;

public class HufflepufStudent extends HogwartsStudent{
    private int integrity;
    private int loyality;
    private int hardwork;

    public HufflepufStudent(String name, int magicPower, int trangressionDistance, int integrity, int loyality, int hardwork) {
        super(name, magicPower, trangressionDistance);
        this.integrity = integrity;
        this.loyality = loyality;
        this.hardwork = hardwork;
    }

    public int getIntegrity() {
        return integrity;
    }

    public void setIntegrity(int integrity) {
        this.integrity = integrity;
    }

    public int getLoyality() {
        return loyality;
    }

    public void setLoyality(int loyality) {
        this.loyality = loyality;
    }

    public int getHardwork() {
        return hardwork;
    }

    public void setHardwork(int hardwork) {
        this.hardwork = hardwork;
    }
    public void compare (HufflepufStudent second){
        int firstSum = this.getHardwork() + this.getIntegrity()+ this.getLoyality();
        int secondSum = second.getHardwork() + second.getIntegrity()+ second.getLoyality();
        if (firstSum> secondSum){
            System.out.println(getName()+ " лучший Пуффендуец, чем "+ second.getName() );
        } else if (secondSum> firstSum) {
            System.out.println(second.getName()+ " лучший Пуффендуец, чем "+ this.getName() );
        }else {
            System.out.println(this.getName() + " и "+ second.getName() + " равны " );
        }
    }
    @Override
    public String toString() {
        return getName() + " magicPower= " + getMagicPower() +
                " ,transgressionDistance= " + getTrangressionDistance() +
                ", integrity=" + integrity +
                ", loyality=" + loyality +
                ", hardwork=" + hardwork ;
    }
}

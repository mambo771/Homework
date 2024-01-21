package oop1;

public class SlizerinStudent extends  HogwartsStudent{
    private int cunning;
    private int ambition;
    private int powerLust;
    private int decisiviness;
    private int resoursefulnes;

    public SlizerinStudent(String name, int magicPower, int trangressionDistance, int cunning, int ambition, int powerLust, int decisiviness, int resoursefulnes) {
        super(name, magicPower, trangressionDistance);
        this.cunning = cunning;
        this.ambition = ambition;
        this.powerLust = powerLust;
        this.decisiviness = decisiviness;
        this.resoursefulnes = resoursefulnes;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getPowerLust() {
        return powerLust;
    }

    public void setPowerLust(int powerLust) {
        this.powerLust = powerLust;
    }

    public int getDecisiviness() {
        return decisiviness;
    }

    public void setDecisiviness(int decisiviness) {
        this.decisiviness = decisiviness;
    }

    public int getResoursefulnes() {
        return resoursefulnes;
    }

    public void setResoursefulnes(int resoursefulnes) {
        this.resoursefulnes = resoursefulnes;
    }
    public void compare (SlizerinStudent second){
        int firstSum = this.getAmbition() + this.getCunning()+ this.getPowerLust() + this.getDecisiviness()+ this.getResoursefulnes();
        int secondSum = second.getAmbition() + second.getCunning()+ second.getPowerLust()+ second.getDecisiviness()+ second.getResoursefulnes();
        if (firstSum> secondSum){
            System.out.println(getName()+ " лучший Слизеринец, чем "+ second.getName() );
        } else if (secondSum> firstSum) {
            System.out.println(second.getName()+ " лучший Слизеринец, чем "+ this.getName() );
        }else {
            System.out.println(this.getName() + " и "+ second.getName() + " равны " );
        }
    }
    @Override
    public String toString() {
        return getName() + " magicPower= " + getMagicPower() +
                " ,transgressionDistance= " + getTrangressionDistance() +
                ", cunning=" + cunning +
                ", ambition=" + ambition +
                ", powerLust=" + powerLust +
                ", decisiviness=" + decisiviness +
                ", resoursefulnes=" + resoursefulnes;
    }
}

package oop1;

public class RavenlawStudent extends HogwartsStudent {
    private int intelligence;
    private int wisdom;
    private int smartness;
    private int creativity;

    public RavenlawStudent(String name, int magicPower, int trangressionDistance, int intelligence, int wisdom, int smartness, int creativity) {
        super(name, magicPower, trangressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.smartness = smartness;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getSmartness() {
        return smartness;
    }

    public void setSmartness(int smartness) {
        this.smartness = smartness;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    public void compare (RavenlawStudent second){
        int firstSum = this.getCreativity() + this.getIntelligence()+ this.getWisdom() + this.getSmartness();
        int secondSum = second.getCreativity() + second.getIntelligence()+ second.getWisdom() + second.getSmartness();
        if (firstSum> secondSum){
            System.out.println(getName()+ " лучший Когтевранец, чем "+ second.getName() );
        } else if (secondSum> firstSum) {
            System.out.println(second.getName()+ " лучший Когтевранец, чем "+ this.getName() );
        }else {
            System.out.println(this.getName() + " и "+ second.getName() + " равны " );
        }
    }
    @Override
    public String toString() {
        return getName() + " magicPower= " + getMagicPower() +
                " ,transgressionDistance= " + getTrangressionDistance() +
                ", intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", smartness=" + smartness +
                ", creativity=" + creativity;
    }
}

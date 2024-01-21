package oop1;

public class HogwartsStudent {
    private String name;
    private int magicPower;
    private int trangressionDistance;

    public HogwartsStudent(String name, int magicPower, int trangressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.trangressionDistance = trangressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTrangressionDistance() {
        return trangressionDistance;
    }

    public void setTrangressionDistance(int trangressionDistance) {
        this.trangressionDistance = trangressionDistance;
    }

    public void compareAnyStudents(HogwartsStudent second){
        if(this.getMagicPower()>second.getMagicPower()){
            System.out.println(this.getName()+ " Обладает большей магией, чем "+ second.getName());
        }else if (this.getMagicPower()<second.getMagicPower()) {
            System.out.println(second.getName()+ " Обладает большей магией, чем "+ this.getName());
        }else {
            System.out.println(this.getName()+ " и " + second.getName()+ " равны ");
        }
        if(this.getTrangressionDistance()>second.getTrangressionDistance()){
            System.out.println(this.getName()+ " Обладает большим расстоянием трансгрессии, чем "+ second.getName());
        }else if (this.getTrangressionDistance()<second.getTrangressionDistance()) {
            System.out.println(second.getName()+ " Обладает большим расстоянием трансгрессии, чем "+ this.getName());
        }else {
            System.out.println(this.getName()+ " и " + second.getName()+ " равны ");
        }
    }
    @Override
    public String toString() {
        return "HogwartsStudent{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", trangressionDistance=" + trangressionDistance +
                '}';
    }
}

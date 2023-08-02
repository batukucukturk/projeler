package BoxingSim;

public class Fighter {
    String name;
    int damage, health, weight;
    double dodge;
    double start;

    Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
        this.start=50;
    }

    int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");

        if (foe.isDodge()) {
            System.out.println(foe.name + " Gelen hasarı engelledi");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;


    }

    boolean isDodge() {
        double randomValue = Math.random() * 100;
        if (randomValue <= this.dodge) {
            return true;
        } else return false;
    }
    boolean start(){
        double randomStart= Math.random()*100;
        if (randomStart<=this.start){
            return true;
        }else return false;
    }

}

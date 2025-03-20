package base;
import abilities.Attackable;
import java.util.Random;

public abstract class Player implements Attackable {
    String name;
    int health;
    int attackpower;
    protected Random rand = new Random();

    public  Player(String name, int health, int attackpower) {
        this.name = name;
        this.health = health;
        this.attackpower = attackpower;
    }

    @Override
    public int attack() {
        return rand.nextInt(attackpower) + 1;
    }

    public int playerAvoid() {
        return rand.nextInt(10) + 1;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(this.name + " menerima damage " + damage + " !!" + " Sisa health:" + this.health);
    }



    public boolean isAlive() {
        return health > 0;
    }

    public abstract void infoPlayer();

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }
}
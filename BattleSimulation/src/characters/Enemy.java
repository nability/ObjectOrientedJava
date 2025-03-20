package characters;

import base.Player;

public class Enemy extends Player {
    public Enemy (String name, int health, int attackpower){
        super(name,health,attackpower);
    }

    @Override
    public int attack(){
        int damage;
        if(playerAvoid()% 2==1){
            damage = 0;
            System.out.println(getName() + " menghindari serangan!");
        }
        else{
            damage = super.attack();
            boolean criticalDamage = rand.nextDouble() > 0.4;
            if (criticalDamage) {
                damage *= 2;
                System.out.println("🔱 Critical Damage :" + getName());
            }
        }
        return damage;
    }



    @Override
    public void infoPlayer(){
        System.out.println("🥷 Enemy : " + getName() + "❤️‍🩹 HP : " + getHealth());
    }
}


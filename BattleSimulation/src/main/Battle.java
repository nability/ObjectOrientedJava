package main;
import characters.Enemy;
import characters.Hero;

public class Battle  {
    public static void main(String[] args) {
        Hero hero = new Hero ("🤴 Knight", 100, 20);
        Enemy enemy = new Enemy ("🥷 Ninja", 100, 20);

        System.out.println("Pertarugan dimulai antara" + hero.getName() + "VS" + enemy.getName());

        hero.infoPlayer();
        enemy.infoPlayer();
        System.out.println("===========================");
        
        while(hero.isAlive() && enemy.isAlive()) {
            int heroDamage = hero.attack();
            enemy.takeDamage(heroDamage);
            if(!enemy.isAlive()) {
                System.out.println(hero.getName() + "Menang !!!");
            }

            int enemyDamage = enemy.attack();
            enemy.takeDamage(enemyDamage);
            if(!enemy.isAlive()) {
                System.out.println(enemy.getName() + "Menang !!!");
            }

            System.out.println("=======================");
        }
    }
}
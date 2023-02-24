package System;

public class Hero {
    private String name;
    private int health;
    private int damage;
    private String superpower;

    public Hero(String name,int health, int damage, String superpower) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }

    public Hero(String name,int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperpower() {
        return superpower;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                ", superpower='" + superpower + '\'' +
                '}';
    }
}

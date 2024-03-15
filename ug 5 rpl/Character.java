package ac.id.ukdw;

public abstract class Character {
    protected String name;
    protected int health;
    protected int damage;

    public Character(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
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

    public boolean isDie(){
        if(health <= 0){
            return true;
        } else {return false;}
//        isi kode anda disini
    }

    public int showCharacterInfo() {
        setName(getName());
        setDamage(getDamage());
        setHealth(getHealth());
//        isi kode anda disini
        return 0;
    }

    public void attacked(int damage) {
        this.setHealth(getHealth()-damage);
//        isi kode anda disini
    }
}

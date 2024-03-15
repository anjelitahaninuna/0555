package ac.id.ukdw;

public class Creep extends Character implements AttackingHero {

    public Creep(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attack(Hero enemy) {
        enemy.attacked(super.getDamage());
//        isi kode anda disini
    }

}

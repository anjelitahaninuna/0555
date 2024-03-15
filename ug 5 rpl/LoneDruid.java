package ac.id.ukdw;

public class LoneDruid extends Hero implements Upgradeable,Summoner  {
    private int killCreep = 0;
    private int level = 0;

    public LoneDruid() {
//        super(name, health, damage);
        super("Lone Druid", 1800,140);
    }


    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setKillCreep(int killCreep) {
        this.killCreep = killCreep;
    }

    public int getKillCreep() {
        return killCreep;
    }
    @Override
    public void attack(Creep enemy) {
       enemy.attacked(getDamage());
        if (enemy.damage == 0){
            this.killCreep += 1;
        }
//        isi kode anda disini
    }

    @Override
    public SpiritBear summon() {
        return new SpiritBear(this) ;
//        isi kode anda disini
    }

    @Override
    public void upgrade() {
        if (killCreep >= 3){
            this.level += 1;
            this.killCreep -= 3;
            super.setName("Lone Druid +" + this.level) ;
            this.damage += 20;
        }
//        isi kode anda disini
    }

    @Override
    public int showCharacterInfo() {
        return killCreep;
        //        isi kode anda disini
    }

}

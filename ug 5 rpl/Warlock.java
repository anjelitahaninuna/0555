package ac.id.ukdw;

public class Warlock extends Hero implements Summoner{
    private int numOfSummon = 0;

    public Warlock() {
        super("Warlock", 700, 80);
    }

    @Override
    public void attack(Creep enemy) {
        enemy.attacked(getDamage());
//        isi kode anda disini
    }

    public void setNumOfSummon(int numOfSummon) {
        this.numOfSummon = numOfSummon;
    }

    public int getNumOfSummon() {
        return numOfSummon;
    }


    @Override
    public Character summon() {
        setNumOfSummon(getNumOfSummon()+1);
        return new Golem(this);
    }


}

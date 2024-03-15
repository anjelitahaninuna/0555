package ac.id.ukdw;

public class Golem extends  SummonCharacter implements Summoner{
    private int kill = 0;

    public Golem(Summoner summoner) {
        super("Golem", 1000,120, summoner);
    }

    public void setKill(int kill) {
        this.kill = kill;
    }

    public int getKill() {
        return kill;
    }

    @Override
    public void attack(Creep enemy) {
        enemy.attacked(getDamage());
        if (enemy.isDie()){
            this.kill += 1;
        }
//        isi kode anda disini
    }

    @Override
    public Golem summon() {
        if (kill > 0){
            this.kill -= 1;
            return new Golem(this);
        } else { return null;
        }
//     isi kode anda disini
    }
}

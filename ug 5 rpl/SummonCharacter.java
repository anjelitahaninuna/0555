package ac.id.ukdw;

public abstract class SummonCharacter extends Hero{

    protected Summoner owner;


    public SummonCharacter(String name, int health, int damage,Summoner summoner) {
        super(name, health, damage);
        this.owner = summoner;
    }


    public void setOwner(Summoner owner) {
         this.owner = owner;
    }

    public Summoner getOwner() {
        return owner;
    }
}

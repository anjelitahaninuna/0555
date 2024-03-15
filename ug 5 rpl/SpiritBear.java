package ac.id.ukdw;

public class SpiritBear extends SummonCharacter {
    public SpiritBear(LoneDruid loneDruid) {
        super("Spirit Bear", 1000, 130, loneDruid);
    }

    public void attack(Creep creep){
        creep.attacked(super.getDamage());
    }
    // isi kode anda disini


}

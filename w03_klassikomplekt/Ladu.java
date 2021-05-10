public class Ladu {
    int laoLeibKogus;
    Pood kogusLeib;

    public Ladu(int uusLeibKogus, Pood uuendatudLeib){
        laoLeibKogus = uusLeibKogus;
        kogusLeib=uuendatudLeib;
    }
    public int annaLeibKogus(){
        return laoLeibKogus;
    }
    public boolean kasVajabJuurde(){
        if(kogusLeib.poeLeibKogus()>0){
            return false;
        }else{
            return true;
        }
    }
}

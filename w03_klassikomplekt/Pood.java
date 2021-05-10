public class Pood {
    int kogusLeib;
    int uuendatudLeib;

    public Pood(int uuendatudLeib){

        kogusLeib = uuendatudLeib;
    }

    public int poeLeibKogus(){

        return kogusLeib;
    }

    public int ostaLeib(int leib){
        uuendatudLeib = kogusLeib-leib;
        return uuendatudLeib;
    }

}

public class TortSzam {
    public int szamlalo;
    public int nevezo;

    public TortSzam (){
        this.szamlalo = 0;
        this.nevezo = 1;
        }

    public TortSzam (int szamlalo) {
        this.szamlalo = szamlalo;
        this.nevezo = 1;
    }

    public TortSzam(int szamlalo, int nevezo){
        this.szamlalo = szamlalo;
        if (nevezo == 0)
            this.nevezo = 1;
        else
        this.nevezo = nevezo;

    }

    public TortSzam szorzas(TortSzam szorzo) {
        TortSzam newTortszam = new TortSzam();
        newTortszam.szamlalo = szorzo.szamlalo * this.szamlalo;
        newTortszam.nevezo = szorzo.nevezo * this.nevezo;
        return newTortszam;
    }

    public TortSzam osztas(TortSzam oszto) {
        TortSzam newTortszam = new TortSzam();
        newTortszam.szamlalo = oszto.szamlalo * this.nevezo;
        newTortszam.nevezo = oszto.nevezo * this.szamlalo;
        return newTortszam;
    }

    public void kiir(){
        System.out.println(szamlalo + "/" + nevezo);
    }

    public void ertek() {
        System.out.println(szamlalo/nevezo);
    }

}

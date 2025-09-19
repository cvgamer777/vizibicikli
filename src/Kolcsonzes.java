public class Kolcsonzes {
    private  String nev;
    private char jarmu;
    private int elvitelOra;
    private  int elvitelPerc;
    private int visszaOra;
    private int visszaPerc;


    public String getNev() {
        return  nev;
    }
    public void setNev(String nev) {
        this.nev = nev;

    }

    public char getJarmu() {
        return jarmu;
    }

    public void setJarmu(char jarmu) {
        this.jarmu = jarmu;
    }

    public int getElvitelOra() {
        return elvitelOra;
    }

    public void setElvitelOra(int elvitelOra) {
        this.elvitelOra = elvitelOra;
    }

    public int getElvitelPerc() {
        return elvitelPerc;
    }

    public void setElvitelPerc(int elvitelPerc) {
        this.elvitelPerc = elvitelPerc;
    }

    public int getVisszaOra() {
        return visszaOra;
    }

    public void setVisszaOra(int visszaOra) {
        this.visszaOra = visszaOra;
    }

    public int getVisszaPerc() {
        return visszaPerc;
    }

    public void setVisszaPerc(int visszaPerc) {
        this.visszaPerc = visszaPerc;
    }

    public Kolcsonzes(String fileLine) {
        String[] split = fileLine.split(";");
        setNev(split[0]);
        setElvitelOra(Integer.parseInt(split[2]));
        setJarmu(split[1].charAt(0));
        setElvitelPerc(Integer.parseInt(split[3]));
        setVisszaPerc(Integer.parseInt(split[4]));
        setVisszaOra(Integer.parseInt(split[5]));
    }
    public Kolcsonzes(
            String nev,
            char jarmu,
            int elvitelOra,
            int elvitelPerc,
            int visszaOra,
            int visszaPerc
    ) {
        setNev(nev);
        setElvitelOra(elvitelOra);
        setJarmu(jarmu);
        setElvitelPerc(elvitelPerc);
        setVisszaPerc(visszaPerc);
        setVisszaOra(visszaOra);
    }


}

package be.intec;

public class SnowMan {
    private int hoofd;
    private int buik;
    private int voet;
    public final int ANGLES = 4;
    public static int count = 0;

    public SnowMan() {
        this(1, 2);
    }

    public SnowMan(int hoofd, int voet) {
        this(hoofd, 3, voet);
    }

    public SnowMan(int hoofd, int buik, int voet) {
        setHoofd(hoofd);
        setBuik(buik);
        setVoet(voet);
        count ++;
    }

    public void idk(int value){
        this.hoofd = 5;
    }

    public void setHoofd(int hoofd) {
        if (hoofd > 10) {
            this.hoofd = 10;
        } else {
            this.hoofd = hoofd;
        }
    }

    public void setBuik(int buik) {
        this.buik = buik;
    }

    public void setVoet(int voet) {
        this.voet = voet;
    }

    public int getHoofd() {
        return hoofd;
    }

    public int getBuik() {
        return buik;
    }

    public int getVoet() {
        return voet;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "SnowMan{" +
                "hoofd=" + hoofd +
                ", buik=" + buik +
                ", voet=" + voet +
                '}';
    }
}

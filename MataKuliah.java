
public class MataKuliah {
    private String kodeMK;
    private String namaMK;

    public MataKuliah() {}

    public MataKuliah(String kodeMK, String namaMK) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public void setKodeMK(String kodeMK) {
        this.kodeMK = kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public void infoMK() {
        System.out.println("[MATA KULIAH] " + kodeMK + " - " + namaMK);
    }
}


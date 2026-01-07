
public class Nilai implements Penilaian{
    private double tugas;
    private double uts;
    private double uas;

    public Nilai(double tugas, double uts, double uas) {
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    @Override
    public double hitungNilaiAkhir() {
        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }
}


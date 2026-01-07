
public class Mahasiswa extends User {
    private String prodi;
    private static int totalMahasiswa = 0;

    public Mahasiswa() {
        super();
        totalMahasiswa++;
    }

    public Mahasiswa(String id, String nama, String prodi) {
        super(id, nama);
        this.prodi = prodi;
        totalMahasiswa++;
    }

    public Mahasiswa(String id, String nama) {
        super(id, nama);
        this.prodi = "Belum ditentukan";
        totalMahasiswa++;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }

    @Override
    public void tampilInfo() {
        System.out.println("[MAHASISWA] ID: " + id +
                " | Nama: " + nama +
                " | Prodi: " + prodi);
    }
}


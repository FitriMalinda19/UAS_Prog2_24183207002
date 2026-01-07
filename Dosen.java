
public class Dosen extends User {
    private String pengampu;

    public Dosen() {
        super();
    }

    public Dosen(String id, String nama, String pengampu) {
        super(id, nama);
        this.pengampu = pengampu;
    }

    public String getPengampu() {
        return pengampu;
    }

    public void setPengampu(String pengampu) {
        this.pengampu = pengampu;
    }

    @Override
    public void tampilInfo() {
        System.out.println("[DOSEN] ID: " + id +
                " | Nama: " + nama +
                " | Pengampu: " + pengampu);
    }
}


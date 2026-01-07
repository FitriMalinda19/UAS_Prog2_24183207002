
import java.util.ArrayList;
import java.util.Scanner;


public class MainClass {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        ArrayList<User> dataUser = new ArrayList<>();
        ArrayList<MataKuliah> dataMK = new ArrayList<>();

        boolean jalan = true;

        while (jalan) {
            System.out.println("\n=== SISTEM AKADEMIK ===");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Input Data Dosen");
            System.out.println("3. Input Mata Kuliah");
            System.out.println("4. Input Nilai Mahasiswa");
            System.out.println("5. Tampilkan Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            String menu = input.nextLine();

            switch (menu) {

                case "1":
                    System.out.print("NIM   : ");
                    String nim = input.nextLine();
                    System.out.print("Nama  : ");
                    String namaMhs = input.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = input.nextLine();

                    User mhs = new Mahasiswa(nim, namaMhs, prodi);
                    dataUser.add(mhs);
                    System.out.println("Data mahasiswa berhasil ditambahkan");
                    break;

                case "2":
                    System.out.print("NIDN  : ");
                    String nidn = input.nextLine();
                    System.out.print("Nama  : ");
                    String namaDsn = input.nextLine();
                    System.out.print("Pengampu : ");
                    String pengampu = input.nextLine();

                    User dsn = new Dosen(nidn, namaDsn, pengampu);
                    dataUser.add(dsn);
                    System.out.println("Data dosen berhasil ditambahkan");
                    break;

                case "3":
                    System.out.print("Kode MK : ");
                    String kodeMK = input.nextLine();
                    System.out.print("Nama MK : ");
                    String namaMK = input.nextLine();

                    dataMK.add(new MataKuliah(kodeMK, namaMK));
                    System.out.println("Mata kuliah berhasil ditambahkan");
                    break;

                case "4":
                    System.out.print("Nilai Tugas : ");
                    double tgs = input.nextDouble();
                    System.out.print("Nilai UTS   : ");
                    double uts = input.nextDouble();
                    System.out.print("Nilai UAS   : ");
                    double uas = input.nextDouble();
                    input.nextLine(); // buang enter

                    Penilaian nilai = new Nilai(tgs, uts, uas);
                    System.out.println("Nilai Akhir: " + nilai.hitungNilaiAkhir());
                    break;

                case "5":
                    System.out.println("\n--- DATA USER ---");
                    for (User u : dataUser) {
                        u.tampilInfo(); // polymorphism
                    }

                    System.out.println("\n--- DATA MATA KULIAH ---");
                    for (MataKuliah mk : dataMK) {
                        mk.infoMK();
                    }

                    System.out.println("\nTotal Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
                    break;

                case "0":
                    jalan = false;
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }
        }

        System.out.println("Program selesai.");
    }
}

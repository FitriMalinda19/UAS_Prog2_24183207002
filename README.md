# UAS_Prog2_24183207002
Nama: Fitri Malinda
NIM: 24183207002
Kelas: PTI 3A
-User
Abstract class sebagai induk untuk Mahasiswa dan Dosen.
Menyimpan id dan nama (protected) serta memiliki method abstract tampilInfo().
-Mahasiswa
Turunan dari User untuk data mahasiswa.
Memiliki prodi, static totalMahasiswa, constructor overloading, dan override tampilInfo().
-Dosen
Turunan dari User untuk data dosen.
Memiliki pengampu dan override tampilInfo().
-MataKuliah
Class untuk menyimpan data mata kuliah (kodeMK, namaMK).
Menerapkan encapsulation dengan getter & setter.
-Penilaian
Interface yang mendefinisikan method hitungNilaiAkhir().
-Nilai
Implementasi interface Penilaian untuk menghitung nilai akhir mahasiswa.
-MainClass
Class utama yang menjalankan menu sistem akademik.
Menggunakan Scanner, ArrayList, dan polymorphism runtime (User sebagai reference).

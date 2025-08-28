public class Mahasiswa {
    String nama;
    String nim;
    int semester;

    Mahasiswa(String nama, String nim, int semester) {
        this.nama = nama;
        this.nim = nim;
        this.semester = semester;
    }

    void belajar() {
        System.out.println(nama + " sedang belajar.");
    }

    void ikutUjian() {
        System.out.println(nama + " sedang mengikuti ujian.");
    }

    void tampilkanProfil() {
        System.out.println("Nama      : " + nama);
        System.out.println("NIM       : " + nim);
        System.out.println("Semester  : " + semester);
    }
}

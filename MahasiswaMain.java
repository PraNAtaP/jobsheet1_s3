public class MahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Pranata Putrandana", "234176001", 3);
        Mahasiswa m2 = new Mahasiswa("Budi Santoso", "234176002", 4);
        Mahasiswa m3 = new Mahasiswa("Cici Rahmawati", "234176003", 2);
        Mahasiswa m4 = new Mahasiswa("Dedi Kurniawan", "234176004", 5);
        Mahasiswa m5 = new Mahasiswa("Eka Saputra", "234176005", 6);
        Mahasiswa m6 = new Mahasiswa("Fani Lestari", "234176006", 3);
        Mahasiswa m7 = new Mahasiswa("Gita Permata", "234176007", 4);
        Mahasiswa m8 = new Mahasiswa("Hadi Prasetyo", "234176008", 2);
        Mahasiswa m9 = new Mahasiswa("Intan Sari", "234176009", 5);
        Mahasiswa m10 = new Mahasiswa("Joko Susilo", "234176010", 6);

        m1.tampilkanProfil();
        m2.belajar();
        m3.ikutUjian();
    }
}

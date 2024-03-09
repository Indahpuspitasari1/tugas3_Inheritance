package inheritance;
//@author Indah Puspitasari_20220040095

public class Mahasiswa {
    String nim;
    String nama;
    int nilai;

    Mahasiswa(String nim, String nama, int nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }

    String getGrade() {
        if (nilai >= 80 && nilai <= 100) {
            return "A";
        } else if (nilai >= 70 && nilai <= 79) {
            return "B";
        } else if (nilai >= 60 && nilai <= 69) {
            return "C";
        } else if (nilai >= 50 && nilai <= 59) {
            return "D";
        } else if (nilai >= 0 && nilai < 50) {
            return "E";
        } else {
            return "Invalid";
        }
    }
}

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<datasiswa> data = new ArrayList<>();
        System.out.println("silahkan masukan input jumlah siswa");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        for (int j = 0; j < x; j++) {
            datasiswa siswa = new datasiswa();
            System.out.println("masukan nama siswa :");
            siswa.setnama(input.next());
            System.out.println("masukan umur siswa :");
            siswa.setumur(input.nextInt());
            System.out.println("masukan nim siswa :");
            siswa.setnim(input.nextInt());
            System.out.println("masukan semester  :");
            siswa.setsemester(input.nextInt());
            System.out.println("masukan jurusan siswa :");
            siswa.setjurusan(input.next());
            System.out.println("masukan nilai ujian akhir semester siswa :");
            siswa.setnilaiUjianAkhirSemester(input.nextInt());

            System.out.println("========================");

            data.add(siswa);
        }

        int no = 1;
        System.out.println("============== Daftar siswa ============");
        for (datasiswa dt : data) {
            System.out.println("Data SISWA :" + no);
            System.out.println("Nama Siswa:" + dt.getnama());
            System.out.println("Umur Siswa:" + dt.getumur());
            System.out.println("Nim Siswa :" + dt.getnim());
            System.out.println("Semester :" + dt.getsemester());
            System.out.println("Jurusan Siswa :" + dt.getjurusan());
            System.out.println("Nilai akhir semester :" + dt.getnilaiUjianAkhirSemester());

            if (dt.getnilaiUjianAkhirSemester() < 70) {
                System.out.println(dt.getnama() + " Dinyatakan tidak lulus");

            } else if (dt.getnilaiUjianAkhirSemester() == 70) {
                System.out.println(dt.getnama() + " Dinyatakan lulus");

            } else {
                System.out.println(dt.getnama() + " Dinyatakan lulus");

            }
            System.out.println("--------------------------");

            no++;
        }
        System.out.println("===========================");

    }
}
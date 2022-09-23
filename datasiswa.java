public class datasiswa {
   String nama;
   int umur;
   int nim;
   int semester;
   String jurusan;
   int nilaiUjian;

   public String getnama() {
      return nama;
   }

   public void setnama(String nama) {
      this.nama = nama;
   }

   public int getumur() {
      return umur;
   }

   public void setumur(int umur) {
      this.umur = umur;
   }

   public int getnim() {
      return nim;
   }

   public void setnim(int nim) {
      this.nim = nim;
   }

   public int getsemester() {
      return semester;
   }

   public void setsemester(int semester) {
      this.semester = semester;
   }

   public String getjurusan() {
      return jurusan;
   }

   public void setjurusan(String jurusan) {
      this.jurusan = jurusan;
   }

   public int getnilaiUjianAkhirSemester() {
      return nilaiUjian;
   }

   public void setnilaiUjianAkhirSemester(int nilaiUjian) {
      this.nilaiUjian = nilaiUjian;
   }
}
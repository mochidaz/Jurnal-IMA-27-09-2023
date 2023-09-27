public class Biodata {
    public static void main(String []args) {
        Biodata obj = new Biodata();
        obj.showBiodata("Rahman Hakim", "607062330006", "D3IF-47-04");
    }

    void showBiodata(String nama, String nim, String kelas) {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
    }
}
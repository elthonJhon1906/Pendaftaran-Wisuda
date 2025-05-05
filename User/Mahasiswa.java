package User;


/**
 * Write a description of class Mahasiswa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

/**
 * Write a description of class Mahasiswa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mahasiswa extends Users
{
    private String nama;
    private String NPM;
    private String programStudi;
    private String jurusan;
    private String fakultas;
    private String noHp;
    private String alamat;
    private double ipk;
    private int semesterLulus;
    
    public Mahasiswa(String nama, String NPM, 
    String programStudi, 
    String jurusan, 
    String fakultas, 
    String noHp, 
    String alamat, 
    double ipk, 
    int semesterLulus,
    String username,
    String password,
    Role role)
    {
    super(username, password, role);
    this.nama = nama;
    this.NPM = NPM;
    this. programStudi = programStudi;
    this.jurusan = jurusan;
    this.fakultas = fakultas;
    this.noHp = noHp;
    this.alamat = alamat;
    this.ipk = ipk;
    this.semesterLulus = semesterLulus;
    }
    
    public void displayDataMahasiswa(){
    System.out.println("Data Mahasiswa");
    System.out.println("Nama Mahasiswa : " + nama);
    System.out.println("NPM Mahasiswa : " + NPM);
    System.out.println("Program Studi : " + programStudi);
    System.out.println("Jurusan : " + jurusan);
    System.out.println("Fakultas : " + fakultas);
    System.out.println("Nomor Telepon : " + noHp);
    System.out.println("Alamat : " + alamat);
    System.out.println("IPK : " + ipk);
    System.out.println("Semester Lulus : " + semesterLulus);

    }
    
    
}

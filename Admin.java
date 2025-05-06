 


/**
 * Write a description of class Admin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Admin extends Users
{
    
    private String nama;
    private String nip;
    private String alamat;
    private String noHp;
    private String jabatan;
    private String email;
    
    public Admin(String nama, String nip, String alamat, String noHp, String jabatan, String email, String username, String password, Role role){
        super(nama, password, role);
        this.nama = nama;
        this.nip = nip;
        this.alamat = alamat;
        this.noHp = noHp;
        this.jabatan = jabatan;
        this.email = email;
    }
    
    public PendaftaranWisudaMahasiswa verifikasiPendaftaran(
        PendaftaranWisudaMahasiswa pendaftaran,
        StatusPendaftaran status
    ) {
        pendaftaran.verifikasiDokumen(this, status);
    
        return pendaftaran;
    }
}

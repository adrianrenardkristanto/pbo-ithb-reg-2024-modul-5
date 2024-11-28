package Controller;
import java.sql.Date;
import java.util.ArrayList;
import Model.Class.KTP_Model;
import Model.Enum.Agama;
import Model.Enum.Gender;
import Model.Enum.GolDar;
import Model.Enum.Kewarganegaraan;
import Model.Enum.Pekerjaan;
import Model.Enum.Perkawinan;

public class KTP_Controller {
    private KTP_Model ktp;

    public KTP_Model getKtp() {
        return ktp;
    }

    public void setKtp(KTP_Model ktp) {
        this.ktp = ktp;
    }
    
    public String getNIK(){
        return ktp.getNIK();
    }

    public String getNama(){
        return ktp.getNama();
    }

    public String getTempatLahir(){
        return ktp.getTempatLahir();
    }

    public Date getTglLahir() {
        return ktp.getTglLahir();
    }

    public Gender getJenis_kelamin() {
        return ktp.getJenis_kelamin();
    }

    public GolDar getGolonganDarah() {
        return ktp.getGolonganDarah();
    }

    public String getAlamat() {
        return ktp.getAlamat();
    }

    public String getRT() {
        return ktp.getRT();
    }

    public String getRW() {
        return ktp.getRW();
    }

    public String getKel() {
        return ktp.getKel();
    }

    public String getDesa() {
        return ktp.getDesa();
    }

    public String getKecamatan() {
        return ktp.getKecamatan();
    }

    public Perkawinan getStatus_perkawinan() {
        return ktp.getStatus_perkawinan();
    }

    public Agama getAgama() {
        return ktp.getAgama();
    }

    public ArrayList<Pekerjaan> getPekerjaan() {
        return ktp.getPekerjaan();
    }

    public Kewarganegaraan getKewarganegaraan() {
        return ktp.getKewarganegaraan();
    }
    
    public String getFotoPath() {
        return ktp.getFotoPath();
    }

    public String getTandaTanganPath() {
        return ktp.getTandaTanganPath();
    }

    public Date getBerlakuHingga() {
        return ktp.getBerlakuHingga();
    }

    public String getKotaPembuatanKTP() {
        return ktp.getKotaPembuatanKTP();
    }

    public Date getTglPembuatanKTP() {
        return ktp.getTglPembuatanKTP();
    }

    public String getTitle() {
        return ktp.getTitle();
    }

    public boolean setNIK(String NIK){
        if (NIK.length() == 16 && NIK.matches("\\d+")) {
            ktp.setNIK(NIK);
            return true;
        }
        return false;
    }

    public boolean setNama(String nama){
        if (nama != null && nama.isEmpty()) {
            ktp.setNama(nama);
            return true;
        }
        return false;
    }

    public boolean setTempatLahir(String tempat_lahir) {
        if (tempat_lahir != null && tempat_lahir.isEmpty()) {
            ktp.setNama(tempat_lahir);
            return true;
        }
        return false;
    }

    public boolean setTglLahir(Date tglLahir) {
        if (tglLahir!= null) {
            ktp.setTglLahir(tglLahir);
            return true;
        }
        return false;
    }
    
    public boolean setJenis_kelamin(Gender jenis_kelamin) {
        if (jenis_kelamin == null) {
            return false;
        }
        ktp.setJenis_kelamin(jenis_kelamin);
        return true;
    }

    public boolean setGolonganDarah(GolDar golonganDarah) {
        if (golonganDarah == null) {
            return false;
        }
        ktp.setGolonganDarah(golonganDarah);
        return true;
    }

    public boolean setAlamat(String alamat) {
        if (alamat != null && alamat.isEmpty()) {
            ktp.setAlamat(alamat);
            return true;
        }
        return false;
    }
    
    public boolean setRT(String rT) {
        if (rT != null && rT.isEmpty()) {
            ktp.setRT(rT);
            return true;
        }
        return false;
    }
    
    public boolean setRW(String rW) {
        if (rW != null && rW.isEmpty()) {
            ktp.setRW(rW);
            return true;
        }
        return false;
    }
    
    public boolean setKel(String kel) {
        if (kel != null && kel.isEmpty()) {
            ktp.setKel(kel);
            return true;
        }
        return false;
    }
    
    public boolean setDesa(String desa) {
        if (desa != null && desa.isEmpty()) {
            ktp.setDesa(desa);
            return true;
        }
        return false;
    }
    
    public boolean setKecamatan(String kecamatan) {
        if (kecamatan != null && kecamatan.isEmpty()) {
            ktp.setKecamatan(kecamatan);
            return true;
        }
        return false;
    }

    public boolean setAgama(Agama agama) {
        if (agama == null) {
            return false;
        }
        ktp.setAgama(agama);
        return true;
    }
    
    public boolean setStatus_perkawinan(Perkawinan status_perkawinan) {
        if (status_perkawinan == null) {
            return false;
        }
        ktp.setStatus_perkawinan(status_perkawinan);
        return true;
    }

    public void setPekerjaan(ArrayList<Pekerjaan> pekerjaan) {
        if (pekerjaan.contains(Pekerjaan.Pengangguran) && pekerjaan.size() > 1) {
            throw new IllegalArgumentException("Jika memilih 'Pengangguran', tidak boleh memilih pekerjaan lain");
        }
        ktp.setPekerjaan(new ArrayList<>(pekerjaan));
    }

    public boolean setKewarganegaraan(Kewarganegaraan kewarganegaraan) {
        if (kewarganegaraan != Kewarganegaraan.WNI && kewarganegaraan != Kewarganegaraan.WNA) {
            return false;
        }
        ktp.setKewarganegaraan(kewarganegaraan);
        return true;
    }
    
    public boolean setFotoPath(String fotoPath) {
        if (fotoPath != null && fotoPath.isEmpty()) {
            ktp.setFotoPath(fotoPath);
            return true;
        }
        return false;
    }
    
    public boolean setTandaTanganPath(String tandaTanganPath) {
        if (tandaTanganPath != null && tandaTanganPath.isEmpty()) {
            ktp.setTandaTanganPath(tandaTanganPath);
            return true;
        }
        return false;
    }
   
    public boolean setBerlakuHingga(Date berlakuHingga) {
        if (berlakuHingga!= null) {
            ktp.setBerlakuHingga(berlakuHingga);
            return true;
        }
        return false;
    }
    
    public boolean setKotaPembuatanKTP(String kotaPembuatanKTP) {
        if (kotaPembuatanKTP != null && kotaPembuatanKTP.isEmpty()) {
            ktp.setKotaPembuatanKTP(kotaPembuatanKTP);
            return true;
        }
        return false;
    }
    
    public boolean setTglPembuatanKTP(Date tglPembuatanKTP) {
        if (tglPembuatanKTP!= null) {
            ktp.setTglPembuatanKTP(tglPembuatanKTP);
            return true;
        }
        return false;
    }
    
    public boolean setTitle(String title) {
        if (title != null && title.isEmpty()) {
            ktp.setTitle(title);
            return true;
        }
        return false;
    }
}   

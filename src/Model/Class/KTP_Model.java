package Model.Class;

import java.sql.Date;
import java.util.ArrayList;

import Model.Enum.Gender;
import Model.Enum.GolDar;
import Model.Enum.Kewarganegaraan;
import Model.Enum.Pekerjaan;
import Model.Enum.Agama;
import Model.Enum.Perkawinan;

public class KTP_Model{
    private String NIK, nama, tempat_lahir, alamat, RT, RW, kel, desa, kecamatan;
    private String kotaPembuatanKTP, title = "Republik Harapan Bangsa", fotoPath, tandaTanganPath;
    private Gender jenis_kelamin;
    private GolDar golonganDarah; 
    private Kewarganegaraan kewarganegaraan;
    private ArrayList<Pekerjaan> pekerjaan;
    private Agama agama;
    private Perkawinan status_perkawinan;
    private Date tglPembuatanKTP, berlakuHingga, tglLahir;
    public KTP_Model(String nIK, String nama, String tempat_lahir, String alamat, String rT, String rW, String kel, String desa,
    String kecamatan, ArrayList<Pekerjaan> pekerjaan, Agama agama, Perkawinan status_perkawinan, String kotaPembuatanKTP,
            String title, String fotoPath, String tandaTanganPath, Gender jenis_kelamin, GolDar golonganDarah,
            Kewarganegaraan kewarganegaraan, Date tglPembuatanKTP, Date berlakuHingga, Date tglLahir) {
        NIK = nIK;
        this.nama = nama;
        this.tempat_lahir = tempat_lahir;
        this.alamat = alamat;
        RT = rT;
        RW = rW;
        this.kel = kel;
        this.desa = desa;
        this.kecamatan = kecamatan;
        this.pekerjaan = pekerjaan;
        this.agama = agama;
        this.status_perkawinan = status_perkawinan;
        this.kotaPembuatanKTP = kotaPembuatanKTP;
        this.title = title;
        this.fotoPath = fotoPath;
        this.tandaTanganPath = tandaTanganPath;
        this.jenis_kelamin = jenis_kelamin;
        this.golonganDarah = golonganDarah;
        this.kewarganegaraan = kewarganegaraan;
        this.tglPembuatanKTP = tglPembuatanKTP;
        this.berlakuHingga = berlakuHingga;
        this.tglLahir = tglLahir;
    }
    public String getNIK() {
        return NIK;
    }
    public void setNIK(String nIK) {
        NIK = nIK;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getTempatLahir() {
        return tempat_lahir;
    }
    public void setTempatLahir(String tempat_lahir) {
        this.tempat_lahir = tempat_lahir;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getRT() {
        return RT;
    }
    public void setRT(String rT) {
        RT = rT;
    }
    public String getRW() {
        return RW;
    }
    public void setRW(String rW) {
        RW = rW;
    }
    public String getKel() {
        return kel;
    }
    public void setKel(String kel) {
        this.kel = kel;
    }
    public String getDesa() {
        return desa;
    }
    public void setDesa(String desa) {
        this.desa = desa;
    }
    public String getKecamatan() {
        return kecamatan;
    }
    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }
    public ArrayList<Pekerjaan> getPekerjaan() {
        return pekerjaan;
    }
    public void setPekerjaan(ArrayList<Pekerjaan> pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
    public Agama getAgama() {
        return agama;
    }
    public void setAgama(Agama agama) {
        this.agama = agama;
    }
    public Perkawinan getStatus_perkawinan() {
        return status_perkawinan;
    }
    public void setStatus_perkawinan(Perkawinan status_perkawinan) {
        this.status_perkawinan = status_perkawinan;
    }
    public String getKotaPembuatanKTP() {
        return kotaPembuatanKTP;
    }
    public void setKotaPembuatanKTP(String kotaPembuatanKTP) {
        this.kotaPembuatanKTP = kotaPembuatanKTP;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getFotoPath() {
        return fotoPath;
    }
    public void setFotoPath(String fotoPath) {
        this.fotoPath = fotoPath;
    }
    public String getTandaTanganPath() {
        return tandaTanganPath;
    }
    public void setTandaTanganPath(String tandaTanganPath) {
        this.tandaTanganPath = tandaTanganPath;
    }
    public Gender getJenis_kelamin() {
        return jenis_kelamin;
    }
    public void setJenis_kelamin(Gender jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }
    public GolDar getGolonganDarah() {
        return golonganDarah;
    }
    public void setGolonganDarah(GolDar golonganDarah) {
        this.golonganDarah = golonganDarah;
    }
    public Kewarganegaraan getKewarganegaraan() {
        return kewarganegaraan;
    }
    public void setKewarganegaraan(Kewarganegaraan kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }
    public Date getTglPembuatanKTP() {
        return tglPembuatanKTP;
    }
    public void setTglPembuatanKTP(Date tglPembuatanKTP) {
        this.tglPembuatanKTP = tglPembuatanKTP;
    }
    public Date getBerlakuHingga() {
        return berlakuHingga;
    }
    public void setBerlakuHingga(Date berlakuHingga) {
        this.berlakuHingga = berlakuHingga;
    }
    public Date getTglLahir() {
        return tglLahir;
    }
    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }
}

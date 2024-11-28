package Views;

import Controller.KTP_Controller;
import Model.Class.KTP_Model;
import Model.Enum.*;

import javax.swing.*;
import java.awt.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KTPFrame_Result extends JFrame {
    public KTPFrame_Result(KTP_Controller controller) {
        setTitle("Hasil KTP");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(15, 2, 10, 10));

        KTP_Model ktp = controller.getKtp();

        add(new JLabel("Republik Harapan Bangsa"));
        add(new JLabel("NIK: " + ktp.getNIK()));
        add(new JLabel("Nama: " + ktp.getNama()));
        add(new JLabel("Tempat/Tanggal Lahir: " + ktp.getTempatLahir() + ", " + formatDate(ktp.getTglLahir())));
        add(new JLabel("Alamat: " + ktp.getAlamat() + ", RT " + ktp.getRT() + "/RW " + ktp.getRW()));
        add(new JLabel("Kelurahan/Desa: " + ktp.getKel() + "/" + ktp.getDesa()));
        add(new JLabel("Kecamatan: " + ktp.getKecamatan()));
        add(new JLabel("Berlaku Hingga: " + formatDate(ktp.getBerlakuHingga())));
        add(new JLabel("Kota Pembuatan: " + ktp.getKotaPembuatanKTP()));
        add(new JLabel("Jenis Kelamin: " + ktp.getJenis_kelamin().toString()));
        add(new JLabel("Golongan Darah: " + ktp.getGolonganDarah().toString()));
        add(new JLabel("Agama: " + ktp.getAgama().toString()));
        add(new JLabel("Status Perkawinan: " + ktp.getStatus_perkawinan().toString()));
        add(new JLabel("Pekerjaan: " + getPekerjaanString(ktp.getPekerjaan())));
        add(new JLabel("Kewarganegaraan: " + ktp.getKewarganegaraan().toString()));

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private String formatDate(Date date) {
        LocalDate localDate = date.toLocalDate();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        return localDate.format(formatter);
    }

    private String getPekerjaanString(java.util.ArrayList<Pekerjaan> pekerjaan) {
        StringBuilder sb = new StringBuilder();
        for (Pekerjaan p : pekerjaan) {
            sb.append(p.toString()).append(", ");
        }
        return sb.toString().trim().replaceAll(", $", "");
    }
}

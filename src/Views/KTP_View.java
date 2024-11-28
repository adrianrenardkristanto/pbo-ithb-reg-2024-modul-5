package Views;

import Controller.KTP_Controller;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import java.io.File;
import java.sql.Date;
import java.util.ArrayList; 
import java.util.Enumeration;
import org.jdatepicker.impl.*;
import java.util.Properties;

public class KTP_View extends JFrame {
    private KTP_Controller controller;
    private JTextField nikField, namaField, tempatLahirField, alamatField, rtField, rwField, kelField, desaField, kecamatanField, kotaField, wnaField, berlakuHinggaField;
    private JRadioButton priaButton, wanitaButton, wniButton, wnaButton;
    private ButtonGroup genderGroup, kewarganegaraanGroup, golDarahGroup;
    private JComboBox<String> agamaComboBox, statusComboBox;
    private JCheckBox[] pekerjaanCheckBoxes;
    private JCheckBox pengangguranCheckBox;
    private JButton submitButton;
    private File foto, ttd;
    private JDatePickerImpl datePicker;

    public KTP_View(KTP_Controller controller) {
        this.controller = controller;

        JFrame ktpFrame = new JFrame("Form Pembuatan KTP");
        ktpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ktpFrame.setSize(600, 700);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(21, 2));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); 
        gbc.fill = GridBagConstraints.HORIZONTAL; 

        gbc.gridx = 0; gbc.gridy = 0; 
        mainPanel.add(new JLabel("NIK:"), gbc);
        gbc.gridx = 1; 
        nikField = new JTextField();
        mainPanel.add(nikField, gbc);

        gbc.gridx = 0; gbc.gridy++;
        mainPanel.add(new JLabel("Nama:"), gbc);
        gbc.gridx = 1;
        namaField = new JTextField();
        mainPanel.add(namaField, gbc);

        gbc.gridx = 0; gbc.gridy++;
        mainPanel.add(new JLabel("Tempat Lahir:"), gbc);
        gbc.gridx = 1;
        tempatLahirField = new JTextField();
        mainPanel.add(tempatLahirField, gbc);

        gbc.gridx = 0; gbc.gridy++;
        mainPanel.add(new JLabel("Tanggal Lahir:"), gbc);
        gbc.gridx = 1;
        datePicker = createDatePicker();
        mainPanel.add(datePicker, gbc);

        gbc.gridx = 0; gbc.gridy++;
        mainPanel.add(new JLabel("Jenis Kelamin:"), gbc);
        gbc.gridx = 1;
        priaButton = new JRadioButton("Pria");
        wanitaButton = new JRadioButton("Wanita");
        genderGroup = new ButtonGroup();
        genderGroup.add(priaButton);
        genderGroup.add(wanitaButton);
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(priaButton);
        genderPanel.add(wanitaButton);
        mainPanel.add(genderPanel, gbc);

        gbc.gridx = 0; gbc.gridy++;
        mainPanel.add(new JLabel("Golongan Darah:"), gbc);
        gbc.gridx = 1;
        golDarahGroup = new ButtonGroup();
        JPanel golDarahPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        for (String gol : new String[]{"A", "B", "O", "AB"}) {
            JRadioButton golButton = new JRadioButton(gol);
            golDarahGroup.add(golButton);
            golDarahPanel.add(golButton);
        }
        mainPanel.add(golDarahPanel, gbc);

        gbc.gridx = 0; gbc.gridy++;
        mainPanel.add(new JLabel("Alamat:"), gbc);
        gbc.gridx = 1;
        alamatField = new JTextField();
        mainPanel.add(alamatField, gbc);

        gbc.gridx = 0; gbc.gridy++;
        mainPanel.add(new JLabel("RT:"), gbc);
        gbc.gridx = 1;
        rtField = new JTextField(5);
        mainPanel.add(rtField, gbc);

        gbc.gridx = 0; gbc.gridy++;
        mainPanel.add(new JLabel("RW:"), gbc);
        gbc.gridx = 1;
        rwField = new JTextField(5);
        mainPanel.add(rwField, gbc);

        gbc.gridx = 0; gbc.gridy++;
        mainPanel.add(new JLabel("Kelurahan:"), gbc);
        gbc.gridx = 1;
        kelField = new JTextField();
        mainPanel.add(kelField, gbc);

        gbc.gridx = 0; gbc.gridy++;
        mainPanel.add(new JLabel("Desa:"), gbc);
        gbc.gridx = 1;
        desaField = new JTextField();
        mainPanel.add(desaField, gbc);

        gbc.gridx = 0; gbc.gridy++;
        mainPanel.add(new JLabel("Kecamatan:"), gbc);
        gbc.gridx = 1;
        kecamatanField = new JTextField();
        mainPanel.add(kecamatanField, gbc);

        gbc.gridx = 0; gbc.gridy++;
        mainPanel.add(new JLabel("Agama:"), gbc);
        gbc.gridx = 1;
        agamaComboBox = new JComboBox<>(new String[]{"Islam", "Kristen", "Katolik", "Hindu", "Buddha", "Konghucu"});
        mainPanel.add(agamaComboBox, gbc);

        gbc.gridx = 0; gbc.gridy++;
        mainPanel.add(new JLabel("Status Perkawinan:"), gbc);
        gbc.gridx = 1;
        statusComboBox = new JComboBox<>(new String[]{"Belum Menikah", "Menikah", "Janda/Duda"});
        mainPanel.add(statusComboBox, gbc);

        gbc.gridx = 0; gbc.gridy++;
        mainPanel.add(new JLabel("Kewarganegaraan:"), gbc);
        gbc.gridx = 1;
        wniButton = new JRadioButton("WNI");
        wnaButton = new JRadioButton("WNA");
        kewarganegaraanGroup = new ButtonGroup();
        kewarganegaraanGroup.add(wniButton);
        kewarganegaraanGroup.add(wnaButton);
        JPanel kewarganegaraanPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        kewarganegaraanPanel.add(wniButton);
        kewarganegaraanPanel.add(wnaButton);
        mainPanel.add(kewarganegaraanPanel, gbc);

        gbc.gridx = 0; gbc.gridy++;
        mainPanel.add(new JLabel("Negara WNA:"), gbc);
        gbc.gridx = 1;
        wnaField = new JTextField();
        wnaField.setVisible(false);
        mainPanel.add(wnaField, gbc);

        wnaButton.addActionListener(e -> {
            wnaField.setVisible(true); 
        });

        wniButton.addActionListener(e -> {
            wnaField.setVisible(false); 
        });

        gbc.gridx = 0; gbc.gridy++;
        mainPanel.add(new JLabel("Foto:"), gbc);
        gbc.gridx = 1;
        JButton pilihFotoButton = new JButton("Pilih Foto");
        pilihFotoButton.addActionListener(e -> {
            JFileChooser fotoChooser = new JFileChooser();
            fotoChooser.setFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png"));
            
            int returnValue = fotoChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                foto = fotoChooser.getSelectedFile();
            }
        });
        mainPanel.add(pilihFotoButton);

        gbc.gridx = 0; gbc.gridy++;
        mainPanel.add(new JLabel("Tanda Tangan:"), gbc);
        gbc.gridx = 1;
        JButton pilihTtdButton = new JButton("Pilih Tanda Tangan");
        pilihTtdButton.addActionListener(e -> {
            JFileChooser ttdChooser = new JFileChooser();
            ttdChooser.setFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png"));
            int returnValue = ttdChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                ttd = ttdChooser.getSelectedFile();
            }
            mainPanel.add(ttdChooser);
        });
        mainPanel.add(pilihTtdButton);

        gbc.gridx = 0; gbc.gridy++;
        gbc.gridwidth = 2;
        submitButton = new JButton("Insert Data");
        mainPanel.add(submitButton, gbc);

        JScrollPane scrollPane = new JScrollPane(mainPanel);
        ktpFrame.add(scrollPane);

        ktpFrame.setLocationRelativeTo(null);
        ktpFrame.setVisible(true);
    }

    private JDatePickerImpl createDatePicker() {
        Properties properties = new Properties();
        properties.put("text.today", "Hari Ini");
        properties.put("text.month", "Bulan");
        properties.put("text.year", "Tahun");

        UtilDateModel model = new UtilDateModel();
        JDatePanelImpl datePanel = new JDatePanelImpl(model, properties);
        return new JDatePickerImpl(datePanel, new DateComponentFormatter());
    }

    public KTP_Controller getController() {
        return controller;
    }

    private JComboBox<Integer> createDateComboBox(int start, int end) {
        JComboBox<Integer> comboBox = new JComboBox<>();
        for (int i = start; i <= end; i++) {
            comboBox.addItem(i);
        }
        return comboBox;
    }

    private void togglePekerjaanCheckboxes() {
        boolean disabled = pengangguranCheckBox.isSelected();
        for (JCheckBox checkBox : pekerjaanCheckBoxes) {
            if (checkBox != pengangguranCheckBox) {
                checkBox.setEnabled(!disabled);
            }
        }
    }
    private String getSelectedGolDarah() {
    for (Enumeration<AbstractButton> buttons = golDarahGroup.getElements(); buttons.hasMoreElements();) {
        AbstractButton button = buttons.nextElement();
        if (button.isSelected()) {
            return button.getText(); 
        }
    }
        return null;
    }

    private String getSelectedPekerjaan() {
        ArrayList<String> selectedPekerjaan = new ArrayList<>();
        for (JCheckBox checkBox : pekerjaanCheckBoxes) {
            if (checkBox.isSelected()) {
                selectedPekerjaan.add(checkBox.getText());
            }
        }
        return String.join(", ", selectedPekerjaan); 
    }

    private void handleSubmit() {
        String nik = nikField.getText().trim();
        String nama = namaField.getText().trim();
        String tempatLahir = tempatLahirField.getText().trim();
        Date tanggalLahir = (Date)(datePicker.getModel().getValue());
        String alamat = alamatField.getText().trim();
        String rt = rtField.getText().trim();
        String rw = rwField.getText().trim();
        String kelurahan = kelField.getText().trim();
        String kecamatan = kecamatanField.getText().trim();
        String berlakuHingga = berlakuHinggaField.getText().trim();
        String kotaPembuatan = kotaField.getText().trim();
        String jenisKelamin = priaButton.isSelected() ? "Pria" : "Wanita";
        String golDarah = getSelectedGolDarah();
        String agama = agamaComboBox.getSelectedItem().toString();
        String statusPerkawinan = statusComboBox.getSelectedItem().toString();
        String kewarganegaraan = wniButton.isSelected() ? "WNI" : "WNA (" + wnaField.getText().trim() + ")";
        String pekerjaan = getSelectedPekerjaan();
        if (nik.isEmpty() || nama.isEmpty() || tempatLahir.isEmpty() || tanggalLahir == null|| alamat.isEmpty()
            || rt.isEmpty() || rw.isEmpty() || kelurahan.isEmpty() || kecamatan.isEmpty() || berlakuHingga.isEmpty()
            || kotaPembuatan.isEmpty() || pekerjaan.isEmpty() || jenisKelamin.isEmpty() || golDarah.isEmpty() || agama.isEmpty() || statusPerkawinan.isEmpty() || jenisKelamin.isEmpty() || statusPerkawinan.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Semua data harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Data berhasil disimpan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);

        this.dispose();

        new KTPFrame_Result(controller);
    }
}

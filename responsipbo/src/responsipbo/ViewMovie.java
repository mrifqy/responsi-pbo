package responsipbo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ViewMovie extends JFrame{
    JLabel lJudul = new JLabel("Judul");
    JLabel lAlur = new JLabel("Alur Cerita");
    JLabel lPenokohan = new JLabel("Penokohan");
    JLabel lAkting = new JLabel("Akting");

    public JTextField tfJudul = new JTextField();
    public JTextField tfAlur = new JTextField();
    public JTextField tfPenokohan = new JTextField();
    public JTextField tfAkting=  new JTextField();

    public JButton btnTambah = new JButton("Tambah");
    public JButton btnUpdate = new JButton("Update");
    public JButton btnDelete = new JButton("Delete");
    public JButton btnReset = new JButton("Clear");

    public JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    public Object namaKolom[] = {"Judul", "Alur Cerita", "Penokohan", "Akting", "Rating"};

    public ViewMovie() {
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);

        setTitle("Movie Data");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        setSize(700,500);
        setLocationRelativeTo(null);

        add(scrollPane);
        scrollPane.setBounds(20, 20, 450, 400);

        add(lJudul);
        lJudul.setBounds(500, 30, 90, 20);
        add(tfJudul);
        tfJudul.setBounds(500, 50, 150, 20);

        add(lAlur);
        lAlur.setBounds(500, 80, 90, 20);
        add(tfAlur);
        tfAlur.setBounds(500, 100, 150, 20);

        add(lPenokohan);
        lPenokohan.setBounds(500, 130, 90, 20);
        add(tfPenokohan);
        tfPenokohan.setBounds(500, 150, 150, 20);

        add(lAkting);
        lAkting.setBounds(500, 180, 90, 20);
        add(tfAkting);
        tfAkting.setBounds(500, 200, 150, 20);

        add(btnTambah);
        btnTambah.setBounds(500, 250, 90, 20);

        add(btnUpdate);
        btnUpdate.setBounds(500, 280, 90, 20);

        add(btnDelete);
        btnDelete.setBounds(500, 310, 90, 20);

        add(btnReset);
        btnReset.setBounds(500, 340, 90, 20);
    }

    public String getJudul(){
        return tfJudul.getText();
    }

    public String getAlur(){
        return tfAlur.getText();
    }

    public String getPenokohan(){
        return tfPenokohan.getText();
    }

    public String getAkting(){
        return tfAkting.getText();
    }

}

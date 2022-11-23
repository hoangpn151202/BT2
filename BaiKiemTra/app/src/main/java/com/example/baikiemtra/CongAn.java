package com.example.baikiemtra;

public class CongAn {
    int anh;
    String ten, capBac, noiCongTac, quocGia, soSao;

    public CongAn(int anh, String ten, String capBac, String noiCongTac, String quocGia, String soSao) {
        this.anh = anh;
        this.ten = ten;
        this.capBac = capBac;
        this.noiCongTac = noiCongTac;
        this.quocGia = quocGia;
        this.soSao = soSao;
    }

    public CongAn() {
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCapBac() {
        return capBac;
    }

    public void setCapBac(String capBac) {
        this.capBac = capBac;
    }

    public String getNoiCongTac() {
        return noiCongTac;
    }

    public void setNoiCongTac(String noiCongTac) {
        this.noiCongTac = noiCongTac;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public String getSoSao() {
        return soSao;
    }

    public void setSoSao(String soSao) {
        this.soSao = soSao;
    }
}

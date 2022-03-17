/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.bai2;

/**
 *
 * @author JosCongQuy
 */
public class sanPham {

    String ten;
    String donvi;
    String nhaCungCap;
    double ma;
    double gia;

    public sanPham() {
    }

    public sanPham(String ten, String donvi, String nhaCungCap, double ma, double gia) {
        this.ten = ten;
        this.donvi = donvi;
        this.nhaCungCap = nhaCungCap;
        this.ma = ma;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public double getMa() {
        return ma;
    }

    public void setMa(double ma) {
        this.ma = ma;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
}

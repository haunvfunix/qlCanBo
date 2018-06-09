package qlThongTin;

import java.util.Scanner;

public class NhanVien extends CanBo implements TienLuong{
	private final String NhanVien = "Nhan Vien";
	private final String TruongPhong = "Truong Phong";
	private final String PhoPhong = "Pho Phong";
	protected String ChucVu;
	protected String PhongBan;
	protected int SoNgayCong;

	public String getChucVu() {
		return ChucVu;
	}

	public void setChucVu(String chucVu) {
		ChucVu = chucVu;
	}

	public String getPhongBan() {
		return PhongBan;
	}

	public void setPhongBan(String phongBan) {
		PhongBan = phongBan;
	}

	public int getSoNgayCong() {
		return SoNgayCong;
	}

	public void setSoNgayCong(int soNgayCong) {
		SoNgayCong = soNgayCong;
	}

	@Override
	public int TienLuong() {
		int luong = HeSoLuong * 730 +SoNgayCong*30+tinhphucap();
		return luong;
	}

	@Override
	public int tinhphucap() {
		int PhuCap = 0;
		if(this.ChucVu.equalsIgnoreCase(this.PhoPhong)){
			PhuCap = 2000;
		}else  if(this.ChucVu.equalsIgnoreCase(this.TruongPhong)){
			PhuCap=1000;
		}else if(this.ChucVu.equalsIgnoreCase(this.NhanVien)){
			PhuCap=500;
		}
		return PhuCap;
	}
	
}

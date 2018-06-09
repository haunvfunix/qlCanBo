package qlThongTin;

public class GiangVien extends CanBo implements TienLuong {
	private final String CuNhan = "Cu Nhan";
	private final String ThacSi = "Thac Si";
	private final String TienSi = "Tien Si";
	protected String TrinhDo;
	protected int SoTietDay;
	protected String Khoa;
	
	
	public String getKhoa() {
		return Khoa;
	}
	public void setKhoa(String khoa) {
		Khoa = khoa;
	}
	public String getTrinhDo() {
		return TrinhDo;
	}
	public void setTrinhDo(String trinhDo) {
		TrinhDo = trinhDo;
	}
	public int getSoTietDay() {
		return SoTietDay;
	}
	public void setSoTietDay(int soTietDay) {
		SoTietDay = soTietDay;
	}
	@Override
	public int TienLuong() {
		int luong = HeSoLuong * 730 +SoTietDay*45+tinhphucap();
		return luong;
	}
	@Override
	public int tinhphucap() {
		// TODO Auto-generated method stub
		int PhuCap = 0;
		if(this.TrinhDo.equalsIgnoreCase(this.CuNhan)){
			PhuCap = 300;
		}else if(this.TrinhDo.equalsIgnoreCase(this.ThacSi)){
			PhuCap = 500;
		}else if(this.TrinhDo.equalsIgnoreCase(this.TienSi)){
			PhuCap = 1000;
		}
		return PhuCap;
	}
	
}

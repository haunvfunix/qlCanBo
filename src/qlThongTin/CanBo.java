package qlThongTin;

 public abstract class CanBo {
	protected String HoTen;
	protected int HeSoLuong;

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

    public int getHeSoLuong() {
		return HeSoLuong;
	}

	public void setHeSoLuong(int heSoLuong) {
		HeSoLuong = heSoLuong;
	}
	 public abstract int tinhphucap();
}

package qlThongTin;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestBaiLam {

	@Test
	public void testTienLuongPhoPhong() {
		NhanVien testLuong = new NhanVien();
	    testLuong.HeSoLuong = 1;
	    testLuong.SoNgayCong =1;
	    testLuong.ChucVu = "Pho Phong";
		int result = testLuong.TienLuong();
		int expect = 1 * 730 +1*30+2000;
		assertEquals(expect,result);
	}

	
	@Test
	public void testTienLuongNhanVien() {
		NhanVien testLuong = new NhanVien();
	    testLuong.HeSoLuong = 11;
	    testLuong.SoNgayCong =12;
	    testLuong.ChucVu = "Nhan Vien";
		int result = testLuong.TienLuong();
		int expect = 11 * 730 +12*30+500;
		assertEquals(expect,result);
	}
	

	@Test
	public void testTienLuongCuNhan() {
		GiangVien testLuong = new GiangVien();
	    testLuong.HeSoLuong = 11;
	    testLuong.SoTietDay =12;
	    testLuong.TrinhDo = "Cu Nhan";
		int result = testLuong.TienLuong();
		int expect = 11 * 730 +12*45+300;
		assertEquals(expect,result);
	}

	@Test
	public void testTienLuongThacSi() {
		GiangVien testLuong = new GiangVien();
	    testLuong.HeSoLuong = 11;
	    testLuong.SoTietDay =12;
	    testLuong.TrinhDo = "Thac Si";
		int result = testLuong.TienLuong();
		int expect = 11 * 730 +12*45+500;
		assertEquals(expect,result);
	}
	@Test
	public void testTienLuongTienSi() {
		NhanVien testLuong = new NhanVien();
	    testLuong.HeSoLuong = 11;
	    testLuong.SoNgayCong =12;
	    testLuong.ChucVu = "Truong Phong";
		int result = testLuong.TienLuong();
		int expect = 11 * 730 +12*30+1000;
		assertEquals(expect,result);
	}

	@Test
	public void testTienLuongTruongPhong() {
		NhanVien testLuong = new NhanVien();
	    testLuong.HeSoLuong = 11;
	    testLuong.SoNgayCong =12;
	    testLuong.ChucVu = "Truong Phong";
		int result = testLuong.TienLuong();
		int expect = 11 * 730 +12*30+1000;
		assertEquals(expect,result);
	}
	
	@Test
	public void testTimKiem() {
		qlCanBo ql = new qlCanBo();
		NhanVien nv = new NhanVien();
		nv.HoTen = "hung";
		nv.PhongBan = "cntt";
		ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
		dsnv.add(nv);
		String hotencantim = "hung";
		String phong = "cntt";
		NhanVien ketqua = ql.timNhanVien(dsnv, hotencantim, phong);
		
		assertEquals(ketqua.HoTen, hotencantim);
		assertEquals(ketqua.PhongBan, phong);
	}
	
}

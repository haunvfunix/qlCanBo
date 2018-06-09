package qlThongTin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.io.*;

public class qlCanBo {
	static ArrayList<GiangVien> dsgv = new ArrayList<GiangVien>();
	ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();

	public GiangVien nhapGiangVien() {
		Scanner sc = new Scanner(System.in);
		GiangVien gv = new GiangVien();
		System.out.println("Nhap ho ten");
		gv.HoTen = sc.nextLine();
		System.out.println("Nhap khoa");
		gv.Khoa = sc.nextLine();
		System.out.println("Trinh Do");
		gv.TrinhDo = sc.nextLine();
		System.out.println("So Tiet Day");

		gv.SoTietDay = nhapsoluong();

		System.out.println("He So Luong");
		gv.HeSoLuong = nhapsoluong();

		return gv;
	}

	public NhanVien nhapNhanVien() {
		Scanner sc = new Scanner(System.in);
		NhanVien nv = new NhanVien();
		System.out.println("Nhap ho ten");
		nv.HoTen = sc.nextLine();

		System.out.println("Nhap phong ban");
		nv.PhongBan = sc.nextLine();
		System.out.println("So Ngay Cong");
		nv.SoNgayCong = nhapsoluong();
		System.out.println("Chuc Vu");
		nv.ChucVu = sc.nextLine();
		System.out.println("He So Luong");
		nv.HeSoLuong = nhapsoluong();
		return nv;
	}

	public int nhapsoluong() {
		Scanner sc = new Scanner(System.in);
		try {
			return sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Nhap lai");
			return nhapsoluong();
		}
	}

	public void taoDSGV() {
		System.out.println("Nhap thong tin Giang Vien");
		GiangVien gv = nhapGiangVien();
		dsgv.add(gv);
	}

	public void taoDSNV() {
		System.out.println("Nhap thong tin Nhan Vien");
		NhanVien nv = nhapNhanVien();
		dsnv.add(nv);
	}

	public void timNV() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten nhan vien can tim");
		String timten = sc.nextLine();
		System.out.println("Nhap phong nhan vien can tim");
		String timphong = sc.nextLine();
		NhanVien nv = timNhanVien(dsnv, timten, timphong);
		if (nv != null) {
			System.out.println("Thong tin nhan vien can tim");
			System.out.printf("%10s%6s%16s%5s%10s\n", nv.HoTen, nv.PhongBan, nv.ChucVu, nv.HeSoLuong, nv.TienLuong());
		} else {
			System.out.println("Khong ton tai");
		}

	}

	

	public NhanVien timNhanVien(ArrayList<NhanVien> dsnv, String ten, String phong) {
		
		for (int i = 0; i < dsnv.size(); i++) {
			if (dsnv.get(i).HoTen.equalsIgnoreCase(ten) && dsnv.get(i).PhongBan.equalsIgnoreCase(phong)) {
				return dsnv.get(i);
			}

		}
		return null;

	}

	public void SapXep() {
		Collections.sort(dsgv, new Comparator<GiangVien>() {
			@Override
			public int compare(GiangVien gv1, GiangVien gv2) {
				return (gv1.HoTen.compareTo(gv2.HoTen));
			}
		});

		for (int i = 0; i < dsgv.size(); i++) {
			System.out.printf("%20s%8s%16s%10s%10s%15s\n", dsgv.get(i).HoTen, dsgv.get(i).Khoa, dsgv.get(i).TrinhDo,
					dsgv.get(i).HeSoLuong, dsgv.get(i).SoTietDay, dsgv.get(i).TienLuong());

		}
	}
	
	public void inGiangVien(ArrayList<GiangVien> dsgv){
	
		  
		try {
			  File file = new File("TTGV.txt");
			  if(!file.exists()){
			  file.createNewFile();
			  }
			PrintWriter pw = new PrintWriter(file);
			String title = String.format("%1$20s %2$22s %3$20s %4$18s %5$20s %6$20s","HoTen","Khoa","TrinhDo","HSL","STD","TienLuong");
			pw.println(title);
			for(int i = 0;i < dsgv.size();i++){
				String result = String.format("%1$20s %2$15s %3$22s %4$20s %5$22s %6$20s", dsgv.get(i).HoTen,dsgv.get(i).Khoa,dsgv.get(i).TrinhDo,dsgv.get(i).HeSoLuong,dsgv.get(i).SoTietDay,dsgv.get(i).TienLuong());
				pw.println(i+1+". "+result);
			}
			pw.println();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	  
    }
	

public static void menu() {
		System.out.println(" __________________________________MENU_______________________________________");
        System.out.println("| 1. Nhap thong tin cho cac giang vien trong truong...........................| ");
        System.out.println("| 2. Nhap thong tin cho cac nhan vien hanh chinh trong truong.................| ");
        System.out.println("| 3. Tim kiem nhan vien theo ten va phong ban va in ra man hinh...............| ");
        System.out.println("| 4. Xuat ra danh sach toan bo giang vien va sap xep theo thu tu theo ten ....| ");
        System.out.println("| 5. Thoat chuong trinh ......................................................| ");
        System.out.println("|_____________________________________________________________________________|");
	}


	public static void main(String[] args) {
		menu();
		int a = 0;
		qlCanBo ql = new qlCanBo();
		while (a != 5) {

			Scanner sc = new Scanner(System.in);
			int choicegame = 0;

			try {
				choicegame = Integer.parseInt(sc.nextLine());

			} catch (NumberFormatException e) {
				System.out.println("Nhap sai nhap lai");

			} finally {
				if (choicegame == 1) {
					ql.taoDSGV();
					ql.inGiangVien(dsgv);
					menu();
				} else if (choicegame == 2) {
					ql.taoDSNV();
					menu();
				} else if (choicegame == 3) {
					ql.timNV();
					menu();
				} else if (choicegame == 4) {
					System.out.println("Danh sach sap xep theo ten");

					System.out.printf("%14s%14s%16s%10s%10s%15s\n", "Ho Ten", "Khoa", "Trinh Do", "HSL", "STD",
							"Tien Luong");
					ql.SapXep();
					menu();
				}
			}

		}

	}
}
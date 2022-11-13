package btl2;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		quanliSach quanliSach = new quanliSach();
		while (true) {
			System.out.println("------THU VIEN------");
			System.out.println("nhap 1: de nhap tai lieu");
			System.out.println("nhap 2: de tim tai lieu theo the loai ");
			System.out.println("nhap 3: de hien thi thong tin tai lieu da nhap");
			System.out.println("nhap 4: de xoa tai lieu theo ID");
			System.out.println("nhap 5:de thoat khoi chuong trinh:");
			String line = sc.nextLine();
			switch (line) {
			case "1": {
				System.out.println("nhap a: de nhap Book");
				System.out.println("Enter b: de nhap Newspaper");
				System.out.println("Enter c: de nhap Magazine");
				String type = sc.nextLine();
				switch (type) {
				case "a": {
					System.out.print("nhap ID sach: ");
					String id = sc.nextLine();
					System.out.print("nhap ten sach");
					String nxb = sc.nextLine();
					System.out.print("nhap so luong sach: ");
					int number = sc.nextInt();
					System.out.print("nhap tac gia: ");
					sc.nextLine();
					String tacGia = sc.nextLine();
					System.out.print("nhap so trang: ");
					int soTrang = sc.nextInt();
					taiLieu book = new Book(id, nxb, number, tacGia, soTrang);
					quanliSach.themSach(book);
					System.out.println(book.toString());
					sc.nextLine();
					break;
				}

				case "b": {
					System.out.print("nhap ID : ");
					String id = sc.nextLine();
					System.out.print("nhap ten :");
					String nxb = sc.nextLine();
					System.out.print("nhap so luong : ");
					int number = sc.nextInt();
					System.out.print("nhap ngay phat hanh : ");
					int dayIssue = sc.nextInt();
					taiLieu newspaper = new newspaper(id, nxb, number, dayIssue);
					quanliSach.themSach(newspaper);
					System.out.println(newspaper.toString());
					sc.nextLine();
					break;
				}
				case "c": {
					System.out.print("nhap ID: ");
					String id = sc.nextLine();
					System.out.print("nhap ten :");
					String nxb = sc.nextLine();
					System.out.print("nhap so luong: ");
					int number = sc.nextInt();
					System.out.print("nhap ngay phat hanh : ");
					int issueNumber = sc.nextInt();
					System.out.print("nhap thang phat hanh : ");
					int issueMonth = sc.nextInt();
					taiLieu magazine = new magazine(id, nxb, number, issueNumber, issueMonth);
					quanliSach.themSach(magazine);
					System.out.println(magazine.toString());
					sc.nextLine();
					break;
				}
				default:
					break;
				}
				break;
			}

			case "2": {
				System.out.println("nhap a de tim sach");
				System.out.println("nhap b de tim newspaper");
				System.out.println("nhap c de tim magazine");
				String luachon = sc.nextLine();
				switch (luachon) {
				case "a": {

					quanliSach.timkiemSach();
					break;
				}
				case "b": {
					quanliSach.timkiemnewspaper();
					break;
				}

				case "c": {
					quanliSach.timkiemmagazine();
					break;
				}
				default:
					System.out.println("Invalid");
					break;
				}
			break;
			}
			case "3": { 
				quanliSach.hienThi();
			break;
			}
			case "4": {
				System.out.print("nhap ID can xoa: ");
				String id = sc.nextLine();
				System.out.println(quanliSach.xoaSach(id) ? "xoa thanh cong!" : "khong tim thay ID sach can xoa");

			}
				break;
			case "5": {
				return;
			}
			default:
				System.out.println("Invalid");
				continue;
			}

		}
	}

}

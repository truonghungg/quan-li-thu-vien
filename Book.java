package btl2;

public class Book extends taiLieu {
	private String tacGia;
	private int soTrang;

	public Book(String id, String name, int number, String tacGia, int soTrang) {
		super(id, name , number);
		this.tacGia = tacGia;
		this.soTrang = soTrang;
	}

	public String getTacGia() {
		return tacGia;
	}

	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	@Override
	public String toString() {
		return "Book [tacGia:" + tacGia + ", soTrang:" + soTrang + ", ID:" + getId() + ", ten:" + getName()
				+ ", soluong:" + getNumber() + "]";
	}

}

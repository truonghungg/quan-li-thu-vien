package btl2;

import java.util.ArrayList;
import java.util.List;

public class quanliSach {
	List<taiLieu> tailieu;

	public quanliSach() {
		this.tailieu = new ArrayList<taiLieu>();
	}

	public void themSach(taiLieu Sach) {
		this.tailieu.add(Sach);
	}

	public boolean xoaSach(String id) {
		taiLieu tl = this.tailieu.stream().filter(tailieu -> tailieu.getId().equals(id)).findFirst().orElse(null);
		if (tl == null) {
			return false;
		} else {
			return this.tailieu.remove(tl);
		}
	}

	public void hienThi() {
		this.tailieu.forEach(tailieu -> System.out.println(tailieu.toString()));
	}

	public void timkiemSach() {
		this.tailieu.stream().filter(tl -> tl instanceof Book).forEach(tl -> System.out.println(tl.toString()));
	}

	public void timkiemnewspaper() {
		this.tailieu.stream().filter(tl -> tl instanceof newspaper).forEach(tl -> System.out.println(tl.toString()));
	}

	public void timkiemmagazine() {
		this.tailieu.stream().filter(tl -> tl instanceof magazine).forEach(tl -> System.out.println(tl.toString()));
	}

}

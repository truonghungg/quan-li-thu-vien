package btl2;

public class newspaper extends taiLieu {
	private int dayIssue;

	public newspaper(String id, String name, int number, int dayIssue) {
		super(id, name,number);
		this.dayIssue = dayIssue;
	}

	public int getDayIssue() {
		return dayIssue;
	}

	public void setDayIssue(int dayIssue) {
		this.dayIssue = dayIssue;
	}

	@Override
	public String toString() {
		return "newspaper(ngay phat hanh:" + dayIssue + ", ID:" + getId() + ", ten:" + getName()
				+ ", so luong:" + getNumber() + ")";
	}

}

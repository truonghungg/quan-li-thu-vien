package btl2;

public class magazine extends taiLieu {
	private int issueNumber;
	private int monthIssue;

	public magazine(String id, String name, int number, int issueNumber, int monthIssue) {
		super(id, name, number);
		this.issueNumber = issueNumber;
		this.monthIssue = monthIssue;
	}

	public int getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(int issueNumber) {
		this.issueNumber = issueNumber;
	}

	public int getMonthIssue() {
		return monthIssue;
	}

	public void setMonthIssue(int monthIssue) {
		this.monthIssue = monthIssue;
	}

	@Override
	public String toString() {
		return "magazine: (ngay" + issueNumber + "/thang" + monthIssue + ", ID:" + getId()
				+ ", ten:" + getName() + ", so luong:" + getNumber() + ")";
	}

}

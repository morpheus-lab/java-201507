package videoshop;

public class Item {
	
	protected int type;	// 1. ���� ������
						// 2. DVD
						// 3. ����
	protected String title;	// ����
	protected int genre;	// �帣
	protected int fee;	// �뿩��
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getGenre() {
		return genre;
	}
	public void setGenre(int genre) {
		this.genre = genre;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
}

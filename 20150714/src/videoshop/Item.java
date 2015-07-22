package videoshop;

public class Item {
	
	protected int type;	// 1. 비디오 테이프
						// 2. DVD
						// 3. 도서
	protected String title;	// 제목
	protected int genre;	// 장르
	protected int fee;	// 대여료
	
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

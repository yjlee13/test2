package kr.co.yjlee.board.domain;

import java.sql.Timestamp;

public class BoardDTO {

	private int idx;
	private String subject;
	private int uidx;
	private String content;
	private Timestamp indate;
	private Timestamp moddate;
	private String useYN;
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getUidx() {
		return uidx;
	}
	public void setUidx(int uidx) {
		this.uidx = uidx;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getIndate() {
		return indate;
	}
	public void setIndate(Timestamp indate) {
		this.indate = indate;
	}
	public Timestamp getModdate() {
		return moddate;
	}
	public void setModdate(Timestamp moddate) {
		this.moddate = moddate;
	}
	public String getUseYN() {
		return useYN;
	}
	public void setUseYN(String useYN) {
		this.useYN = useYN;
	}
	@Override
	public String toString() {
		return "BoardDTO [idx=" + idx + ", subject=" + subject + ", uidx=" + uidx + ", content=" + content + ", indate="
				+ indate + ", moddate=" + moddate + ", useYN=" + useYN + "]";
	}
	
}

package kr.co.yjlee.login.domain;

import java.sql.Timestamp;

public class UserDTO {
	private int idx;
	private String name;
	private String id;
	private String password;
	private Timestamp indate;
	private Timestamp moddate;
	private int oidx;
	private int cidx;
	private String useYN;
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public int getOidx() {
		return oidx;
	}
	public void setOidx(int oidx) {
		this.oidx = oidx;
	}
	public int getCidx() {
		return cidx;
	}
	public void setCidx(int cidx) {
		this.cidx = cidx;
	}
	public String getUseYN() {
		return useYN;
	}
	public void setUseYN(String useYN) {
		this.useYN = useYN;
	}
	@Override
	public String toString() {
		return "UserDTO [idx=" + idx + ", name=" + name + ", id=" + id + ", password=" + password + ", indate=" + indate
				+ ", moddate=" + moddate + ", oidx=" + oidx + ", cidx=" + cidx + ", useYN=" + useYN + "]";
	}
}

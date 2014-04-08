package com.sddtc.model;

/**
 * @author sddtc 服务器
 */
public class Server {

	/**
	 * 主键
	 */
	private int id;

	/**
	 * nginx服务访问地址
	 */
	private String uri;

	/**
	 * 服务类型
	 */
	private int type;

	/**
	 * 有效性
	 */
	private int valid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getValid() {
		return valid;
	}

	public void setValid(int valid) {
		this.valid = valid;
	}

	@Override
	public String toString() {
		return "Server [id=" + id + ", uri=" + uri + ", type=" + type
				+ ", valid=" + valid + "]";
	}

}

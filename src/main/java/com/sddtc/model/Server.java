package com.sddtc.model;

import com.google.common.base.Objects;

/**
 * @author sddtc 服务器
 */
public class Server {
	/** 主键 */
	private int id;
	/** nginx服务访问地址 */
	private String uri;
	/** 服务类型 */
	private int type;
	/** 有效性 */
	private int valid;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the uri
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * @param uri
	 *            the uri to set
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the valid
	 */
	public int getValid() {
		return valid;
	}

	/**
	 * @param valid
	 *            the valid to set
	 */
	public void setValid(int valid) {
		this.valid = valid;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper("服务器").add("服务器类型", this.type)
				.add("访问地址", this.uri).toString();
	}

}

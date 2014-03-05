package com.sddtc.model;

import java.util.Date;

/**
 * 颜文字
 * @author sddtc
 *
 */
public class Faceword {
    /**主键*/
    private String id;
    /**内容*/
    private String text;
    /**创建时间*/
    private Date create_time;
    /**类别*/
    private String type;

    /**
     * 
     * @return {@link #id id} 
     **/
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id {@link #id id} 
     **/
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return {@link #text text} 
     **/
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text {@link #text text} 
     **/
    public void setText(String text) {
        this.text = text;
    }

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}

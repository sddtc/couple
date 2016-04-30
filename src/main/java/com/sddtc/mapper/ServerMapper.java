package com.sddtc.mapper;

import com.sddtc.model.Server;

/**
 * @author sddtc 服务器相关
 */
public interface ServerMapper {

	/**
	 * 获取服务器信息
	 * 
	 * @param type
	 *            服务器类型
	 * @param valid
	 *            有效与否
	 * @return
	 */
	public Server get(int type, int valid);
}

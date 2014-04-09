package com.sddtc.service.server;

import com.sddtc.model.Server;

/**
 * @author sddtc
 *
 */
public interface ServerService {
	
	/**
	 * 获取服务配置信息
	 * @param type 服务类型
	 * @param valid 是否有效
	 * @return
	 */
	public Server get(int type, int valid);
}

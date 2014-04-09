package com.sddtc.service.server.impl;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.sddtc.mapper.ServerMapper;
import com.sddtc.model.Server;
import com.sddtc.service.server.ServerService;

/**
 * @author sddtc
 * 
 */
@Service
public class ServerServiceImpl implements ServerService {

	@Resource
	private ServerMapper serverMapper;

	@Cacheable(value = "serverCache", key = "#type")
	public Server get(int type, int valid) {

		return serverMapper.get(type, valid);
	}

}

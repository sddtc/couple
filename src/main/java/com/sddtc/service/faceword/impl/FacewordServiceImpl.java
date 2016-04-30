package com.sddtc.service.faceword.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.sddtc.mapper.FacewordMapper;
import com.sddtc.model.Faceword;
import com.sddtc.service.faceword.FacewordService;

/**
 * @author sddtc
 *
 */
@Service
public class FacewordServiceImpl implements FacewordService{
	private Logger logger = LoggerFactory.getLogger(FacewordServiceImpl.class);
	
	@Resource
	private FacewordMapper facewordMapper; 

	@Override
	public List<Faceword> query() {
		return facewordMapper.query();
	}

	@Override
	public void add(Faceword faceword) {
		faceword.setCreate_time(new Date());
		facewordMapper.add(faceword);
		logger.info("添加了一个颜文字表情{}", faceword.getText());
	}
}

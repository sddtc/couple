package com.sddtc.utils;

import java.io.File;

/**
 * @author sddtc
 * 
 */
public class PathUtil {
	/**
	 * @param userId
	 * @return
	 */
	public static String getImageOfUserIconPath(int userId) {
		return File.separator + PathConstant.IMAGE_FILE_NAME + File.separator + userId
				+ File.separator + PathConstant.IMAGE_USER_ICON_FILE_NAME + File.separator;
	}
}

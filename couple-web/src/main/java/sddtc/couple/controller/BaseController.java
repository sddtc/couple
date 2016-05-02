package sddtc.couple.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by sddtc on 16/5/2.
 */
public class BaseController {
    protected Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
}

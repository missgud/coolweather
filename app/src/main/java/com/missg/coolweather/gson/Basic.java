package com.missg.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by missg on 2018-05-30.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}

package com.missg.coolweather.gson;

import com.missg.coolweather.db.City;

/**
 * Created by missg on 2018-05-30.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}


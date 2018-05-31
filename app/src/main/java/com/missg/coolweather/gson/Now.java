package com.missg.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by missg on 2018-05-30.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}

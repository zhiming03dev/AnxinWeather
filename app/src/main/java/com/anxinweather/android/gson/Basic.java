package com.anxinweather.android.gson;

/**
 * Created by James on 2017/4/17.
 */
import com.google.gson.annotations.SerializedName;
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}

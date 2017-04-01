package com.coolweather.android.gson;

/**
 * Created by wz649 on 2017/4/1.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}

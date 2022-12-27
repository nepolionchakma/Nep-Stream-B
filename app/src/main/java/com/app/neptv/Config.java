package com.app.neptv;

import com.app.neptv.utils.Constant;

public class Config {

    //your Server Key obtained from admin panel
    public static final String SERVER_KEY = "WVVoU01HTkViM1pNTWpWc1kwYzVjMkZYT1hWTWJtZDRUVU0xZEdWRE9XbGtWMUpyWVVkR1psbFlRbmRpUjJ4cVdWaFNjR0l5TlVwYVJqbHFZakl3ZFZsWVFuZE1iVFZzWTBoU01nPT0";

    //your Rest API Key obtained the admin panel
    public static final String REST_API_KEY = "cda11bx8aITlKsXCpNB7yVLnOdEGqg342ZFrQzJRetkSoUMi9wbuddha";

    //available channel view type : CHANNEL_LIST_DEFAULT, CHANNEL_GRID_2_COLUMN or CHANNEL_GRID_3_COLUMN
    public static final int CHANNEL_VIEW_TYPE = Constant.CATEGORY_GRID_3_COLUMN;

    //available channel view type : CATEGORY_LIST_DEFAULT, CATEGORY_GRID_2_COLUMN or CATEGORY_GRID_3_COLUMN
    public static final int CATEGORY_VIEW_TYPE = Constant.CATEGORY_GRID_3_COLUMN;

    //available player screen orientation : PLAYER_MODE_PORTRAIT or PLAYER_MODE_LANDSCAPE
    public static final int DEFAULT_PLAYER_SCREEN_ORIENTATION = Constant.PLAYER_MODE_PORTRAIT;

    //display category name in the channel list
    public static final boolean ENABLE_CHANNEL_LIST_CATEGORY_NAME = true;

    //press back twice to exit from player screen
    public static final boolean PRESS_BACK_TWICE_TO_CLOSE_PLAYER = false;

    //if you use RTL Language e.g : Arabic Language or other, set true
    public static final boolean ENABLE_RTL_MODE = false;

    //load more pagination
    public static final int LOAD_MORE = 15;

    //looping mode
    public static final boolean ENABLE_LOOPING_MODE = false;

    //GDPR
    public static final boolean LEGACY_GDPR = true;

    public static final int DELAY_SPLASH = 100;

}
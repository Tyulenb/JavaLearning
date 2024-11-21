package lesson12.Singleton;

import java.util.HashMap;
import java.util.Map;

public class AppSettings {
    private static AppSettings appSettings;
    private Map<String, String> settings = new HashMap<>();

    private AppSettings(){
        settings.put("Theme", "SystemDefault");
        settings.put("Language","SystemDefault");
        settings.put("FilePath","System Default");
    }

    public static AppSettings getAppSettings(){
        if(appSettings == null){
            appSettings = new AppSettings();
        }
        return appSettings;
    }

    public void setSettings(String key, String value){
        settings.put(key, value);
    }
    public String getSettings(String key){
        return settings.get(key);
    }
}

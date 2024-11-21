package lesson12.Singleton;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        AppSettings settings = AppSettings.getAppSettings();
        settings.setSettings("Theme", "New Default");
        System.out.println(settings.getSettings("Theme"));
        Thread th = new Thread(){
          @Override
          public void run(){
              AppSettings settings1 = AppSettings.getAppSettings();
              System.out.println("th "+settings1.getSettings("Theme"));
              settings1.setSettings("Language", "Russian");
          }
        };
        Thread th1 = new Thread(){
            @Override
            public void run(){
                AppSettings settings2 = AppSettings.getAppSettings();
                System.out.println("th1 "+settings2.getSettings("Language"));
            }
        };
        th.start();
        th1.start();

        th.join();
        th1.join();

        System.out.println("main "+settings.getSettings("Language"));
    }


}

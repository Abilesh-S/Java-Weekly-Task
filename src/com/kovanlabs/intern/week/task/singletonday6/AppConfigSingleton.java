package com.kovanlabs.intern.week.task.singletonday6;

class AppConfig{
        private static AppConfig instance;
    private AppConfig(){
    }
    public static AppConfig getInstance(){
        if(instance == null){
            instance = new AppConfig();
            System.out.println("Object Created and Called");
        }
        return instance;
    }

}
class AppConfigSingleton{
    public static void main(String[] args) {
        AppConfig instance1 = AppConfig.getInstance();
        AppConfig instance2 = AppConfig.getInstance();
        System.out.println(instance1==instance2);
    }
}
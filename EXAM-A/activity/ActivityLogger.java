package activity;

import java.util.ArrayList;


public class ActivityLogger {
  
  private static ActivityLogger instance;
  private ArrayList<String> logs = new ArrayList<>();

  private ActivityLogger() {
    
  }

  public static ActivityLogger getInstance() {
    if (instance == null) {
      instance = new ActivityLogger();
    }
    return instance;
  }

  public void logActivity(String message) {
    logs.add(message);
  }

  public ArrayList<String> getActivityLog() {
    return logs;
  }

}

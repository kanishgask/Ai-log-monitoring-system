import java.util.ArrayList;
import java.util.List;

class Log {
    String service;
    String level;
    String message;

    Log(String service, String level, String message) {
        this.service = service;
        this.level = level;
        this.message = message;
    }
}

public class LogProcessor {

    private List<Log> logs = new ArrayList<>();

    public void addLog(String service, String level, String message) {
        Log log = new Log(service, level, message);
        logs.add(log);

        if (level.equals("ERROR")) {
            triggerAlert(log);
        }
    }

    private void triggerAlert(Log log) {
        System.out.println("🚨 ALERT: " + log.message);
    }

    public static void main(String[] args) {
        LogProcessor processor = new LogProcessor();

        processor.addLog("auth-service", "INFO", "User logged in");
        processor.addLog("payment-service", "ERROR", "Payment failed");
    }
}

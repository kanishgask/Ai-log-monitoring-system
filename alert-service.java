import java.util.ArrayList;
import java.util.List;

class Alert {
    String message;
    String severity;

    Alert(String message, String severity) {
        this.message = message;
        this.severity = severity;
    }
}

public class AlertService {

    private List<Alert> alerts = new ArrayList<>();

    // Trigger alert
    public void createAlert(String message, String severity) {
        Alert alert = new Alert(message, severity);
        alerts.add(alert);

        notifyUser(alert);
    }

    // Simulate notification (email/SMS)
    private void notifyUser(Alert alert) {
        System.out.println("🚨 ALERT [" + alert.severity + "]: " + alert.message);
    }

    // View alerts
    public void showAlerts() {
        for (Alert a : alerts) {
            System.out.println(a.severity + " - " + a.message);
        }
    }

    public static void main(String[] args) {
        AlertService service = new AlertService();

        service.createAlert("High CPU Usage", "HIGH");
        service.createAlert("Disk Space Low", "MEDIUM");

        service.showAlerts();
    }
}

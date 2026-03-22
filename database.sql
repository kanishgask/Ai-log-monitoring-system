CREATE TABLE Logs (
    log_id INT PRIMARY KEY,
    service_name VARCHAR(100),
    log_level VARCHAR(20),
    message TEXT,
    timestamp TIMESTAMP
);

CREATE TABLE Alerts (
    alert_id INT PRIMARY KEY,
    log_id INT,
    alert_message TEXT,
    created_at TIMESTAMP,
    FOREIGN KEY (log_id) REFERENCES Logs(log_id)
);

# API Design

## Add Log
POST /log

{
  "service_name": "auth-service",
  "log_level": "ERROR",
  "message": "Login failed"
}

## Get Logs
GET /logs

## Get Alerts
GET /alerts

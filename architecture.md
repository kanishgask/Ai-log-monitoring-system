# System Architecture

## Components
- API Gateway
- Log Ingestion Service
- Processing Service
- Alert Service
- Queue (Kafka)
- Database

## Flow
App → Log API → Queue → Processor → DB → Alert Service

## Key Design
- Asynchronous processing
- Scalable ingestion
- Real-time alerting

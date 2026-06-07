# Sentinel

AI-Powered Security Auditing Platform

## Overview

Sentinel is a security auditing platform that analyzes software repositories for potential vulnerabilities, exposed secrets, insecure configurations, and unsafe coding practices.

The platform combines automated security analysis with AI-generated explanations to help developers understand security risks and implement effective remediation strategies.

## Features

- Repository security scanning
- Vulnerability detection
- Secret exposure detection
- Security risk scoring
- AI-powered vulnerability explanations
- Developer-friendly remediation recommendations
- User authentication and account management
- Scan history tracking

## Tech Stack

### Backend
- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- PostgreSQL
- Maven

### AI
- OpenAI API
- OpenAI Java SDK

### Frontend (Planned)
- React
- TypeScript

## Architecture

```text
GitHub Repository
        ↓
   Scan Engine
        ↓
 Security Findings
        ↓
 Risk Assessment
        ↓
 OpenAI Analysis
        ↓
 Security Report
```

## Planned Security Checks

### Secret Detection
- API Keys
- Database Credentials
- JWT Secrets
- Private Keys
- Environment Variables

### Code Analysis
- SQL Injection Risks
- Hardcoded Credentials
- Unsafe Authentication Patterns
- Insecure Configurations

### Dependency Analysis
- Vulnerable Dependencies
- Outdated Libraries
- Known CVEs

## Getting Started

### Clone Repository

```bash
git clone https://github.com/YOUR_USERNAME/sentinel.git
cd sentinel
```

### Configure Environment Variables

```bash
OPENAI_API_KEY=your_api_key
DB_USER=postgres
DB_PASSWORD=your_password
```

### Run Application

```bash
mvn spring-boot:run
```

## Project Goals

- Automate security auditing for modern applications
- Improve developer awareness of security vulnerabilities
- Provide actionable remediation guidance
- Combine traditional security analysis with AI-powered insights

## Current Development Roadmap

- [x] Spring Boot Project Setup
- [x] PostgreSQL Integration
- [x] User Authentication
- [x] OpenAI SDK Integration
- [ ] Security Finding Generation
- [ ] Risk Scoring Engine
- [ ] Repository Scanner
- [ ] Dependency Analysis
- [ ] Secret Detection
- [ ] React Frontend
- [ ] GitHub Repository Integration

## Author

Tyler Carrasco
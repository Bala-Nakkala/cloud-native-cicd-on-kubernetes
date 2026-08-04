#  Cloud Native CI/CD on Kubernetes

## Project Overview

This project demonstrates a complete cloud-native CI/CD platform built on Kubernetes.

It covers:

- Continuous Integration using Jenkins
- Dynamic Kubernetes Agent Pods
- Rootless Docker image builds using Kaniko
- GitOps deployment using Argo CD
- Monitoring using Prometheus & Grafana
- Centralized logging using Fluent Bit & OpenSearch
- Application deployment using Helm
- Spring Boot microservice running on Kubernetes

This project is designed as a real-world DevOps implementation to simulate an enterprise production environment.

---

# Why This Project Exists

Traditional CI/CD platforms often suffer from:

- Static Jenkins agents consuming resources
- Manual deployments
- No centralized monitoring
- No centralized logging
- Difficult rollback process

This project solves those problems by adopting Cloud Native technologies.

Benefits

✅ Dynamic Scaling

✅ GitOps Deployment

✅ Secure Image Builds

✅ Centralized Monitoring

✅ Centralized Logging

✅ Automated CI/CD

---

# Architecture

GitHub

↓

Jenkins Controller

↓

Dynamic Kubernetes Agent Pod

↓

Kaniko Build

↓

DockerHub

↓

Argo CD

↓

Kubernetes Cluster

↓

Spring Boot Application

↓

Prometheus

↓

Grafana

↓

Fluent Bit

↓

OpenSearch

↓

OpenSearch Dashboards

---

# Technologies Used

| Tool | Purpose |
|------|---------|
| Spring Boot | Java Application |
| Docker | Containerization |
| Kubernetes | Container Orchestration |
| Jenkins | Continuous Integration |
| Kubernetes Plugin | Dynamic Agent Pods |
| Kaniko | Rootless Docker Builds |
| DockerHub | Image Registry |
| Helm | Kubernetes Package Manager |
| Argo CD | GitOps Deployment |
| Prometheus | Metrics Collection |
| Grafana | Visualization |
| Fluent Bit | Log Collector |
| OpenSearch | Log Storage |
| OpenSearch Dashboards | Log Visualization |

---

# Tool Explanation

## Jenkins

Purpose

Automates Build, Test and Deployment.

Used In Project

- Jenkins Controller
- Dynamic Agent Pods
- Jenkinsfile
- Pipeline Stages

Advantages

- Automation
- Scalable
- Plugin Ecosystem

Interview

What is Jenkins?

Difference between Controller and Agent?

---

## Kubernetes

Purpose

Runs containers reliably.

Used In Project

- Deployment
- Service
- Ingress
- Namespace
- Pods

Advantages

- Self Healing
- Scaling
- High Availability

Interview

What is Pod?

Difference between Deployment and ReplicaSet?

---

## Kaniko

Purpose

Build Docker images without Docker daemon.

Used Because

Avoids mounting docker.sock.

Advantages

- Secure
- Rootless
- Kubernetes Native

Interview

Why Kaniko instead of Docker?

---

## Helm

Purpose

Deploy Kubernetes applications.

Used For

- Spring Boot
- Jenkins
- Monitoring
- Logging

Interview

What is Chart?

What is values.yaml?

---

## Argo CD

Purpose

GitOps Continuous Delivery.

Advantages

- Self Heal
- Sync
- Rollback

Interview

What is GitOps?

---

## Prometheus

Purpose

Collect metrics.

Metrics Collected

- CPU
- Memory
- JVM
- Pod Metrics

Interview

What is scraping?

---

## Grafana

Purpose

Visualize metrics.

Dashboards

- JVM
- Kubernetes
- Nodes
- Pods

Interview

Difference between Grafana and Prometheus?

---

## Fluent Bit

Purpose

Collect container logs.

Pipeline

Container Logs

↓

Fluent Bit

↓

OpenSearch

Interview

Difference between Fluent Bit and Fluentd?

---

## OpenSearch

Purpose

Store logs.

Advantages

- Fast Search
- Indexing
- Analytics

Interview

What is an Index?

---

# Project Components

Spring Boot

Docker

Kubernetes

Jenkins

Kaniko

DockerHub

Helm

Argo CD

Prometheus

Grafana

Fluent Bit

OpenSearch

---

# CI/CD Flow

GitHub

↓

Jenkins

↓

Agent Pod

↓

Kaniko

↓

DockerHub

↓

Argo CD

↓

Kubernetes

↓

Spring Boot

---

# Monitoring Flow

Spring Boot

↓

Micrometer

↓

Prometheus

↓

Grafana

---

# Logging Flow

Spring Boot

↓

Container Logs

↓

Fluent Bit

↓

OpenSearch

↓

OpenSearch Dashboards

---

# Important Kubernetes Objects

Deployment

Service

Ingress

Namespace

ConfigMap

Secret

Persistent Volume

ServiceMonitor

---

# Pipeline Stages

Checkout

↓

Build

↓

Unit Test

↓

SonarQube

↓

Kaniko Build

↓

DockerHub Push

↓

Argo CD Sync

↓

Deployment

---

# Frequently Used Commands

```bash
kubectl get pods -A

kubectl logs

kubectl describe pod

helm install

helm upgrade

kubectl port-forward

argocd app sync
```

---

# Interview Revision

### Jenkins

- What is Jenkins?

- What is Dynamic Agent?

### Kubernetes

- What is Deployment?

- What is Service?

### Helm

- What is Chart?

### Argo CD

- What is GitOps?

### Prometheus

- What is scraping?

### Grafana

- What is Dashboard?

### Fluent Bit

- Why Fluent Bit?

### OpenSearch

- What is an Index?

---

# Learning Outcome

✔ Cloud Native CI/CD

✔ Dynamic Jenkins Agents

✔ GitOps

✔ Monitoring

✔ Logging

✔ Kubernetes

✔ Helm

✔ Docker

✔ Production Ready Architecture
#################################################################

                    GitHub
                       │
                 Webhook Trigger
                       │
                       ▼
             Jenkins Controller
             (Always Running)
                       │
        Kubernetes Plugin Requests
                       │
                       ▼
                Kubernetes API
                       │
       ---------------------------------
       │              │               │
       ▼              ▼               ▼
   Agent Pod      Agent Pod       Agent Pod
     Build 1        Build 2         Build 3
       │              │               │
   Maven          Maven          Maven
   Kaniko         Kaniko         Kaniko
       │              │               │
       ▼              ▼               ▼
 DockerHub/ECR   DockerHub/ECR   DockerHub/ECR

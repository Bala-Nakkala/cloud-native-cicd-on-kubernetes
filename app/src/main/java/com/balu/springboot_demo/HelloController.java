package com.balu.springboot_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @GetMapping(value = "/hello", produces = "text/html")
    public String hello() {

        return """
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>DevOps Engineer - Project Showcase</title>

            <style>
                body{
                    background:#0d1117;
                    color:white;
                    font-family:Segoe UI,Arial,sans-serif;
                    margin:40px;
                }

                .container{
                    max-width:900px;
                    margin:auto;
                }

                h1{
                    color:#ff3b3b;
                    border-bottom:2px solid #ff3b3b;
                    padding-bottom:10px;
                }

                h2{
                    color:#58a6ff;
                    margin-top:30px;
                }

                p{
                    line-height:1.8;
                    color:#d6d6d6;
                    font-size:16px;
                }

                ul{
                    line-height:2;
                    font-size:17px;
                }

                li{
                    margin-bottom:10px;
                }

                .project-card{
                    background:#161b22;
                    border:1px solid #30363d;
                    border-radius:10px;
                    padding:25px;
                    margin-top:25px;
                }

                .badge{
                    background:#238636;
                    color:white;
                    padding:5px 12px;
                    border-radius:15px;
                    font-size:14px;
                    font-weight:bold;
                    display:inline-block;
                    margin-bottom:15px;
                }

                .quote{
                    margin-top:40px;
                    padding:20px;
                    background:#161b22;
                    border-left:5px solid #ff3b3b;
                    font-style:italic;
                    color:#58a6ff;
                }

                a{
                    display:inline-block;
                    margin-top:30px;
                    background:#ff3b3b;
                    color:white;
                    text-decoration:none;
                    padding:12px 25px;
                    border-radius:8px;
                    font-weight:bold;
                }

                a:hover{
                    background:#e03232;
                }
            </style>
        </head>

        <body>

        <div class="container">

            <h1>🚀 DevOps Engineer</h1>

            <p>
                A DevOps Engineer bridges the gap between Software Development and IT Operations by automating application delivery, infrastructure provisioning, monitoring, and production deployment.
            </p>

            <!-- Highlighted Project Showcase Section -->
            <div class="project-card">
                <span class="badge">🎯 LAB HIGHLIGHT & ACHIEVEMENTS</span>
                <h2 style="margin-top:5px;">Cloud-Native Jenkins Pipeline on Kubernetes</h2>
                <p>
                    <strong>Goal:</strong> Optimize infrastructure cost, CPU, and RAM utilization while running a scalable enterprise CI/CD pipeline.
                </p>

                <ul>
                    <li>⚡ <strong>Zero Idle Resource Waste:</strong> Configured dynamic Jenkins agent pods on Kubernetes that automatically spin up on-demand during builds and self-terminate upon completion.</li>
                    <li>💰 <strong>Infrastructure Cost Reduction:</strong> Eliminated 24/7 dedicated static build server VMs, significantly reducing cloud CPU and memory consumption.</li>
                    <li>🔒 <strong>Daemonless Container Image Builds:</strong> Integrated <strong>Kaniko</strong> inside the K8s pipeline to build and push Docker images securely without requiring Docker daemon root access.</li>
                    <li>🚀 <strong>End-to-End GitOps Sync:</strong> Connected automated build artifacts directly to <strong>Argo CD</strong> for zero-downtime, continuous deployment back into the Kubernetes cluster.</li>
                    <li>📊 <strong>Centralized Observability:</strong> Integrated <strong>Prometheus, Grafana, and OpenSearch</strong> for real-time cluster metrics monitoring and application log aggregation.</li>
                </ul>
            </div>

            <h2>Roles & Responsibilities</h2>

            <ul>
                <li>✅ Build and maintain Cloud-Native CI/CD Pipelines using Jenkins and GitHub.</li>
                <li>✅ Containerize applications securely using Docker and Kaniko.</li>
                <li>✅ Deploy and manage workloads on Kubernetes clusters.</li>
                <li>✅ Implement GitOps Continuous Delivery using Argo CD.</li>
                <li>✅ Provision Cloud Infrastructure as Code using Terraform on AWS.</li>
                <li>✅ Automate System Configuration Management using Ansible.</li>
                <li>✅ Monitor system metrics using Prometheus and Grafana dashboards.</li>
                <li>✅ Aggregate logs and troubleshoot production incidents via OpenSearch.</li>
                <li>✅ Ensure High Availability, Auto-scaling, Cost Optimization, and Security.</li>
            </ul>

            <div class="quote">
                "Automate Everything. Optimize Resources. Deploy with Confidence."
            </div>

            <a href="/">⬅ Back to Dashboard</a>

        </div>

        </body>
        </html>
        """;
    }

}
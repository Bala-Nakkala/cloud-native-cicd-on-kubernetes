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
            <title>DevOps Engineer</title>

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
                }

                ul{
                    line-height:2;
                    font-size:18px;
                }

                li{
                    margin-bottom:10px;
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
                }

            </style>

        </head>

        <body>

        <div class="container">

            <h1>🚀 DevOps Engineer</h1>

            <p>
                A DevOps Engineer bridges the gap between Software Development and IT Operations by automating application delivery, infrastructure provisioning, monitoring, deployment and production support.
            </p>

            <h2>Roles & Responsibilities</h2>

            <ul>
                <li>✅ Build and maintain CI/CD Pipelines using Jenkins and GitHub.</li>
                <li>✅ Containerize applications using Docker and Kaniko.</li>
                <li>✅ Deploy and manage applications on Kubernetes.</li>
                <li>✅ Implement GitOps Continuous Delivery using Argo CD.</li>
                <li>✅ Provision Cloud Infrastructure using Terraform.</li>
                <li>✅ Automate Server Configuration using Ansible.</li>
                <li>✅ Monitor applications using Prometheus and Grafana.</li>
                <li>✅ Analyze Logs and troubleshoot Production Issues.</li>
                <li>✅ Ensure High Availability, Scalability and Security.</li>
                <li>✅ Collaborate with Developers, QA and Operations Teams.</li>
            </ul>

            <h2>Daily Activities</h2>

            <ul>
                <li>✔ Review Pull Requests</li>
                <li>✔ Build CI/CD Pipelines</li>
                <li>✔ Build & Push Docker Images</li>
                <li>✔ Deploy Applications to Kubernetes</li>
                <li>✔ Monitor Production Environments</li>
                <li>✔ Resolve Production Incidents</li>
                <li>✔ Improve Automation & Deployment Processes</li>
            </ul>

            <div class="quote">
                "Automate Everything. Deploy with Confidence."
            </div>

            <a href="/">⬅ Back to Dashboard</a>

        </div>

        </body>

        </html>
        """;
    }

}
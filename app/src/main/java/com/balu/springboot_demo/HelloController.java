package com.balu.springboot_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {

        return """
        DevOps Engineer Responsibilities

        • Build CI/CD Pipelines
        • Containerize Applications
        • Kubernetes Administration
        • GitOps using Argo CD
        • Infrastructure as Code
        • Monitoring & Logging
        • Cloud Automation
        • Production Troubleshooting

        "Automate Everything."
        """;

    }

}
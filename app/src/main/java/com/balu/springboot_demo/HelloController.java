package com.balu.springboot_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/", produces = "text/html")
    public String home() {

        return """
        <!DOCTYPE html>
        <html>

        <head>

            <title>DevOps CI/CD Demo</title>

            <style>

                body{
                    background:#0f172a;
                    color:white;
                    font-family:Arial, Helvetica, sans-serif;
                    text-align:center;
                    margin-top:80px;
                }

                .card{
                    width:800px;
                    margin:auto;
                    background:#1e293b;
                    padding:40px;
                    border-radius:15px;
                    box-shadow:0px 0px 20px #000;
                }

                h1{
                    color:#38bdf8;
                    font-size:42px;
                }

                h2{
                    color:#22c55e;
                }

                p{
                    font-size:18px;
                }

                a{
                    display:inline-block;
                    margin-top:25px;
                    padding:15px 35px;
                    background:#2563eb;
                    color:white;
                    text-decoration:none;
                    border-radius:8px;
                    font-size:18px;
                }

                a:hover{
                    background:#1d4ed8;
                }

            </style>

        </head>

        <body>

            <div class="card">

                <h1>🚀 Welcome to UFC.COM</h1>

                <h2>CI/CD Pipeline Successfully Deployed</h2>

                <p>✅ Jenkins</p>

                <p>✅ Kubernetes</p>

                <p>✅ Kaniko</p>

                <p>✅ Docker Hub</p>

                <p>✅ Helm</p>

                <p>✅ GitOps</p>

                <p>✅ Argo CD</p>

                <p><b>Deployment Status:</b> SUCCESS 🎉</p>

                <a href="/hello">Go to Hello API</a>

            </div>

        </body>

        </html>
        """;
    }

    @GetMapping("/hello")
    public String hello() {
        return "🥊 Hello from UFC.COM!";
    }

}
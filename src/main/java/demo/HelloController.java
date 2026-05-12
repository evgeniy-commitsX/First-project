package demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String home() {

        return """
            <!DOCTYPE html>
            <html lang="en">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">

                <title>DevOps Project</title>

                <style>

                    * {
                        margin: 0;
                        padding: 0;
                        box-sizing: border-box;
                    }

                    body {
                        height: 100vh;
                        display: flex;
                        justify-content: center;
                        align-items: center;
                        font-family: Arial, sans-serif;
                        background:
                            linear-gradient(rgba(0,0,0,0.65),
                            rgba(0,0,0,0.65)),
                            url('https://images.unsplash.com/photo-1518770660439-4636190af475?q=80&w=1600&auto=format&fit=crop');
                        background-size: cover;
                        background-position: center;
                        color: white;
                    }

                    .container {
                        width: 800px;
                        padding: 50px;
                        border-radius: 25px;
                        backdrop-filter: blur(10px);
                        background: rgba(255,255,255,0.08);
                        box-shadow: 0 20px 50px rgba(0,0,0,0.4);
                        text-align: center;
                        animation: fadeIn 1.5s ease;
                    }

                    h1 {
                        font-size: 52px;
                        margin-bottom: 20px;
                    }

                    p {
                        font-size: 20px;
                        line-height: 1.7;
                        margin-bottom: 30px;
                    }

                    .badges {
                        margin-top: 20px;
                    }

                    .badge {
                        display: inline-block;
                        padding: 12px 20px;
                        margin: 8px;
                        border-radius: 50px;
                        background: rgba(255,255,255,0.15);
                        border: 1px solid rgba(255,255,255,0.2);
                        font-weight: bold;
                    }

                    .button {
                        display: inline-block;
                        margin-top: 30px;
                        padding: 15px 30px;
                        border-radius: 50px;
                        background: #00c6ff;
                        color: white;
                        text-decoration: none;
                        font-weight: bold;
                        transition: 0.3s;
                    }

                    .button:hover {
                        background: #0072ff;
                        transform: scale(1.05);
                    }

                    @keyframes fadeIn {
                        from {
                            opacity: 0;
                            transform: translateY(30px);
                        }
                        to {
                            opacity: 1;
                            transform: translateY(0);
                        }
                    }

                </style>
            </head>

            <body>

                <div class="container">

                    <h1>DevOps Deployment</h1>

                    <p>
                        Dockerized Java Spring Boot application
                        automatically deployed to AWS EC2
                        using GitHub Actions CI/CD pipeline.
                    </p>

                    <div class="badges">
                        <span class="badge">Java</span>
                        <span class="badge">Spring Boot</span>
                        <span class="badge">Docker</span>
                        <span class="badge">AWS</span>
                        <span class="badge">GitHub Actions</span>
                        <span class="badge">Linux</span>
                    </div>

                    <a class="button" href="https://github.com" target="_blank">
                        View DevOps Workflow
                    </a>

                </div>

            </body>
            </html>
            """;
    }
}
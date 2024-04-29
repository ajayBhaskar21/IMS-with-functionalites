<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="style.css" />
    <link rel="shortcut icon" href="https://th.bing.com/th/id/OIP.kwE8IapDUTtylieeRnn2YAHaHa?pid=ImgDet&rs=1"
        type="image/x-icon" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous" />
    <title>Login form</title>
</head>

<body class="background-radial-gradient">
    <style>
        .background-radial-gradient {
            background-color: hsl(219, 43%, 17%);
            background-image: radial-gradient(650px circle at 0% 0%,
                    hsl(218, 41%, 35%) 15%,
                    hsl(218, 41%, 30%) 35%,
                    hsl(218, 41%, 20%) 75%,
                    hsl(218, 41%, 19%) 80%,
                    transparent 100%),
                radial-gradient(1250px circle at 100% 100%,
                    hsl(218, 41%, 45%) 15%,
                    hsl(218, 41%, 30%) 35%,
                    hsl(218, 41%, 20%) 75%,
                    hsl(218, 41%, 19%) 80%,
                    transparent 100%);
        }

        #radius-shape-1 {
            height: 220px;
            width: 220px;
            top: 110px;
            left: 130px;
            background: radial-gradient(#44006b, #ad1fff);
            overflow: hidden;
        }

        #radius-shape-2 {
            border-radius: 38% 62% 63% 37% / 70% 33% 67% 30%;
            bottom: 30px;
            right: 180px;
            width: 200px;
            height: 300px;
            background: radial-gradient(#44006b, #ad1fff);
            overflow: hidden;
        }

        #card {
            margin-top: 100px;
            top: 7%;
            right: 34%;
            width: 450px;
            margin: 100px auto;
            text-align: center;
            position: absolute;
            background: hsl(0, 0%, 100%);
            backdrop-filter: blur(30px);
        }

        .form-outline>input {
            background-color: #ececec77;
        }
        #mid {
            display: flex;
            flex-direction: column;
            align-items: center;
        }
    </style>

    <section class="text-center">
        <div id="radius-shape-1" class="position-absolute rounded-circle shadow-5-strong"></div>
        <div id="radius-shape-2" class="position-absolute shadow-5-strong"></div>
        <div class="card mx-9 lg-12 mx-md-5 shadow-5-strong" id="card">
            <div class="card-body px-md-5 align-left">
                <h2 class="fw-bold mb-5">Login Form</h2>
                <form method="post" action="${pageContext.request.contextPath}/login" style="text-align: left">

                    <div class="form-outline mb-4">
                        <label class="form-label" for="form3Example3">Username</label>
                        <input type="text" id="form3Example3" name="username" class="form-control" />
                    </div>

                    <div class="form-outline mb-4">
                        <label class="form-label" for="form3Example4">Password</label>
                        <input type="password" id="form3Example4" name="password" class="form-control" />
                    </div>
                    <div id="mid">
                        <div class="form-outline mb-4">
                            don't have account? <a href="/signup">sign up</a>
                        </div>
                        <button type="submit" class="btn btn-primary btn-block mb-4">
                            Login
                        </button>
                    </div>

                </form>


            </div>
        </div>
    </section>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js"
        integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V"
        crossorigin="anonymous"></script>
</body>

</html>

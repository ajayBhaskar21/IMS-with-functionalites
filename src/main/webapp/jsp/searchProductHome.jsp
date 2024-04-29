<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Inventory Management Dashboard</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        .container {
            max-width: 800px;
            margin: 50px auto;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
        }

        h1 {
            color: #333;
            text-align: center;
        }

        .menu {
            list-style-type: none;
            padding: 0;
            margin-bottom: 30px;
        }

        .menu li {
            margin-bottom: 10px;
        }

        .menu li a {
            display: block;
            padding: 15px;
            background-color: #007bff;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
            text-align: center;
        }

        .menu li a:hover {
            background-color: #0056b3;
        }

        .logout-link {
            display: block;
            color: red;
            text-decoration: none;
            text-align: center;
            margin-top: 30px;
        }

        .logout-link:hover {
            color: darkred;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Search Home</h1>
    <ul class="menu">
        <li><a href="/searchProductById">Search by Id</a></li>
        <li><a href="/searchProductByStock">Search by Stock</a></li>
        <li><a href="/searchProductBasedOnRatings">Search Based on Ratings</a></li>
        <li><a href="/searchProductBasedOnItemsSold">Search Based on Items Sold</a></li>
        <li><a href="/searchProductByRevenueGenerated">Search by Revenue Generated</a></li>
    </ul>
    <a class="logout-link" href="/home">home</a>
</div>
</body>
</html>

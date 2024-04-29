<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Search Product</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        h1 {
            color: #333;
            width: 100%;
            text-align: center;
            padding: 20px;
            background-color: #007bff;
            color: white;
            margin-bottom: 0;
        }

        form {
            width: 300px;
            margin: 0 auto;
            margin-top: 50px;
            background-color: white;
            padding: 20px;
            border: 1px solid #ddd;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            margin-bottom: 10px;
        }

        input[type="text"] {
            width: calc(100% - 22px); /* Adjusted width to fit within form */
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ddd;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }

        .message {
            color: red;
            font-size: 14px;
            margin-top: 10px;
        }
        .home-link {
            display: block;
            text-align: center;
            margin-top: 20px;
            text-decoration: none;
            color: #007bff;
        }

        .home-link:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <h1>Search Product</h1>
    <form action="/search" method="post">
        <label for="id">Enter Product ID:</label>
        <input type="text" id="id" name="id" required><br>
        <input type="submit" value="Search">
    </form>

    <!-- Display search results here -->
    <div class="message">
        <!-- Check if product exists -->
        <c:if test="${product != null}">
            <table>
                <tr>
                    <th>Product Name</th>
                    <th>Stock</th>
                    <th>Ratings</th>
                    <th>Items Sold</th>
                    <th>Revenue Generated</th>
                </tr>
                <tr>
                    <td>${product.productName}</td>
                    <td>${product.stock}</td>
                    <td>${product.ratings}</td>
                    <td>${product.itemsSold}</td>
                    <td>${product.revenueGenerated}</td>
                </tr>
            </table>
        </c:if>

    </div>
    <a href="home" class="home-link">Home</a>
</body>
</html>

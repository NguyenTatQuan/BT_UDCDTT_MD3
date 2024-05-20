<!DOCTYPE html>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<h2>Currency Converter</h2>
<form action="convert" method="post">
    <label for="rate">Exchange Rate (USD to VND):</label>
    <input type="text" id="rate" name="rate" required>
    <br>
    <label for="amount">Amount in USD:</label>
    <input type="text" id="amount" name="amount" required>
    <br>
    <button type="submit">Convert</button>
</form>
</body>
</html>


<!DOCTYPE html>
<html>
<head>
  <title>Add New Animal</title>
</head>
<body>
  <h1>Add New Animal</h1>
  <form action="/animals/new" method="post">
    <label>Name:</label>
    <input type="text" name="name" required/><br/>

    <label>Species:</label>
    <input type="text" name="species" required/><br/>

    <label>Description:</label>
    <textarea name="description" required></textarea><br/>

    <label>Image URL:</label>
    <input type="url" name="imageUrl"/><br/>

    <label>Active Date:</label>
    <input type="date" name="activeDate"/><br/>

    <button type="submit">Add Animal</button>
  </form>
</body>
</html>

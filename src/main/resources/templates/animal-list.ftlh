<!-- src/main/resources/templates/animal-form.html -->
<!DOCTYPE html>
<html>
<head><title>Add Animal</title></head>
<body>
  <h1>Add a New Animal</h1>
  <form action="/animals/new" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name"/><br/>

    <label for="description">Description:</label>
    <input type="text" id="description" name="description"/><br/>

    <label for="species">Species:</label>
    <input type="text" id="species" name="species"/><br/>

    <label for="imageUrl">Image URL:</label>
    <input type="text" id="imageUrl" name="imageUrl"/><br/>

    <!-- you can omit activeDate or provide a default in your controller -->
    <button type="submit">Add Animal</button>
  </form>
  <p><a href="/animals">← Back to list</a></p>
</body>
</html>

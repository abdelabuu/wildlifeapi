<!DOCTYPE html>
<html>
<head>
    <title>Animal Details</title>
</head>
<body>
    <h1>${animal.name}</h1>
    <p><strong>Species:</strong> ${animal.species}</p>
    <p><strong>Description:</strong> ${animal.description}</p>
    <p><strong>Image URL:</strong> ${animal.imageUrl}</p>
    <p><strong>Active Date:</strong> ${animal.activeDate?string('yyyy-MM-dd')}</p>
</body>
</html>

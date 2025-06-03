# Wildlife API

This is a Spring Boot RESTful API for managing animals in a gallery.

## Endpoints

- `GET /animals` – Get all animals
- `GET /animals/{id}` – Get one animal by ID
- `POST /animals` – Add new animal
- `PUT /animals/{id}` – Update animal
- `DELETE /animals/{id}` – Delete animal
- `GET /animals/search?name=zebra` – Search by name
- `GET /animals/species/zebra` – Search by species

## Example Attributes
- `name`: "Zebra"
- `description`: "Striped herbivore native to Africa."
- `species`: "Equus zebra"
- `imageUrl`: "zebra.jpg"
- `activeDate`: "2024-04-30"

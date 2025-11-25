#  Pokémon Search Engine

A full-stack web application to search for Pokémon details.  
This project uses a **Java Spring Boot** backend to fetch & cache data from the PokéAPI,  
and a **React (Vite)** frontend to display the results.

---

##  Features

-  **Search Pokémon by Name**
-  **View Official Artwork**
-  **Rich Details:** Types, height, weight, stats, moves, etc.
-  **Redis Caching** for faster repeated searches
-  **Responsive UI** built with Tailwind CSS

---

##  Prerequisites

Make sure you have the following installed:

- **Java JDK 17+**
- **Node.js 18+**
- **Redis**

---

<img width="1867" height="893" alt="image" src="https://github.com/user-attachments/assets/2d706755-3501-4e12-8c58-b2ca5ae485eb" />

<img width="1866" height="894" alt="image" src="https://github.com/user-attachments/assets/74f35932-77fa-45a0-b285-1b693d907199" />




##  Getting Started

### 1. Configure Redis

The backend expects Redis to be running with the following configuration:

- **Host:** `Your Host`  
- **Port:** `Your PORT number`  
- **Password:** `Your Password`

### 2. Start the Backend (Spring Boot)

Open terminal → Go to the backend folder:

```bash
cd Backend

gradlew.bat bootRun
```


### 3. Start the Frontend (React + Vite)

Open another terminal → Go to the frontend folder:
```bash
cd frontend

npm install

npm run dev
```

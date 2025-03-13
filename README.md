Crypto Dashboard

Description

Crypto Dashboard est une application full-stack qui permet d'afficher les informations des cryptomonnaies en temps réel. Elle permet de visualiser une liste complète des cryptomonnaies disponibles ainsi que les trois cryptos les plus performantes sur 24 heures.

L'application utilise :

Backend : Java Spring Boot

Frontend : Angular pour afficher les données sous forme de tableaux 

Fonctionnalités

✅ Affichage de la liste complète des cryptos avec leur prix actuel et leur variation sur 24 heures.✅ Affichage du Top 3 des cryptos les plus performantes.✅ Possibilité de basculer entre la liste complète et le Top 3 avec des boutons.✅ Communication entre le frontend et le backend via une API REST.

Technologies utilisées :

Backend (Spring Boot)

Java 17

Spring Boot

Spring Web

Spring Boot Starter

Frontend (Angular)

Angular 17

Axios (pour les requêtes HTTP)

SCSS (pour le design)

Installation et Exécution du Projet

1️⃣ Prérequis

Node.js (v16+ recommandé) et npm (ou Yarn)

Angular CLI

Java JDK 17+

Maven

2️⃣ Installation du Backend

# Cloner le projet
git clone https://github.com/votre-repo/crypto-dashboard.git
cd crypto-dashboard/

# Lancer l'application Spring Boot
mvn spring-boot:run

Le backend sera disponible sur http://localhost:8080.

3️⃣ Installation du Frontend

cd ../frontend
npm install  # Installer les dépendances
ng serve     # Lancer l'application Angular

Le frontend sera disponible sur http://localhost:4200.

Structure du Projet

crypto-dashboard/
│── backend/            # Backend avec Spring Boot
│   ├── src/main/java/
│   ├── pom.xml
│   ├── ...
│
│── frontend/           # Frontend avec Angular
│   ├── src/app/
│   ├── package.json
│   ├── angular.json
│
│── README.md           # Documentation du projet

Endpoints API

🔹 Récupérer toutes les cryptos

GET http://localhost:8080/cryptos


🔹 Récupérer le Top 3 des cryptos

GET http://localhost:8080/cryptos/top3

Auteur

👤 Bridge Laurence Kèmi ATINDOKPO

# Projet Appareils
## Description
Le projet "Appareils" est une application Java permettant de créer, personnaliser et gérer des appareils électroniques. Ce système utilise une structure de classes orientée objet avec une hiérarchie d'héritage et une implémentation du Design Pattern Decorator. Le but du projet est de démontrer la gestion d'objets complexes avec des fonctionnalités comme la personnalisation des appareils (ajout de composants, accessoires) et le calcul du prix final en fonction des choix effectués.

## Hiérarchie du projet
Le projet est composé de plusieurs classes organisées de manière à représenter différents types d'appareils, leurs personnalisations, et la gestion d'un inventaire d'appareils. Voici la structure hiérarchique du projet :

### 1. Classe Appareil (Classe abstraite)
La classe Appareil est la base de tous les appareils. Elle contient des attributs communs à tous les appareils comme :

id : Identifiant unique de l'appareil.
nom : Le nom de l'appareil.
prixDeBase : Le prix de base de l'appareil.
type : Le type de l'appareil (ex. Téléphone, OrdinateurPortable, etc.).
Elle définit également des méthodes abstraites comme activer(), getDescription(), et getPrixFinal(), qui doivent être implémentées par ses sous-classes.

### 2. Sous-classes d'Appareil :
Telephone : Représente un appareil de type téléphone.
OrdinateurPortable : Représente un appareil de type ordinateur portable.
Ordinateur : Classe abstraite, parent de Apple et Asus. Décrit des ordinateurs génériques, et permet la personnalisation via des processeurs et des cartes graphiques.
Apple et Asus : Sous-classes de Ordinateur qui représentent des ordinateurs spécifiques des marques Apple et Asus.

### 3. Design Pattern Decorator
Le Design Pattern Decorator est utilisé pour ajouter dynamiquement des fonctionnalités supplémentaires aux ordinateurs. Par exemple :

CarteReseau et CarteBluetooth sont des décorateurs permettant d'ajouter des cartes réseau et Bluetooth aux ordinateurs. Les décorateurs permettent de modifier des objets existants sans modifier leur structure de base.

### 4. Gestion de l'Inventaire
Inventaire : Permet de gérer un inventaire d'appareils. Il contient une liste d'objets Appareil et des méthodes pour ajouter de nouveaux appareils et afficher l'inventaire.

### 5. Usine de Création
Usine : Gère la création des appareils. L'utilisateur peut choisir le type d'appareil qu'il souhaite fabriquer, et personnaliser les composants (processeur, carte graphique, etc.). Une fois l'appareil créé, il est ajouté à l'inventaire.

### 6. Énumérations
Categorie : Enumération représentant les différentes catégories d'appareils (Téléphone, OrdinateurPortable, Apple, Asus).
Processeur et CarteGraphique : Enumérations permettant de sélectionner des processeurs et cartes graphiques spécifiques avec des prix associés.

## Objectif du projet
L'objectif principal de ce projet est de démontrer la création d'appareils électroniques avec différentes options de personnalisation. L'application permet de gérer un inventaire d'appareils, de calculer leurs prix en fonction de la personnalisation, et d'utiliser des concepts comme l'héritage et le Design Pattern Decorator pour étendre les fonctionnalités d'un objet sans changer sa structure de base.

# Rapport TP1 - Git & GitHub
**Nom et Prenom :** EL MALKI Niema <br>
**N° d’Inscription :** SMI0157/24


## 1. Initialisation et configuration
J'ai initialisé le dépôt avec `git init` et configuré mon identité. `git status` montre l'état actuel de ton projet : quels fichiers sont modifiés, lesquels sont nouveaux (untracked) et lesquels sont prêts à être enregistrés. `git add` Ajoute des fichiers à l'index (Staging Area). C'est une étape de préparation avant la sauvegarde définitive.`touch` cree un fichier.
<img width="1029" height="898" alt="image" src="https://github.com/user-attachments/assets/8d96185a-6370-4666-b03d-18aac0dd0d4c" />

&rarr; Je remarque que le fichier Personne.java ne figure plus dans la liste des fichiers à traiter par git status. C'est parce qu'il est passé de l'état Staged à l'état Committed. Il fait désormais partie de l'historique du dépôt et est considéré comme 'à jour' par Git.


`git add -A` ajoute absolument tous les changements d'un coup. 



## 2. Gestion des fichiers et .gitignore
Le fichier `credentials` est ignoré grâce au fichier `.gitignore`.

## 3. Gestion des branches
J'ai créé une branche `dev` pour les modifications et effectué un merge vers la branche principale.

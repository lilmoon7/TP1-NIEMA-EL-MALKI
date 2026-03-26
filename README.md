# Rapport TP1 - Git & GitHub
**Nom et Prenom :** EL MALKI Niema <br>
**N° d’Inscription :** SMI0157/24

## 1. Initialisation et configuration
J’ai créé un dossier tp-git et l’ai ouvert avec VSCode pour commencer le projet.<br><br>
J'ai initialisé le dépôt avec `git init` et configuré mon identité. <br>
`git status` montre l'état actuel de ton projet : quels fichiers sont modifiés, lesquels sont nouveaux (untracked) et lesquels sont prêts à être enregistrés.<br>
`git add` Ajoute des fichiers à l'index (Staging Area). C'est une étape de préparation avant la sauvegarde définitive.<br>
`touch` cree un fichier.<br>
`git config --global user.name "Nom"` Enregistre mon nom. Ce nom apparaîtra à côté de chaque modification dans l'historique (git log).<br>
`git config --global user.email "Email"` Enregistre mon adresse. C'est ce qui permet à GitHub de lier tes commits locaux à ton compte en ligne.<br><br>
<img width="1029" height="898" alt="image" src="https://github.com/user-attachments/assets/8d96185a-6370-4666-b03d-18aac0dd0d4c" />
&rarr; Je remarque que le fichier Personne.java ne figure plus dans la liste des fichiers à traiter par git status. C'est parce qu'il est passé de l'état Staged à l'état Committed. Il fait désormais partie de l'historique du dépôt et est considéré comme 'à jour' par Git.<br><br>

<img width="488" height="205" alt="image" src="https://github.com/user-attachments/assets/6702482c-0994-4794-9bd8-e09608ec5569" />

&rarr; La commande git status montre maintenant que Etudiant.java est indexé (Staged) et prêt à être validé. L'utilisation de `git add -A` a permis d'ajouter tous les fichiers non suivis du répertoire de travail en une seule commande.
<br><br>

`git log` Affiche la liste de tous les commits effectués, avec le nom de l'auteur, la date et le message.
`git commit -m "message"` Enregistre définitivement les modifications présentes dans l'index. Le message doit expliquer ce qui a été fait. C'est comme un "point de sauvegarde" dans un jeu vidéo.<br><br>
<img width="816" height="612" alt="image" src="https://github.com/user-attachments/assets/ef49be56-871b-4f0a-9164-3b24586be22f" />



## 2. Gestion des fichiers et .gitignore
Le fichier `credentials` est ignoré grâce au fichier `.gitignore`.<br><br>
 `git status` montre l'état actuel de ton projet : quels fichiers sont modifiés, lesquels sont nouveaux (untracked) et lesquels sont prêts à être enregistrés.<br>
 `git add` Ajoute des fichiers à l'index (Staging Area). C'est une étape de préparation avant la sauvegarde définitive.<br>
 `git commit -m "message"` Enregistre définitivement les modifications présentes dans l'index. Le message doit expliquer ce qui a été fait. C'est comme un "point de sauvegarde" dans un jeu vidéo.<br>
 `touch` cree un fichier.<br>
 `ls`Affiche la liste des fichiers et dossiers présents dans le répertoire actuel. <br>
 `git rm <fichier>` Supprime le fichier du disque dur et de l'index Git. <br>
 `git rm --cached <fichier>` Supprime le fichier de l'index Git (ne sera plus suivi), mais le garde sur ton ordinateur. Très utile pour réparer une erreur après avoir oublié le `.gitignore`. <br>
 `git remote add origin <URL>` Crée le lien initial entre ton dossier local et ton dépôt GitHub sous le nom "origin".<br>
 `echo` Affiche du texte ou l'écrit dans un fichier.<br>
 `git remote set-url origin <URL>`Permet de modifier l'adresse du dépôt distant si tu t'es trompée ou si tu as renommé le projet.<br>
 `git push -u origin <branche>` Envoie tes commits locaux vers GitHub. L'option -u lie les deux branches pour faciliter les prochains envois.<br>
<br>

<img width="961" height="963" alt="image" src="https://github.com/user-attachments/assets/f968fde7-828e-4d03-9cf7-3499fb45b43a" /><br>
<img width="978" height="950" alt="image" src="https://github.com/user-attachments/assets/1e062d6f-0937-4191-941e-74fe8fec97b5" /><br>
<img width="828" height="403" alt="image" src="https://github.com/user-attachments/assets/ff2bbc59-2ac0-44be-a9ea-386ddc5c798e" /><br>
J’ai renommé le dépôt GitHub en TP1-NIEMA-EL-MALKI directement sur GitHub afin de respecter les consignes du TP.<br>



## 3. Gestion des branches
J'ai créé une branche `dev` pour les modifications et effectué un merge vers la branche principale.<br>
`echo` Affiche du texte ou l'écrit dans un fichier.<br>
`git status` montre l'état actuel de ton projet : quels fichiers sont modifiés, lesquels sont nouveaux (untracked) et lesquels sont prêts à être enregistrés.<br>
`git commit -m "message"` Enregistre définitivement les modifications présentes dans l'index. Le message doit expliquer ce qui a été fait. C'est comme un "point de sauvegarde" dans un jeu vidéo.<br>
 `git push -u origin <branche>` Envoie tes commits locaux vers GitHub. L'option -u lie les deux branches pour faciliter les prochains envois.<br>
 `git remote set-url origin <URL>`Permet de modifier l'adresse du dépôt distant si tu t'es trompée ou si tu as renommé le projet.<br>
 `git checkout -b <nom> `Crée une nouvelle branche et bascule immédiatement dessus. Cela permet de travailler sur une version isolée du projet (comme ta branche dev).<br><br>
<img width="768" height="845" alt="image" src="https://github.com/user-attachments/assets/6076729b-1c6f-467d-bca8-974c0ed82eaf" />


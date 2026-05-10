# Documentation Javadoc des Entités (Modèles)

Ce document résume la documentation Javadoc intégrée aux classes du modèle du projet **TaskFlow**.

## `models.User`
Représente un utilisateur de l'application TaskFlow. Un utilisateur peut s'inscrire, se connecter, et posséder un rôle spécifique (Administrateur ou Membre). Selon son rôle, il peut interagir avec des projets et se voir attribuer des tâches.

**Attributs :**
* `int id` : Identifiant unique de l'utilisateur.
* `String name` : Nom complet ou pseudo de l'utilisateur.
* `String email` : Adresse email utilisée pour la connexion (inscription / connexion simplifiée).
* `String password` : Mot de passe de l'utilisateur.
* `Role role` : Rôle de l'utilisateur déterminant ses permissions (ADMIN, MEMBER).
* `List<Task> assignedTasks` : Liste des tâches assignées à cet utilisateur.

**Méthodes principales :**
* `void assignTask(Task task)` : Assigne une nouvelle tâche à l'utilisateur.

---

## `models.Project`
Représente un projet dans l'application TaskFlow. Un projet contient une liste de tâches à accomplir et est géré par une équipe de membres (utilisateurs). On peut ajouter ou supprimer des membres et des tâches au sein d'un projet.

**Attributs :**
* `int id` : Identifiant unique du projet.
* `String name` : Nom descriptif du projet.
* `String description` : Description globale du projet et de ses objectifs.
* `List<User> members` : Liste des membres (utilisateurs) assignés ou ayant accès au projet.
* `List<Task> tasks` : Liste des tâches créées au sein de ce projet.

**Méthodes principales :**
* `void addMember(User user)` : Ajoute un membre au projet s'il n'y est pas déjà.
* `void removeMember(User user)` : Supprime un membre du projet.
* `void addTask(Task task)` : Ajoute une nouvelle tâche au projet.
* `void removeTask(Task task)` : Supprime une tâche du projet.

---

## `models.Task`
Représente une tâche au sein d'un projet. Une tâche possède un titre, une description, un statut d'avancement, une date d'échéance et peut être attribuée à un membre spécifique. Elle fait toujours partie d'un projet.

**Attributs :**
* `int id` : Identifiant unique de la tâche.
* `String title` : Titre ou nom court de la tâche.
* `String description` : Description détaillée de la tâche à accomplir.
* `TaskStatus status` : Statut actuel de la tâche (ex: À faire, En cours, Terminée).
* `User assignee` : Membre responsable de la réalisation de la tâche. Peut être null si non assignée.
* `LocalDate dueDate` : Date limite (échéance) pour terminer la tâche.
* `Project project` : Projet auquel cette tâche appartient.

**Méthodes principales :**
* `void setAssignee(User assignee)` : Attribue la tâche à un membre.

---

## `models.Notification`
Représente une notification système envoyée à un utilisateur. Les notifications sont généralement utilisées pour informer un membre qu'une nouvelle tâche lui a été assignée, dans le cadre du pattern Observer.

**Attributs :**
* `int id` : Identifiant unique de la notification.
* `String message` : Le contenu du message de la notification.
* `User recipient` : L'utilisateur destinataire de la notification.
* `LocalDateTime createdAt` : Date et heure de la création de la notification.
* `boolean isRead` : Indique si la notification a été lue par l'utilisateur.

**Méthodes principales :**
* `void markAsRead()` : Marque la notification comme lue.

---

## Énumérations

### `models.Role`
Représente le rôle d'un utilisateur dans le système.
* `ADMIN` : Administrateur du système, possède tous les droits sur les projets et les utilisateurs.
* `MEMBER` : Membre simple, peut être assigné à des tâches et participer aux projets.

### `models.TaskStatus`
Représente l'état d'avancement d'une tâche dans un projet.
* `A_FAIRE` : La tâche vient d'être créée ou n'a pas encore commencé.
* `EN_COURS` : La tâche est actuellement en cours de traitement par un membre.
* `TERMINEE` : La tâche a été complétée et terminée.

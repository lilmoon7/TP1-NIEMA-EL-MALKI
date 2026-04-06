class Etudiant extends Personne {
    private String numeroEtudiant;

    public Etudiant(String nom, String prenom, String numeroEtudiant) {
        super(nom, prenom);
        this.numeroEtudiant = numeroEtudiant;
    }

    public String getNumeroEtudiant() {
        return numeroEtudiant;
    }
}


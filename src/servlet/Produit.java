package servlet;

public class Produit {
	private String label;
    private double prix;
    private boolean disponibilite;

    
    public Produit(String label, double prix, boolean disponibilite) {
        this.label = label;
        this.prix = prix;
        this.disponibilite = disponibilite;
    }    
    public Produit() {
        
    }

  
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public boolean isDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }
}

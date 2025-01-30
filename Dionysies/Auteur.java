class Auteur {
  private String nomAuteur;
  private int qualiteTragedie;
  private String citationTragedie;
  private int qualiteComedie;
  private String citationComedie;
  private int qualiteDrame;
  private String citationDrame;

  public Auteur(String nomAuteur, int qualiteTragedie,String citationTragedie, int qualiteComedie,String citationComedie, int qualiteDrame, String citationDrame) {
      this.nomAuteur = nomAuteur;
      this.citationComedie = citationComedie;
      this.qualiteComedie = qualiteComedie;
      this.qualiteDrame = qualiteDrame;
      this.citationDrame = citationDrame;
      this.citationTragedie = citationTragedie;
      this.qualiteTragedie = qualiteTragedie;   
  }

  

  public Style point_fort() {
    if (qualiteTragedie > qualiteComedie) {
      if (qualiteDrame > qualiteTragedie) {
        return Style.DRAME;
      } else {
        return Style.TRAGÉDIE;
      }
    } else {
      if (qualiteDrame > qualiteComedie) {
        return Style.DRAME;
      } else {
        return Style.COMÉDIE;
      }
    }
  }

  public String getNomAuteur() {
      return nomAuteur;
  }

  public int getQualiteTragedie() {
      return qualiteTragedie;
  }

  public String getCitationTragedie() {
      return citationTragedie;
  }

  public int getQualiteComedie() {
      return qualiteComedie;
  }

  public String getCitationComedie() {
    return citationComedie;
  }

  public int getQualiteDrame() {
    return qualiteDrame;
  }

  public String getCitationDrame() {
      return citationDrame;
  }

  public void setNomAuteur(String nomAuteur) {
      this.nomAuteur = nomAuteur;
  }

  public void setQualiteTragedie(int qualiteTragedie) {
      this.qualiteTragedie = qualiteTragedie;
  }

  public void setCitationTragedie(String citationTragedie) {
      this.citationTragedie = citationTragedie;
  }

  public void setQualiteComedie(int qualiteComedie) {
      this.qualiteComedie = qualiteComedie;
  }

  public void setCitationComedie(String citationComedie) {
      this.citationComedie = citationComedie;
  }

  public void setQualiteDrame(int qualiteDrame) {
    this.qualiteDrame = qualiteDrame;
  }

  public void setCitationDrame(String citationDrame) {
      this.citationDrame = citationDrame;
  }
  @Override 
  
  public String toString(){
    return ("L'honorable :" + this.nomAuteur); 
  }


}

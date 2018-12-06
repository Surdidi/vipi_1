class Composant {
  constructor(position_x, position_y, hauteur, largeur, cheminImage) {
    this.position_x = position_x;
    this.position_y = position_y;
    this.hauteur = hauteur;
    this.largeur = largeur;
    this.image = new Image(this.hauteur, this.largeur);
    this.image.src = cheminImage;
  }

  getPosition_x() {
    return this.position_x;
  }

  setPosition_x(position_x) {
    this.position_x = position_x;
  }

  getPosition_y() {
    return this.position_y;
  }

  setPosition_y(position_y) {
    this.position_y = position_y;
  }

  getHauteur() {
    return this.hauteur ;
  }


  getLargeur() {
    return this.largeur ;
  }

  getImage() {
    return this.image ;
  }
}

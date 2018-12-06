class Mob {
  constructor(position_x, position_y, hauteur, largeur, image) {
    this.position_x = position_x;
    this.position_y = position_y;
    this.width = largeur;
    this.hauteur = hauteur;
    this.image = image;
  }

  getX() {
    return this.position_x;
  }

  getY() {
    return this.position_y;
  }

  getWidth() {
    return this.width;
  }

  getHeight() {
    return this.height;
  }

  getImage() {
    return this.image;
  }
}

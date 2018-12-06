class Obstacle extends Composant {
  constructor(position_x, position_y, hauteur, largeur, cheminImage) {
    super(position_x, position_y, hauteur, largeur, cheminImage)
  }

  verif_contact(position_x, position_y) {
    if(position_x >= this.position_x && position_x <= this.position_x+this.largeur) {
      if(position_y <= this.position_y+this.hauteur) {
        return true ;
      }
    }
    return false ;
  }
}

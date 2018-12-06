class Obstacle {

    constructor(hauteur,largeur,image, position_x, position_y){
      this.hauteur = hauteur;
      this.largeur = largeur;
      this.image = image ;
      this.position_x = position_x ;
      this.position_y = position_y ;
    }

    get hauteur(){
      return this.hauteur ;
    }

    get largeur(){
      return this.largeur ;
    }

    get image(){
      return this.image ;
    }

    function verif_contact(position_x,position_y){
        if(position_x >= this.position_x && position_x <= this.position_x+this.largeur){
            if(position_y <= this.position_y+this.hauteur){
              return true ;
            }
        }
        return false ;
    }
}

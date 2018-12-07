class Controlleur {

  contructor(){
    this.Vipi = new Vipi(0,0);
    this.tab = [9];
  }

  deplacement_right(){
     nb = getRandomInt(11);
     for(int i=0;i<8;i++){
       this.tab[i] = this.tab[i+1];
     }
     if(nb == 0){
       this.tab[9] = new Cactus(9,1,10,10);
     }
  }

}

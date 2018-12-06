class Vipi {
  constructor() {
    this.vie = 121;
    this.hydratation = 121;
    this.energie = 121;
    this.ch2019 = true;
    this.image = new Image(200, 200);
    this.image.src = "../../img/totem.png";
  }

  getVie() {
    return this.vie;
  }

  setVie(nouvelle_vie) {
    this.vie = nouvelle_vie;
  }

  getHydratation() {
    return this.hydratation;
  }

  setHydratation(nouvelle_hydratation) {
    this.hydratation = nouvelle_hydratation;
  }

  getEnergie() {
    return this.energie;
  }

  setEnergie(nouvelle_energie) {
    this.energie = nouvelle_energie;
  }

  getCh2019() {
    return this.ch2019;
  }

  changeCh2019() {
    if(this.ch2019 == false) {
      this.ch2019 = true;
    } else {
      this.ch2019 = false;
    }
  }

  getImage() {
    return this.image;
  }
}

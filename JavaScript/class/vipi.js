class Vipi extends Composant {
  constructor(position_x, position_y) {
    super(position_x, position_y, 200, 200, "../../img/totem.png");
    this.vie = 121;
    this.hydratation = 121;
    this.energie = 121;
    this.ch2019 = true;
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
}

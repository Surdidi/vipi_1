class vipi {
  constructor() {
    this.vie = 121;
    this.hydratation = 121;
    this.energie = 121;
    this.ch2019 = true;
    this.image = "../../img/totem.png";
  }

  get vie() {
    return this.vie;
  }

  set vie(vie) {
    this.vie = vie;
  }

  get hydratation() {
    return this.hydratation;
  }

  set hydratation(hydratation) {
    this.hydratation = hydratation;
  }

  get energie() {
    return this.energie;
  }

  set energie(energie) {
    this.energie = energie;
  }

  get ch2019() {
    return this.ch2019;
  }

  set bool_ch2019() {
    if(this.ch2019 == false) {
      this.ch2019 = true;
    } else {
      this.ch2019 = false;
    }
  }

  get image() {
    return this.image;
  }
}

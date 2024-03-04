//ESERCIZIO N.1

{
  class User {
    constructor(_firstName, _lastName, _age, _location) {
      this.firstName = _firstName;
      this.lastName = _lastName;
      this.age = _age;
      this.location = _location;
    }
    confrontaEta(altroUser) {
      if (this.age === altroUser.age) {
        return `${this.firstName} e ${altroUser.firstName} hanno la stessà età`;
      } else if (this.age > altroUser.age) {
        return `${this.firstName} è più grande di ${altroUser.firstName}`;
      } else {
        return `${this.firstName} è più giovane di ${altroUser.firstName}`;
      }
    }
  }

  let nadia = new User("Nadia", "Semprebon", 31, "Verona");
  let elena = new User("Elena", "Rossi", 32, "Bologna");

  console.log(nadia.confrontaEta(elena));
}

//ESERCIZIO N.2

class Pet {
  constructor(_animalName, _ownerName, _specie, _breed) {
    this.animalName = _animalName;
    this.ownerName = _ownerName;
    this.specie = _specie;
    this.breed = _breed;
  }
}

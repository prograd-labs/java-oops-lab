import axios from "axios";
const shootVillainGunTwo = (resolve, reject) => {
    const URL = "http://127.0.0.1:8080/hero-weapon-two";
    axios
      .post(URL)
      .then((response) => response.data)
      .then((data) => resolve(data))
      .catch((error) => {
        console.log(error);
        reject({ message: error.message });
      });
  };

  export default shootVillainGunTwo;
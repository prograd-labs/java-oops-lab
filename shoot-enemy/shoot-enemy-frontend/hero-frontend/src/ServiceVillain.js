import axios from "axios";

const files2 = (resolve2, reject2) => {
  const URL = "http://127.0.0.1:8080/villain-health";
  axios
    .get(URL)
    .then((response) => response.data)
    .then((data) => resolve2(data))
    .catch((error) => {
      console.log(error);
      reject2({ message: error.message });
    });
};



export default files2;
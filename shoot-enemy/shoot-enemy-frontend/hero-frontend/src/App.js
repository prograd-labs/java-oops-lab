import { useEffect, useState } from "react";
import files from "./Service.js";
import shootHero from "./ServiceShoot.js";
import files2 from "./ServiceVillain.js";
import shootVillain from "./ServiceShootVillain.js";
import shootVillainGunTwo from "./ServiceShootVillainGun2.js";
import shootHeroGunTwo from "./ServiceShootHeroGun2.js";
import healHero from "./ServiceHealHero.js";
import healVillain from "./ServiceHealVillain.js";
import armour from "./ServiceArmour.js";

function App() {
  const [error, setError] = useState();
  const [heroHealth, setHeroHealth] = useState()
  const [villainHealth, setVillainHealth] = useState()

  const handleClickHero = async()=>{
    console.log("clicked")
    shootHero(()=>{}, ()=>{});


    const resolve = (heroHealth) => setHeroHealth(heroHealth);
    const reject = (error) => setError(error);
    files(resolve, reject);
    
  }

  const handleClickHero2 = async()=>{
    shootHeroGunTwo(()=>{},()=>{})
    const resolve = (heroHealth) => setHeroHealth(heroHealth);
    const reject = (error) => setError(error);
    files(resolve, reject);

  }

  const handleClickHealHero = async()=>{
    healHero(()=>{}, ()=>{})
    const resolve = (heroHealth) => setHeroHealth(heroHealth);
    const reject = (error) => setError(error);
    files(resolve, reject);

  }


  const handleClickVillain = async()=>{
    console.log("clicked")
    shootVillain(()=>{}, ()=>{});

    const resolve2 = (villainHealth) => setVillainHealth(villainHealth);
    const reject2 = (error) => setError(error);
    files2(resolve2, reject2);

    
  }

  const handleClickVillain2 = async()=>{
    shootVillainGunTwo(()=>{},()=>{})
    const resolve2 = (villainHealth) => setVillainHealth(villainHealth);
    const reject2 = (error) => setError(error);
    files2(resolve2, reject2);

  }

  const handleClickHealVillain = async()=>{
    healVillain(()=>{}, ()=>{})
    const resolve2 = (villainHealth) => setVillainHealth(villainHealth);
    const reject2 = (error) => setError(error);
    files2(resolve2, reject2);

  }

  const handleClickSetArmour = async()=>{
    armour(()=>{}, ()=>{})
    const resolve2 = (villainHealth) => setVillainHealth(villainHealth);
    const reject2 = (error) => setError(error);
    files2(resolve2, reject2);

  }

  useEffect(() => {
    const resolve = (heroHealth) => setHeroHealth(heroHealth);
    const reject = (error) => setError(error);
    files(resolve, reject);
  }, []);

  useEffect(() => {
    const resolve2 = (villainHealth) => setVillainHealth(villainHealth);
    const reject2 = (error) => setError(error);
    files2(resolve2, reject2);
  }, []);




  return (
    <div>
      <h2>Hero</h2>
      <h3>Hero Health:{heroHealth}</h3>
      <button onClick={handleClickVillain}>Shoot Villain using Weapon One</button>
      <button onClick={handleClickVillain2}>Shoot Villain using Weapon Two</button>
      <button onClick={handleClickHealHero}>Heal Hero</button>

      <h2>Villain</h2>
      <h3>Villain Health:{villainHealth}</h3>
      <button onClick={handleClickHero}>Shoot Hero using Weapon One</button>
      <button onClick={handleClickHero2}>Shoot Hero using Weapon Two</button>
      <button onClick={handleClickHealVillain}>Heal Villain</button>
      <button onClick={handleClickSetArmour}>Armour</button>
      
      


    </div>
  );
}

export default App;

import './App.css';
import { useState, useEffect } from 'react';

import Deck from './Deck.js'
import Shop from './Shop.js'
import Recursos from './Recursos.js'
import Acoes from './Acoes.js'

function Game() {
  return (
    <section>
    <img
      src="https://i.imgur.com/MK3eW3As.jpg"
      alt="Katherine Johnson"
    />    
    <Recursos/>
    <Shop/>
    <Deck/>
    <Acoes/>
    </section>
  );
}

export default function Shabumbas() {
const [data, setData] = useState(null);
useEffect(() => {
  fetch('/game')
    .then(response => response.json())
    .then(json => setData(json))
    .catch(error => console.error(error));
}, []);

  
return (
  <section>
    <h1>Amazing scientists</h1>
    <Game />
    <Game />
    <Game />
      <div>
    {data ? <pre>{JSON.stringify(data, null, 2)}</pre> : 'Loading...'}
  </div>
</section>
);
}

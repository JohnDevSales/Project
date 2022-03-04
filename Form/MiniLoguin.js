import React from 'react';
import Header from './Header';
import Footer from './Footer';
import Form from './Form/Form';

const Teste = () => {
  const active = true;
  if (active) {
    return <p>Ativo</p>;
  } else {
    return null;
  }
};


const App = () => {
  return (
    <React.Fragment>
      <Header />
      <Form />
      <Footer />
    </React.Fragment>
  );
};


export default App;
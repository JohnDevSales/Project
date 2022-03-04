import React from 'react';
import Button from './Button';
import Input from './Input';

const Forms = () => {
  return <div>
      <Input id="email" label="Email" required />
      <Input id="password" type="password" label="Password"/>
      <Button />
  </div>;
};

export default Forms;

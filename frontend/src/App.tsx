import { Button } from "@/components/ui/button";
import { Input } from "./components/ui/input";


import React from 'react'

const App = () => {
  return (
    <div>
      <h1 className="text-6xl text-green-300 h">hello</h1>
      <input className="border border-gray-300 p-2" placeholder="Test Input" />
      <button className="mt-2 bg-blue-500 text-white p-2 rounded">
        Test Button
      </button>
      <Input placeholder="Test Input" />
      <Button>Submit</Button>
    </div>
  )
}

export default App
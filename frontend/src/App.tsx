import { Button } from "@/components/ui/button";
import { Input } from "./components/ui/input";
import {
  createBrowserRouter,
  RouterProvider,
} from "react-router-dom";
import Error from '@/components/Error';

import React from 'react'
import Home from "./pages/home/Home";
import Login from "./pages/auth/Login";

const App = () => {
  const router = createBrowserRouter([
    {
      path: "/",
      element: <Home />,
      errorElement: <Error />,
      // children: [
      //   {
      //     path: "contacts/:contactId",
      //     element: <Contact />,
      //   },
      // ],
    },
    {
      path: "/login",
      element: <Login />,
      errorElement: <Error />
    }
  ]);


  return (
    <div>
      <RouterProvider router={router} />
    </div>
  )
}

export default App
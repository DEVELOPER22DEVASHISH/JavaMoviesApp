
import React from 'react';
// to generate boilerplate for layout
import { Outlet } from 'react-router-dom'

const Layout = () => {
    return (
        <main>
            <Outlet />

        </main>
    )
}

export default Layout


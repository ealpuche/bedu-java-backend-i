// src/App.js
import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import TaskList from './components/TaskList';
import TaskForm from './components/TaskForm';

function App() {
    return (
        <Router>
            <Routes>
                <Route path="/" element={<TaskList />} />
                <Route path="/edit/:taskId" element={<TaskForm />} />
                <Route path="/add" element={<TaskForm />} />
            </Routes>
        </Router>
    );
}

export default App;

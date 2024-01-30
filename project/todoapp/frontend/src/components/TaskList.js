// src/components/TaskList.js
import React, { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import { getTasks, deleteTask, saveTask } from '../services/taskService';
import './TaskList.css'; // Asegúrate de que este import esté correcto

function TaskList() {
    const [tasks, setTasks] = useState([]);

    useEffect(() => {
        loadTasks();
    }, []);

    const loadTasks = async () => {
        const { data } = await getTasks();
        setTasks(data);
    };

    const handleDelete = async (taskId) => {
        await deleteTask(taskId);
        loadTasks(); // Recargar las tareas después de eliminar
    };

    const toggleCompleted = async (task) => {
        const updatedTask = { ...task, completed: !task.completed };
        await saveTask(updatedTask);
        loadTasks(); // Recargar las tareas para reflejar el cambio
    };

    return (
        <div className="taskListContainer">
            <h2>Task Summary</h2>
            <Link to="/add" className="addTaskButton">Add Task</Link>
            <div className="taskList">
                {tasks.map(task => (
                    <div key={task.id} className={`taskItem ${task.completed ? 'completed' : ''}`}>
                        <input type="checkbox" checked={task.completed} onChange={() => toggleCompleted(task)} />
                        <div className="taskDetails">
                            <span className="title">{task.title}</span>
                            <p className="description">{task.description}</p>
                        </div>
                        <div className="taskActions">
                            <button onClick={() => handleDelete(task.id)} className="deleteButton">Delete</button>
                            <Link to={`/edit/${task.id}`} className="editButton">Edit</Link>
                        </div>
                    </div>
                ))}
            </div>
        </div>
    );
}

export default TaskList;

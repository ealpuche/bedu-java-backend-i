// src/components/TaskForm.js
import React, { useState, useEffect } from 'react';
import { useNavigate, useParams } from 'react-router-dom';
import { getTask, saveTask } from '../services/taskService';
import './TaskForm.css'; // Asegúrate de que este import esté correcto

function TaskForm() {
    const [task, setTask] = useState({ title: '', description: '', dueDate: '', completed: false });
    const { taskId } = useParams();
    const navigate = useNavigate();

    useEffect(() => {
        if (taskId) {
            loadTask();
        }
    }, [taskId]);

    const loadTask = async () => {
        const { data } = await getTask(taskId);
        setTask(data);
    };

    const handleChange = ({ target: { name, value, checked, type } }) => {
        const val = type === 'checkbox' ? checked : value;
        setTask(prev => ({ ...prev, [name]: val }));
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        await saveTask(task);
        navigate('/');
    };

    return (
        <div className="taskForm">
            <form onSubmit={handleSubmit}>
                <label>
                    Title:
                    <input name="title" value={task.title} onChange={handleChange} required />
                </label>
                <label>
                    Description:
                    <textarea name="description" value={task.description} onChange={handleChange} required />
                </label>
                <label>
                    Due Date:
                    <input type="date" name="dueDate" value={task.dueDate} onChange={handleChange} required />
                </label>
                <label>
                    Completed:
                    <input type="checkbox" name="completed" checked={task.completed} onChange={handleChange} />
                </label>
                <button type="submit" className="saveButton">Save</button>
                <button type="button" onClick={() => navigate('/')} className="backButton">Back</button>
            </form>
        </div>
    );
}

export default TaskForm;

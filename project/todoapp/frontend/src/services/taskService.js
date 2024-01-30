// src/services/taskService.js
import axios from 'axios';

const API_URL = 'http://localhost:8080/api/v1/tasks/';

export const getTasks = () => axios.get(API_URL);
export const getTask = (taskId) => axios.get(`${API_URL}${taskId}`);
export const saveTask = (task) => {
    if (task.id) {
        return axios.put(`${API_URL}${task.id}`, task);
    } else {
        return axios.post(API_URL, task);
    }
};
export const deleteTask = (taskId) => axios.delete(`${API_URL}${taskId}`);

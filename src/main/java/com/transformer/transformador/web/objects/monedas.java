package com.transformer.transformador.web.objects;

public class monedas {
    String task;

    public monedas(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
    //funcion override para retornar la tarea
    @Override
    public String toString() {
        return this.task;
    }
}

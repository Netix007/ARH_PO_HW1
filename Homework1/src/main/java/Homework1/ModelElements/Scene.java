package Homework1.ModelElements;

import java.util.Collection;

public class Scene {

    static int counter = 0;

    private int id;
    private Collection<PoligonalModel> models;
    private Collection<Flash> flashes;
    private Collection<Camera> cameras;

    public int getId() {
        return id;
    }

    public Collection<PoligonalModel> getModels() {
        return models;
    }

    public Collection<Flash> getFlashes() {
        return flashes;
    }

    public Collection<Camera> getCameras() {
        return cameras;
    }

    {
        id = ++counter;
    }

    public Scene(Collection<PoligonalModel> models, Collection<Flash> flashes, Collection<Camera> cameras) {
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public Scene(Collection<PoligonalModel> models, Collection<Camera> cameras) {
        this.models = models;
        this.cameras = cameras;
    }

    public int method1(int var) {
        //TODO: Что-то делается...
        int result = 0;
        return result;
    }

    public int method2(int var1, int var2) {
        //TODO: Что-то делается...
        int result = 0;
        return result;
    }

}

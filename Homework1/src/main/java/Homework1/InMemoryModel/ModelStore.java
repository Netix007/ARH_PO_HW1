package Homework1.InMemoryModel;

import Homework1.ModelElements.Camera;
import Homework1.ModelElements.Flash;
import Homework1.ModelElements.PoligonalModel;
import Homework1.ModelElements.Scene;

import java.util.ArrayList;
import java.util.Collection;

public class ModelStore implements IModelChanger{

    private Collection<PoligonalModel> models;
    private Collection<Scene> scenes;
    private Collection<Flash> flashes;
    private Collection<Camera> cameras;
    private Collection<IModelChangedObserver> changedObservers = new ArrayList<>();

    public Collection<PoligonalModel> getModels() {
        return models;
    }

    public Collection<Scene> getScenes() {
        return scenes;
    }

    public Collection<Flash> getFlashes() {
        return flashes;
    }

    public Collection<Camera> getCameras() {
        return cameras;
    }

    public ModelStore(Collection<PoligonalModel> models, Collection<Scene> scenes, Collection<Flash> flashes, Collection<Camera> cameras) {
        this.models = models;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    @Override
    public void RegisterModelChanger(IModelChangedObserver o) {
        changedObservers.add(o);
    }

    @Override
    public void RemoveModelChanger(IModelChangedObserver o) {
        changedObservers.remove(o);
    }

    @Override
    public void NotifyChange() {
        for (IModelChangedObserver o: changedObservers)
        {
            o.ApplyUpdateModel();
        }
    }

    public Scene GetScena(int number){
        //какая-то функция
        Scene result = null;
        return result;
    }

}

package Homework1.InMemoryModel;

public interface IModelChanger {

    void RegisterModelChanger(IModelChangedObserver o);
    void RemoveModelChanger(IModelChangedObserver o);
    void NotifyChange();


}

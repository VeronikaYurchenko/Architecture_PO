package InMemoryModel;

import java.util.ArrayList;
import java.util.List;
import ModelElements.*;

public class ModelStore implements IModelChanger{
    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private IModelChangedObserver[] changeObservers;

    public ModelStore(IModelChangedObserver[] changeObservers) throws Exception {
        this.changeObservers = changeObservers;
        this.Models = new ArrayList<>();
        this.Scenes = new ArrayList<>();
        this.Flashes = new ArrayList<>();
        this.Cameras = new ArrayList<>();

        List<Texture> Textures = new ArrayList<>();
        this.Models.add(new PoligonalModel(Textures));

        this.Flashes.add(new Flash());
        this.Cameras.add(new Camera());

        this.Scenes.add(new Scene(0, Models, Flashes, Cameras));

    }
    public Scene GetScene(int ID) {
        for (int i = 0; i < Scenes.size(); i++) {
            if (Scenes.get(i).id == ID) {
                return Scenes.get(i);
            }

        }
        return null;
    }

    @Override
    public void NotifyChange(IModelChanger sender) {

    }



}
import java.util.ArrayList;

public class Photographer{

  private String name;
  private ArrayList<Camera> cameras;

  public Photographer(String name){
    this.name = name;
    this.cameras = new ArrayList<Camera>();
  }


public String getName() {
  return this.name;
}

public int equipmentCount(){
  return this.cameras.size();
}

public void addCamera(Camera camera){
  this.cameras.add(camera);
}

public void removeCamera(){
  if(equipmentCount() > 0) {
    this.cameras.remove(0);
  
}
}
}
import java.util.ArrayList;

public class Photographer{

  private String name;
  private ArrayList<Printable> cameras;

  public Photographer(String name){
    this.name = name;
    this.cameras = new ArrayList<Printable>();
  }


public String getName() {
  return this.name;
}

public int equipmentCount(){
  return this.cameras.size();
}

public void addCamera(Printable camera){
  this.cameras.add(camera);
}

public void removeCamera(){
  if(equipmentCount() > 0) {
    this.cameras.remove(0);
  
}
}
public void allCameraDetails(){
  String allDetails = "";
  for (Printable camera : this.cameras){
    allDetails += camera.printDetails();
  }
return allDetails;
}

}
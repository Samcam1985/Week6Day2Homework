import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  Camera camera;
  DigitalCamera digitalCamera;
  AnalogCamera analogCamera;


@Before
public void before() {
photographer = new Photographer("Sam");
camera = new Camera();
digitalCamera = new DigitalCamera();
analogCamera = new AnalogCamera();

}

@Test
public void hasName(){
  assertEquals("Sam", photographer.getName());
}

@Test
public void camerasStartsEmpty(){
  assertEquals(0, photographer.equipmentCount());
}

@Test
public void canAddCamera(){
  photographer.addCamera(camera);
  assertEquals(1, photographer.equipmentCount());
}

@Test
public void canRemoveCamera(){
  photographer.addCamera(camera);
  photographer.removeCamera();
  assertEquals(0, photographer.equipmentCount());
}

@Test
public void canGetAllCameraDetails(){
  photographer.addCamera(digitalCamera);
  photographer.addCamera(analogCamera);
  cameraDetails = "Nikon Coolpix, L340, Zoom, Black Nikon EM, 400px, Black";
  assertEquals(cameraDetails, photographer.allCameraDetails);
}
}


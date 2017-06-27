import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  Camera camera;


@Before
public void before() {
photographer = new Photographer("Sam");
camera = new Camera();

}

@Test
public void hasName(){
  assertEquals("Sam", photographer.getName());
}

@Test
public void camerasStartsEmpty(){
  assertEquals(0, photographer.equipmentCount());
}
}
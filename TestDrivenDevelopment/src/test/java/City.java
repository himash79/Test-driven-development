import lk.himash.controller.CityController;
import org.junit.Assert;
import org.junit.Test;

public class City {

    @Test //RED
    public void getCityDetails_test() {
        int id = 1;
        String expectedOP = "colombo";
        CityController cc = new CityController();
        String realOP = cc.getCityDetails(id);
        Assert.assertEquals(expectedOP,realOP);

    }

    @Test(expected = NullPointerException.class) //GREEN
    public void getCityDetails_test_error() {
        int id = 0;
        String expectedOP = "colombo";
        CityController cc = new CityController();
        String realOP = cc.getCityDetails(id);
        Assert.assertEquals(expectedOP,realOP);

    }
}

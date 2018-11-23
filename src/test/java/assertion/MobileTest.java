package assertion;

import org.junit.jupiter.api.Test;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class MobileTest {

    @Test
    void should_mobile_return_its_name() {
        Mobile mobile = new Mobile("My Small Phone");

        assertEquals("My Small Phone", mobile.getName());
    }

    @Test
    void should_mobile_return_its_false_when_new_initial() {

        Mobile mobile = new Mobile("My Small Phone");
        assertFalse(mobile.getStatus());
    }

    @Test
    void should_mobile_return_its_true_when_switch_on() {

        Mobile mobile = new Mobile("My Small Phone");
        mobile.switchOn();
        assertTrue(mobile.getStatus());
    }

    @Test
    void should_throw_exception_when_call_charging() {

        Mobile mobile = new Mobile("My Small Phone");

        assertThrows(NoSuchAlgorithmException.class, () -> {
            mobile.charging();
        });
    }

    @Test
    void should_get_all_app_when_call_get_apps() {
        // given
        Mobile mobile = new Mobile("My Small Phone");
        mobile.installApp("Wechat");
        mobile.installApp("Facebook");
        mobile.installApp("Youtube");

        List<String> expectedApps = Arrays.asList("Wechat", "Facebook", "Youtube");
        // when
        List<String> apps = mobile.getAllApps();

        //then
        assertArrayEquals(expectedApps.toArray(), apps.toArray());


    }
}
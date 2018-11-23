package assertion;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class Mobile {
    private final String name;
    private boolean ststus;
    private List<String> apps = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public Mobile(String name) {
        this.name = name;
        this.ststus = false;
    }

    public boolean getStatus() {
        return this.ststus;
    }

    public void switchOn() {
        this.ststus = true;
    }

    public void charging() throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException();

    }

    public void installApp(String appName) {

        this.apps.add(appName);
    }

    public List<String> getAllApps() {
        return this.apps;
    }
}

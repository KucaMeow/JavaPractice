package fifthlesson.factory;

import fifthlesson.webs.SlowWeb;
import fifthlesson.webs.Web;
import fifthlesson.bridge.LightTheme;
import fifthlesson.bridge.Theme;

public class OldWebCreator implements Factory{
    @Override
    public Web createWeb() {
        Theme theme = new LightTheme();
        Web web = new SlowWeb(theme);
        web.showTheme();
        web.loadStructure();
        System.out.println("Slow web + light theme created");
        return web;
    }
}

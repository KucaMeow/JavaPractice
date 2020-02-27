package fifthlesson.factory;

import fifthlesson.webs.StupidWeb;
import fifthlesson.webs.Web;
import fifthlesson.bridge.StrangeTheme;
import fifthlesson.bridge.Theme;

public class StrangeWebCreator implements Factory {
    @Override
    public Web createWeb() {
        Theme theme = new StrangeTheme();
        Web web = new StupidWeb(theme);
        web.showTheme();
        web.loadStructure();
        System.out.println("Stupid web + strange theme created");
        return web;
    }
}

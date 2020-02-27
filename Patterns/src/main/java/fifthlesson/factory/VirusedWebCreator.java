package fifthlesson.factory;

import fifthlesson.webs.VirusedWeb;
import fifthlesson.webs.Web;
import fifthlesson.bridge.StrangeTheme;
import fifthlesson.bridge.Theme;

public class VirusedWebCreator implements Factory {
    @Override
    public Web createWeb() {
        Theme theme = new StrangeTheme();
        Web web = new VirusedWeb(theme);
        web.showTheme();
        web.loadStructure();
        System.out.println("Virused web + strange theme created");
        return web;
    }
}

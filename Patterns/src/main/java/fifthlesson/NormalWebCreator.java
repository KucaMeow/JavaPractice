package fifthlesson;

public class NormalWebCreator implements Factory {
    @Override
    public Web createWeb() {
        Theme theme = new DarkTheme();
        Web web = new Web(theme);
        web.showTheme();
        web.loadStructure();
        System.out.println("Normal web + dark theme created");
        return web;
    }
}

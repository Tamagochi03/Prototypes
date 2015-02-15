package holamundo3d;

public class HolaMundo3D {

    public static void main(String[] args) {
        LoadScene ls = new LoadScene("C:\\Users\\Shinsnake\\Documents\\NetBeansProjects\\HolaMundo3D\\src\\holamundo3d\\Rayman3.obj");
        ls.load();
        ls.listSceneNamedObjects();
        Mundo3D mundo = new Mundo3D(ls.getParte());
    }
}

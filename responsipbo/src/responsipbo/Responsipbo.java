package responsipbo;

public class Responsipbo {
    public static void main(String[] args) {
        ViewMovie vm = new ViewMovie();
        ModelMovie model = new ModelMovie();
        new ControllerMovie(model, vm);
    }
}

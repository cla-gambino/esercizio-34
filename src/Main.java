public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo(2.5, 3.4);
        Triangolo triangolo = new Triangolo(4,4);

        forma.calcolaArea();
        rettangolo.calcolaArea();
        triangolo.calcolaArea();
    }
}
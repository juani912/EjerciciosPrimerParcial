class Main {
    public static void main(String[] args) {
        Biblioteca bib = new Biblioteca();
        bib.genero = "Comedia";
        bib.autor = "Dante Alighieri";
        bib.año = 1909;
        bib.idLibro = 98798;
        bib.titulo = "La Divina Comedia";
        bib.mostrarAutor();
        bib.mostrarLibroGenero();

        Biblioteca bib1 = new Biblioteca();
        bib1.genero = "Terror";
        bib1.autor = "Stephen King";
        bib1.año = 1974;
        bib1.idLibro = 95654;
        bib1.titulo = "Carrie";
        bib1.mostrarAutor();
        bib1.mostrarLibroGenero();

        Biblioteca bib2 = new Biblioteca();
        bib2.genero = "Aventura";
        bib2.autor = "Daniel Defoe";
        bib2.año = 1719;
        bib2.idLibro = 85412;
        bib2.titulo = "Robinson Crusoe";
        bib2.mostrarAutor();
        bib2.mostrarLibroGenero();

        Biblioteca bib3 = new Biblioteca();
        bib3.genero = "Suspenso";
        bib3.autor = "John Katzenbach";
        bib3.año = 2002;
        bib3.idLibro = 745256;
        bib3.titulo = "El psicoanalista";
        bib3.mostrarAutor();
        bib3.mostrarLibroGenero();

        Biblioteca bib4 = new Biblioteca();
        bib4.genero = "Ficción";
        bib4.autor = "Frank Herbert";
        bib4.año = 1965;
        bib4.idLibro = 562148;
        bib4.titulo = "Dune";
        bib4.mostrarAutor();
        bib4.mostrarLibroGenero();

        Biblioteca bib5 = new Biblioteca();
        bib5.genero = "Fantástico";
        bib5.autor = "Elantris";
        bib5.año = 2005;
        bib5.idLibro = 963542;
        bib5.titulo = "Elantris";
        bib5.mostrarAutor();
        bib5.mostrarLibroGenero();


    }
}
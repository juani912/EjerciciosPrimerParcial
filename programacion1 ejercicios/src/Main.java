class Main {
    public static void main(String[] args) {
        Consecionaria con = new Consecionaria();
        con.idConsec = 98798;
        con.NombreConsec = "Manyar Ag";
        con.marca = "Volkswagen";
        con.modelo = "Polo";
        con.stockAutos = 2;
        con.mostrar();

        Consecionaria con1 = new Consecionaria();
        con1.idConsec = 87521;
        con1.NombreConsec = "Raibana";
        con1.marca = "BMW";
        con1.modelo = "X1";
        con1.stockAutos = 5;
        con1.mostrar();

        Consecionaria con2 = new Consecionaria();
        con2.idConsec = 45168;
        con2.NombreConsec = "Sukie";
        con2.marca = "Ferrari";
        con2.modelo = "Roma Spider";
        con2.stockAutos = 2;
        con2.mostrar();

        Consecionaria con3 = new Consecionaria();
        con3.idConsec = 42531;
        con3.NombreConsec = "Azul";
        con3.marca = "Chevrolet";
        con3.modelo = "Corsa";
        con3.stockAutos = 10;
        con3.mostrar();

        Consecionaria con4 = new Consecionaria();
        con4.idConsec = 52198;
        con4.NombreConsec = "Farosol";
        con4.marca = "Ford";
        con4.modelo = "Fiesta";
        con4.stockAutos = 5;
        con4.mostrar();

        int stock1 = 2;
        int stock2 = 5;
        int stock3 = 2;
        int stock4 = 10;
        int stock5 = 5;

        long suma = stock1 + stock2 + stock3 + stock4 + stock5;

        System.out.println("La suma entre el stock1 el stock2 el stock3 el stock4 y el stock5 es:" + suma);

        int numerototal = 24;

        long division = 24 / 12;

        System.out.println("Lo que tienen que vender las consecionarias en el año es:" + division);

        long resta = 24 - 4;

        System.out.println("Al restarle 4 a la cantidad total de autos el resutlado es:" + resta);
    }
}
class Main
{
    public static void main(String[] argv)
    {
        Fisier f1,f2,f3;
        f1 = new Fisier("Lab1", "Ana are mere");
        f1.salveazaVersiune();
        f1.salveazaVersiune();
        f2 = new Fisier("Lab2", "Si Robert are mere");
        f1.concateneaza(f2);
        f3 = new Fisier("Lab3", "Merele sunt bune");
        f1.concateneaza(f3);
        System.out.println(f1);
    }
}

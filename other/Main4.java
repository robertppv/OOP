class Main4{
    public static void main(String[] argv)
    {
        Tir t1, t2;
        t1 = new Tir();
        t2 = new Tir();
        Remorca r = new Remorca(25, "TM28ADA");
        t1.adaugaRemorca(10, "TM97MIH");
        t1.adaugaRemorca(15, "TM24TLB");
        t2.adaugaRemorca(r);
        System.out.println(t1.equals(t2));
    }
}

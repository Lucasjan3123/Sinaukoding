public abstract class segitiga {
    public abstract void luas();

    public abstract void keliling();

    void luasSegitiga(int sisi) {
        int k = sisi + sisi + sisi;
        System.out.println("Luas Segitiga :" + k);

    }

    void KelilingSegitiga(int a, int l) {
        int k = a * l / 2;
        System.out.println("Keliling segitiga :" + k);

    }

}
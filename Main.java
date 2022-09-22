
public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Persegi1 X = new Persegi1();
        X.LuasPersegi(5);
        X.KelilingPersegi(5);

        PersegiPanjangImplements Y = new PersegiPanjangImplements();
        Y.LuasPersegiPanjang(10, 5);
        Y.KelilingPersegiPanjang(10, 5);
        lingkaranabstrak p = new lingkaranabstrak();
        p.KelilingLingkaran(10);
        p.LuasLingkaran(10);
        segitigaabstract l = new segitigaabstract();
        l.luasSegitiga(5);
        l.KelilingSegitiga(5, 6);

    }

}
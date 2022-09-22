public class PersegiPanjangImplements implements PersegiPanjang {
    int Y;

    @Override
    public void LuasPersegiPanjang(int p, int l) {
        // TODO Auto-generated method stub
        Y = p * l;
        System.out.println("luas persegi panjang : " + Y);
    }

    @Override
    public void KelilingPersegiPanjang(int p, int l) {
        // TODO Auto-generated method stub
        Y = 2 * p * l;
        System.out.println("Keliling persegi panjang : " + Y);

    }
}
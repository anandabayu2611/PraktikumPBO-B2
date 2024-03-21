class Kubus implements IArea {
    private double sisi;

    public Kubus(double s) {
        sisi = s;
    }
    
    public double hitungLuas() {
        return 6 * (sisi * sisi);
    }
}

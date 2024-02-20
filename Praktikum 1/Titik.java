public class Titik {
    double absis;
    double ordinat;
    static double counterTitik;

    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double a, double b){
        absis = a;
        ordinat = b;
        counterTitik++;
    }

    void setAbsis(double a){
        absis = a;
    }

    void setOrdinat(double b){
        ordinat = b;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    static double getcounterTitik(){
        return counterTitik;
    }
}

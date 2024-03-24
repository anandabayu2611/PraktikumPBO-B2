package main;

import bukuFiksi.*;
import bukuNonFiksi.*;

public class Main {
    public static void main(String[] args) {
        bukuNovel BN = new bukuNovel("judul1", "penulis1", "2020", "aksi", 200, 200000);
        BN.view();

        bukuAkademik BA = new bukuAkademik("judul2", "penulis2", "2021", "Math", 100, 30000);
        BA.view();
    }
}

package pl.edu.wszib.podyplomowe;

import pl.edu.wszib.java.PackagePresenter;
import java.util.ArrayList;
import java.awt.*;
import java.util.jar.*;
import java.util.prefs.*;

public class PackageTester {
    public static void main(String[] args) {
        System.out.println("Pakiet: " + PackageTester.class.getPackageName());

        new Point();

        PackagePresenter javaPackagePresenter = new PackagePresenter();
        javaPackagePresenter.showPackage();

        pl.edu.wszib.podyplomowe.PackagePresenter podyplomowe = new pl.edu.wszib.podyplomowe.PackagePresenter(); //można tylko za pomocą nazwy kwalifikowanej, żeby nie było kolizji nazw
        podyplomowe.showPackage();


    }
}

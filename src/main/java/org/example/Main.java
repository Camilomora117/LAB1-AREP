package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
        URL newURl = new URL("https://campusvirtual.escuelaing.edu.co/moodle/mod/assign/view.php?id=31610");

        System.out.println("Protocol " + newURl.getPath());
        System.out.println("Authority " + newURl.getAuthority());
        System.out.println("Host " + newURl.getHost());
        System.out.println("File " + newURl.getFile());

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(newURl.openStream()))) {
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
            }
        } catch (IOException x) {
            System.err.println(x);
        }
    }

}
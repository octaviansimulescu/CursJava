package curs7;

public class Angajat {

    // daca variabila e private, clasa copil nu poate mosteni
    private String nume;
    private String email;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

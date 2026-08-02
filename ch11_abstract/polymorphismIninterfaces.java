package ch11_abstract;

interface Camera {
    void takePhoto();
}

class Phone implements Camera {

    public void takePhoto() {
        System.out.println("Phone Camera");
    }
}

class DSLR implements Camera {

    public void takePhoto() {
        System.out.println("DSLR Camera");
    }
}

public class polymorphismIninterfaces {

    public static void main(String[] args) {

        Camera c;

        c = new Phone();
        c.takePhoto();

        c = new DSLR();
        c.takePhoto();
    }
}

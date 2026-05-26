public class az_18_enhaneswitchcase {
    public static void main(String[] args) {
        String str="Shouvick";
        switch(str)
        {
            case "Manisha" -> System.out.println("Hello manisha");
            case "Ariyan" -> System.out.println("Hello Ariyan");
            case "Arpon" -> System.out.println("Hello Arpon");
            case "Shilajit" ->{
                System.out.println("Shut up");
                System.out.println("Shut up");
                System.out.println("Shut up");
                System.out.println("Shut up");
            }
            default -> System.out.println("Faaaaaah!!");

        }
    }
}

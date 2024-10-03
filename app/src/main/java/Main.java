import java.util.Scanner;

public class Main {
    public static double kmtom(double distance) {
        return distance * 1000;
    }

    public static double hourstoseconds(double time) {
        return time * 3600;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Alegeți datele cunoscute: ");
        System.out.println("1. Distanta si timpul");
        System.out.println("2. Distanta si viteza");
        System.out.println("3. Timpul si viteza");

        int optiune = scanner.nextInt();

        switch (optiune) {
            case 1:
                System.out.print("Introduceți distanta în kilometri: ");
                double kmetri = scanner.nextDouble();
                double metrirezultat = kmtom(kmetri);
                System.out.print("Introduceți durata în ore: ");
                double ore = scanner.nextDouble();
                double secunde = hourstoseconds(ore);
                double mpes = metrirezultat / secunde;
                double kmpeh = kmetri /ore;
                System.out.print("Viteza este de: " + kmpeh + " km/h.(" + mpes + " m/s");
                break;

            case 2:
                System.out.print("Introduceți distanta în kilometri: ");
                kmetri = scanner.nextDouble();
                //metrirezultat = kmtom(kmetri);
                System.out.print("Introduceți viteza în km/h: ");
                kmpeh = scanner.nextDouble();
                //viteza = kmpeh*1000/3600;
                //secunde = metrirezultat / mpes;
                //ore = secunde / 3600;
                ore = kmetri / kmpeh;
                secunde = ore*3600;
                System.out.print("Durata este de: " + ore + " ore.(" + secunde + " secunde)");
                break;

            case 3:
                System.out.print("Introduceți durata în ore: ");
                ore = scanner.nextDouble();
                secunde = hourstoseconds(ore);
                System.out.print("Introduceți viteza în km/h: ");
                kmpeh = scanner.nextDouble();
                //mpes = kmtom(kmpeh);
                mpes = kmpeh * 1000 / 3600;
                metrirezultat = mpes * secunde;
                double kmrezultat = metrirezultat / 1000;
                System.out.print("Distanta este de: " + kmrezultat + " km.(" + metrirezultat + " m)");
                break;

            default:
                System.out.println("Opțiune invalidă!");
                break;
        }
    }
}
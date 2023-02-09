package boxOyunu;

public class fight {
    int maxWeight;
    int minWeight;
    fighter f1;
    fighter f2;
    boolean control = true;
    fighter firstBoxor;
    fighter seconderBoxor;


    fight(int minWeight, int maxWeight, fighter f1, fighter f2) {

        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
        this.f1 = f1;
        this.f2 = f2;
        System.out.println("1.DOVUSCU: ");
        this.f1.infoFighter();
        System.out.println("2.DOVUSCU: ");
        this.f2.infoFighter();


    }


    void firstDamage(fighter f1, fighter f2) {

        double first = Math.random();
        if (first <= 0.5) {
            this.firstBoxor = f1;
            this.seconderBoxor = f2;
        } else {
            this.firstBoxor = f2;
            this.seconderBoxor = f1;

        }
    }

    void punching(fighter f1, fighter f2) {

        if (issblock(f1)) {
            f2.healt -= f1.damage;
            System.out.println(f1.name + f1.damage + "  vurdu\n " + f2.name + "in cani: " + f2.healt);
        } else System.out.println("\n" + f1.name + " bosa salladi. \n" + f2.name + "gelen hasari blokladi. ");

    }

    void start() {


        if ((this.f1.weight <= this.maxWeight && this.f1.weight >= this.minWeight) && (this.f2.weight <= this.maxWeight && this.f2.weight >= this.minWeight)) {

            firstDamage(this.f1, this.f2);
            System.out.println("!!!! DOVUS BASLADİ !!!!");
            int raund = 0;


            while (this.firstBoxor.healt > 0 && this.seconderBoxor.healt > 0) {



                if (this.control == true) {
                    punching(firstBoxor, seconderBoxor);
                    control = false;
                } else {
                    punching(seconderBoxor, firstBoxor);
                    control = true;
                    raund++;
                    System.out.println("***** " + raund + "RAUND BİTTİ. ***** \n");
                }


            }


            if (this.firstBoxor.healt <= 0) System.out.println("   WİNNER\n" + this.seconderBoxor.name);

            else System.out.println("   WİNNER\n" + this.firstBoxor.name);


        } else System.out.println("!!! \nDOVUSCULERİN SİKLETERİ UYUSMUYOR.");
    }

    boolean issblock(fighter f) {

        double chans = Math.random() * 100;
        if (chans <= f.dodge) return true;
        else return false;


    }


}

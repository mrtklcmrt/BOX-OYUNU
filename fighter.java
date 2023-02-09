package boxOyunu;

public class fighter {
    String name;
    int healt;
    int weight;
    int damage;
    int age;
    int dodge;


    fighter(String name, int healt, int damage, int weight, int age, int dodge) {
        this.name = name;
        this.healt = healt;
        this.damage = damage;
        this.weight = weight;
        this.age = age;

        if (dodge <= 100)this.dodge = dodge;
        else this.dodge = 0;
    }


    void infoFighter() {
        System.out.println("BOXOR İSMİ: " + this.name);
        System.out.println("BOXOR AGİRLİGİ: " + this.weight);
        System.out.println("YAS: " + this.age);
        System.out.println("******* \n");

    }
}

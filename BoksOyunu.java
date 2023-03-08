public class BoksOyunu {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A",40,120,80, 40);
        Fighter f2 = new Fighter("B",50,110,85, 50);
        Match match = new Match(80,90,f1,f2);
        match.run();
    }

}

class Fighter{
    int damage,health,weight,dodge;
    String name;

    Fighter(String name,int damage,int health,int weight,int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(Fighter foe){

        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu ");

        if (foe.isDodge()){
            System.out.println(foe.name + " Saldırıyı Blokladı");
            return foe.health;
        }

        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;

    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100;

        return randomNumber <= this.dodge;
    }

}

class Match{
    Fighter f1;
    Fighter f2;
    int minWeight,maxWeight;

    Match(int minWeight,int maxWeight,Fighter f1,Fighter f2){
        if (firstStart()) {
            this.f1 = f1;
            this.f2 = f2;
        } else {
            this.f1 = f2;
            this.f2 = f1;
        }
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run(){
        if (isCheck()){
            while(this.f1.health > 0 && this.f2.health > 0){

                System.out.println("---- YENİ ROUND ----");
                this.f2.health = this.f1.hit(this.f2);
                this.f1.health = this.f2.hit(this.f1);
                System.out.println("B Sağlık : " + this.f2.health);
                System.out.println("A Sağlık : " + this.f1.health);
                System.out.println("-----------------");

                if (this.f1.health == 0){
                    System.out.println("B KAZANDI!!");
                }else if(this.f2.health == 0) {
                    System.out.println("A KAZANDI!!");
                }

            }
        }else {
            System.out.println("Sikletler Uyuşmuyor!!");
        }
    }

    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean firstStart(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= 50;
    }

}
package qa.guru;

public class Cat {

    private String name;
    private int age;
    private static int countCats;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        countCats++;
    }

    public static int getCatNumber(){
        return countCats;
    }

    public void setGav(){
        System.out.println(name + " Gav...Gav..Gav");
    }

    public void runAway (){
        System.out.println(name + " run away");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}

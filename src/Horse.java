public class Horse {

    String name;
    int age;
    String gender;
    boolean hasFoal;
    Horse foal;



    public Horse(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void insertFoal(Horse objFoal){
        if (gender.equals("female")){
            foal = objFoal;
            hasFoal = true;
        }
        else {
            System.out.println("Horse is male and cannot have a foal.");
        }

    }

    public void nameOfFoal(){
        if(hasFoal == true){
            System.out.println("The name of the foal is " + foal.getName() + "!");
        }
        else {
            System.out.println("There is no foal.");
        }
    }

    //Getter und Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }



}

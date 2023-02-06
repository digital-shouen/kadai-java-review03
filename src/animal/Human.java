package animal;

public class Human extends Animal implements Thinkable {
    
    private String humanHobby; //趣味
    
    public Human() {
    }
    
    public Human(String animalName, int animalAge, String humanHobby) {
        super(animalName, animalAge);
        this.humanHobby = humanHobby;
    }
    
    public void think() {
        System.out.println("私は" + humanHobby + "について考えています。");
    }
    
    public String humanHobby() {
        return humanHobby;
    }
    
    public void setHumanHobby(String humanHobby) {
        this.humanHobby = humanHobby;
    }
    

}

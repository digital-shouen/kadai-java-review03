package animal;

public class Animal {
    
    //フィールド
    private String animalName; //名前
    private int animalAge; //年齢
    
    //コンストラクタ初期化
    public Animal() {
    }
    
    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }
    
    public String getAnimalName() {
        return animalName;
    }
    
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
    
    public int getAnimalAge() {
        return animalAge;
    }
    
    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }
    
    //sayメソッド
    public void say() {
        System.out.println(animalName + "です。" + animalAge + "歳です。");
    }

}

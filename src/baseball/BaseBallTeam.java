package baseball;

public class BaseBallTeam {
    private String name;
    private int win;
    private int lose;
    private int draw;
    
    public BaseBallTeam(String name, int win, int lose, int draw) {
        setName(name);
        setWin(win);
        setLose(lose);
        setDraw(draw);
    }
    
    String getName() {
        return name;
    }
    
    void setName(String name) {
        this.name = name;
    }
    
    int getWin() {
        return win;
    }
    
    void setWin(int win) {
        this.win = win;
    }
    
    int getLose() {
        return lose;
    }
    
    void setLose(int lose) {
        this.lose = lose;
    }
    
    int getDraw() {
        return draw;
    }
    
    void setDraw(int draw) {
        this.draw = draw;
    }
    
    double getRate() {
        return(double)getWin() / (getWin()+getLose());
    }
    
    public void report() {
        System.out.println(this.name +"の2022年の成績は" + this.win + "勝" + this.lose + "敗" + this.draw + "分、勝率は" + getRate() + "です。" );
    }
}
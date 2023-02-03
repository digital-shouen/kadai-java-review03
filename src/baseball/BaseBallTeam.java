package baseball;

public class BaseBallTeam {
    
    private String name;
    private int win;
    private int lose;
    private int draw;
    //private double report;

    public BaseBallTeam() {       
    }
   
    public BaseBallTeam(String name,int win,int lose,int draw,double report) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getWin() {
        return this.win;
    }
    
    public void setWin(int win) {
        this.win = win;
    }
    
    public int getLose() {
        return this.lose;
    }
    
    public void setLose(int lose) {
        this.lose = lose;
    }
    
    public int getDraw() {
        return this.draw;
    }
    
    public void setDraw(int draw) {
        this.draw = draw;
    }
    
    public double getReport() {
        return(double)this.win / (this.win + this.lose);
    }
}
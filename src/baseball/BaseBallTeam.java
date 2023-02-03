package baseball;

public class BaseBallTeam {
    
    private String name;
    private int win;
    private int lose;
    private int draw;
    private double report;

    public BaseBallTeam() {       
    }
   
    public BaseBallTeam(String name,int win, int lose, int draw, double report){
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
        this.report = report;
        }

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }

        public int getWin(){
            return win;
        }
        public void setWin(int win){
            this.win = win;
        }

        public int getLose(){
            return lose;
        }
        public void setLose(int lose){
             this.lose = lose;
        }

        public int getDraw(){
            return draw;
        }
        
        public void setDraw(int draw){
            //this.draw = draw;
        }
        
        public double getReport(){
            return report;
        }
        
        public double getRate(){
            double report = (win / (double)(win + lose));
            return report;
        }
        
        public void setRate(double report) {
            //retur.report = report;
        }

    }
package baseball;

public class Review03 {

    public static void main(String[] args) {
        
        BaseBallTeam team1 = new BaseBallTeam();
        team1.setName("東京ヤクルトスワローズ");
        team1.setWin(80);
        team1.setLose(59);
        team1.setDraw(4);
        
        String getName01 = team1.getName();
        int getWin01 = team1.getWin();
        int getLose01 = team1.getLose();
        int getDraw01 = team1.getDraw();
        double getRate01 = team1.getReport();
        System.out.println(getName01 + "の2022年の成績は" + getWin01 + "勝" + getLose01 + "負" + getDraw01 + "分" + "勝率" + getRate01 + "です。");
        
        BaseBallTeam team2 = new BaseBallTeam();
        team2.setName("横浜DeNAベイスターズ");
        team2.setWin(73);
        team2.setLose(68);
        team2.setDraw(2);
        
        String getName02 = team2.getName();
        int getWin02 = team2.getWin();
        int getLose02 = team2.getLose();
        int getDraw02 = team2.getDraw();
        double getRate02 = team2.getReport();
        System.out.println(getName02 + "の2022年の成績は" + getWin02 + "勝" + getLose02 + "負" + getDraw02 + "分" + "勝率" + getRate02 + "です。");
        
        BaseBallTeam team3 = new BaseBallTeam();
        team3.setName("阪神タイガース");
        team3.setWin(68);
        team3.setLose(71);
        team3.setDraw(4);
        
        String getName03 = team3.getName();
        int getWin03 = team3.getWin();
        int getLose03 = team3.getLose();
        int getDraw03 = team3.getDraw();
        double getRate03 = team3.getReport();
        System.out.println(getName03 + "の2022年の成績は" + getWin03 + "勝" + getLose03 + "負" + getDraw03 + "分" + "勝率" + getRate03 + "です。");

        BaseBallTeam team4 = new BaseBallTeam();
        team4.setName("読売ジャイアンツ");
        team4.setWin(68);
        team4.setLose(72);
        team4.setDraw(3);
        
        String getName04 = team4.getName();
        int getWin04 = team4.getWin();
        int getLose04 = team4.getLose();
        int getDraw04 = team4.getDraw();
        double getRate04 = team4.getReport();
        System.out.println(getName04 + "の2022年の成績は" + getWin04 + "勝" + getLose04 + "負" + getDraw04 + "分" + "勝率" + getRate04 + "です。");

        BaseBallTeam team5 = new BaseBallTeam();
        team5.setName("広島東洋カープ");
        team5.setWin(66);
        team5.setLose(74);
        team5.setDraw(3);
        
        String getName05 = team5.getName();
        int getWin05 = team5.getWin();
        int getLose05 = team5.getLose();
        int getDraw05 = team5.getDraw();
        double getRate05 = team5.getReport();
        System.out.println(getName05 + "の2022年の成績は" + getWin05 + "勝" + getLose05 + "負" + getDraw05 + "分" + "勝率" + getRate05 + "です。");
        
        BaseBallTeam team6 = new BaseBallTeam();
        team6.setName("中日ドラゴンズ");
        team6.setWin(66);
        team6.setLose(75);
        team6.setDraw(3);
        
        String getName06 = team6.getName();
        int getWin06 = team6.getWin();
        int getLose06 = team6.getLose();
        int getDraw06 = team6.getDraw();
        double getRate06 = team6.getReport();
        System.out.println(getName06 + "の2022年の成績は" + getWin06 + "勝" + getLose06 + "負" + getDraw06 + "分" + "勝率" + getRate06 + "です。");
        }
    }


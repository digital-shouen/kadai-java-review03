package baseball;

public class Review03 {

    public static void main(String[] args) {
        
        BaseBallTeam[] team = {
        new BaseBallTeam("東京ヤクルトスワローズ",80,59,4),
        new BaseBallTeam("横浜DeNAベイスターズ",73,68,2),
        new BaseBallTeam("阪神タイガース",68,71,4),
        new BaseBallTeam("読売ジャイアンツ",68,72,3),
        new BaseBallTeam("広島東洋カープ",66,74,3),
        new BaseBallTeam("中日ドラゴンズ",66,75,3),
        };
        
        for(int i = 0; i < team.length; i++) {
            team[i].report();
        }
        }
}


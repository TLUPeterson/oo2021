public class Main {
    public static void main(String[] args){
        Twitter tw = new Twitter("Twitter", "sinine", 10000);
        tw.SotsiaalmeediaKirjeldus();
        tw.publishTweet();

        Youtube yt = new Youtube("Youtube", "punane", 2000000);
        yt.SotsiaalmeediaKirjeldus();
        yt.publishVideo();
    }
}

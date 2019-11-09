import java.util.Scanner;

public class GiftboxCoverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double SideSize=Double.parseDouble(sc.nextLine());
        int sheets=Integer.parseInt(sc.nextLine());
        double ASheet=Double.parseDouble(sc.nextLine());

        double AreaBox=SideSize*SideSize*6;

        double thirdS=Math.floor(sheets/3);


        double sheetsArea = (sheets*ASheet) - (thirdS*ASheet*0.75);

        double percentage=sheetsArea/AreaBox;
        percentage*=100;

        System.out.printf("You can cover %.2f%% of the box.",percentage);
    }
}

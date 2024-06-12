public class AppSeries {
    public static void main(String[] args) {
        MaisDois dois = new MaisDois();
        MaisTres tres = new MaisTres();

        dois.setStart(1);
        tres.setStart(1);

        for(int i=0;i<5;i++){
            System.out.println("Serie MAISDOIS");
            System.out.println(dois.getNext());
        }
        System.out.println("");
        for(int i=0;i<5;i++){
            System.out.println("Serie MAISTRES");
            System.out.println(tres.getNext());
        }
        System.out.println("");

        
        dois.reset();
        tres.reset();

        for(int i=0;i<5;i++){
            System.out.println("Serie MAISDOIS");
            System.out.println(dois.getNext());
        }
        System.out.println("");
        for(int i=0;i<5;i++){
            System.out.println("Serie MAISTRES");
            System.out.println(tres.getNext());
        }
        System.out.println("");

        dois.setStart(100);
        tres.setStart(100);
        for(int i=0;i<5;i++){
            System.out.println("Serie MAISDOIS");
            System.out.println(dois.getNext());
        }
        System.out.println("");
        for(int i=0;i<5;i++){
            System.out.println("Serie MAISTRES");
            System.out.println(tres.getNext());
        }


    }
}

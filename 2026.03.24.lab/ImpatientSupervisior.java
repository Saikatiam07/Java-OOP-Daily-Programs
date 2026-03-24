class DataDownloader extends Thread{
  public void run() {
    while(true){
        try{
            System.out.println("Downloading chunk...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Download cancelled by user.Cleaning up resources...");;

        }
    }
    }
}
public class ImpatientSupervisior{
    public static void main(String[] args){
        DataDownloader downloader = new DataDownloader();
        downloader.start();
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        downloader.interrupt();
    }
}

/*
OUTPUT
Downloading chunk...
Downloading chunk...
Downloading chunk...
Download cancelled by user. Cleaning up resources...
*/


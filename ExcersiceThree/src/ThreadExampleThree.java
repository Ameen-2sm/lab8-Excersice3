
public class ThreadExampleThree {

    public static void main(String args[]) throws InterruptedException{
    
        ThreadUsingRunnableTwo runnableThread = new ThreadUsingRunnableTwo();
        
        Thread textThread = new Thread(runnableThread, "text");
        textThread.start();
        textThread.join();
       
        
        Thread textThreadOne = new Thread(runnableThread, "text1");
        textThreadOne.start();
        textThreadOne.join();
        
        
        Thread wordThread = new Thread(runnableThread, "word1");
        wordThread.start();
    
    
    
    }
    
    
    
}

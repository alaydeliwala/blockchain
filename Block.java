import java.util.Date;

public class Block {

    private String hash;
    private String previousHash;
    private String data;
    private long timeStamp;

    public Block(String data, String previousHash){
        this.previousHash = previousHash;
        this.data = data;
        this.timeStamp = new Date().getTime();
    }
}
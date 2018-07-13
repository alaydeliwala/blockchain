import java.util.Date;

/**
 * A plain java object representing a block in the chain
 */
public class Block {

    /** The hash of this block */
    public String hash;

    /** The hash of the previous block */
    public String previousHash;

    /** The information held in this block */
    private String data;

    /** The time when this block was made */
    private long timeStamp;

    /**
     * The constructor for the block class
     * 
     * @param data the data to initilize when the application has started
     */
    public Block(String data, String previousHash){
        this.previousHash = previousHash;
        this.data = data;
        this.timeStamp = new Date().getTime(); // Gets the current time
        this.hash = calculateHash(); // Calculates the hash for this block
    }

    /**
     * Calculates the hash of the current block
     * 
     * @return the hash of the current block
     */
    public String calculateHash(){
        return StringUtil.applySha256(previousHash  + Long.toString(timeStamp) + data);
    }
}
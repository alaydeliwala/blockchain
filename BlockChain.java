import java.util.ArrayList;
import com.google.gson.GsonBuilder;
/**
 * The main class for this blockchain program
 */
public class BlockChain {
	
	/** The actual block chain */
	public static ArrayList<Block> blockchain = new ArrayList<Block>();
	
	/** 
	 * The main method of the program
	 * @param args the user provided arguments
	 */
    public static void main(String[] args) {
		
//		Block genesisBlock = new Block("Hi im the first block", "0");
//		System.out.println("Hash for block 1 : " + genesisBlock.hash);
//		
//		Block secondBlock = new Block("Yo im the second block",genesisBlock.hash);
//		System.out.println("Hash for block 2 : " + secondBlock.hash);
//		
//		Block thirdBlock = new Block("Hey im the third block",secondBlock.hash);
//		System.out.println("Hash for block 3 : " + thirdBlock.hash);
    	
    	blockchain.add(new Block("First Block", "0"));
    	blockchain.add(new Block("Second block", blockchain.get(blockchain.size()-1).hash));
    	blockchain.add(new Block("Third block", blockchain.get(blockchain.size()-1).hash));
    	
    	String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);		
		System.out.println(blockchainJson);
    	
		
	}
}

/**
 * Created by Rafal Lewandowski on 16.11.2017.
 */

public class Blockchain {

    public static void main(String[] args) {

        String[] genesisTransaction = {"I sent to satoshi 10 bitcoin"};
        Block genesisBlock = new Block(0,genesisTransaction);

        String[] block2Transaction = {"Satoshi sent me back 10 bitcoin"};
        Block block2 = new Block(genesisBlock.getBlockHash(),block2Transaction);

        String[] block3Transaction = {"I sent 100 bitcoin to my dad"};
        Block block3 = new Block(block2.getBlockHash(),block3Transaction);

        System.out.println("Hash of genesis block");
        System.out.println(genesisBlock.getBlockHash());

        System.out.println("Hash of block2");
        System.out.println(block2.getBlockHash());

        System.out.println("Hash of block3");
        System.out.println(block3.getBlockHash());

    }
}

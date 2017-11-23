import java.util.Arrays;

/**
 * Created by Rafal Lewandowski on 15.11.2017.
 */

public class Block {

    private int previusHash;
    private String[] transactions;

    private int blockHash;

    public Block (int previusHash, String[] transactions) {
        this.previusHash = previusHash;
        this.transactions = transactions;

        Object[] contens = {Arrays.hashCode(transactions), previusHash};
        this.blockHash = Arrays.hashCode(contens);
    }

    public int getPreviusHash() {
        return previusHash;
    }

    public String[] getTransactions() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }
}

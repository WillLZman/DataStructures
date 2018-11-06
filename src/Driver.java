public class Driver {

    public static void main(String[] args) {
        Trie trie = new Trie();
        Trie.Node root = new Trie.Node();
        String keys[] = {"the", "a", "there", "answer", "any",
                "by", "bye", "their"};

        String output[] = {"Not present in trie", "Present in trie"};

        trie.setRoot(root);
        trie.generateTrie(keys,root);


        // Construct trie
        int i;
        for (i = 0; i < keys.length ; i++) {
            trie.insert(keys[i]);
        }
        // Search for different keys
        if(trie.search("the") == true)
            System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);

        if(trie.search("these") == true)
            System.out.println("these --- " + output[1]);
        else System.out.println("these --- " + output[0]);

        if(trie.search("their") == true)
            System.out.println("their --- " + output[1]);
        else System.out.println("their --- " + output[0]);

        if(trie.search("thaw") == true)
            System.out.println("thaw --- " + output[1]);
        else System.out.println("thaw --- " + output[0]);
    }
}

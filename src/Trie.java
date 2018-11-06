/**
 * this Trie is for any word insertion so size will always be 26
 */
public class Trie {
    private static Node root;
    static final int ALPHABET_SIZE=26;

    public static void setRoot(Node root) {
        Trie.root = root;
    }

    static class Node {
        Node[] children = new Node[ALPHABET_SIZE];
        private boolean isLeaf;

        Node(){
            isLeaf = false;
            for (int i=0;i<ALPHABET_SIZE;i++){
                children[i]=null;
            }
        }
    }

    public void insert(String word){
        int index;
        Node current = root;
        for (int i=0; i<word.length();i++){
            index = word.charAt(i) - 'a';
            if (current.children[index] == null){
                current.children[index] = new Node();

            }
            current = current.children[index];
            current.isLeaf = true;
        }
    }

    static boolean search(String word){
        int index;
        Node current = root;
        for (int i=0; i<word.length();i++){
            index = word.charAt(i) - 'a';
            if (current.children[index] == null){
               return false;

            }
            current = current.children[index];
    }
    return (current != null && current.isLeaf);
    }

    public void generateTrie(String[] words,Node node){
        root = new Node();
        for (int i = 0; i<words.length; i++){
            insert(words[i]);
        }
    }
}

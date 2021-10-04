// Java program to sort an array of strings using Trie

class SortTrie {
 
    // Alphabet size
    static final int MAX_CHAR = 26;
 
    // trie node
    static class Trie {
 
        // index is set when node is a leaf
        // node, otherwise -1;
        int index;
 
        Trie child[] = new Trie[MAX_CHAR];
 
        /*to make new trie*/
        Trie()
        {
 
            for (int i = 0; i < MAX_CHAR; i++)
                child[i] = null;
            index = -1;
        }
    }
 
    /* function to insert in trie */
    static void insert(Trie root, String str, int index)
    {
 
        Trie node = root;
 
        for (int i = 0; i < str.length(); i++) {
            /* taking ascii value to find index of
          child node */
            int ind = str.charAt(i) - 'a';
 
            /* making new path if not already */
            if (node.child[ind] == null)
                node.child[ind] = new Trie();
 
            // go to next node
            node = node.child[ind];
        }
 
        // Mark leaf (end of word) and store
        // index of word in arr[]
        node.index = index;
    }
 
    /* function for preorder traversal */
    static boolean preorder(Trie node, String arr[])
    {
 
        if (node == null) {
 
            return false;
        }
 
        for (int i = 0; i < MAX_CHAR; i++) {
 
            if (node.child[i] != null) {
 
                /* if leaf node then print key*/
                if (node.child[i].index != -1) {
 
                    System.out.print(
                        arr[node.child[i].index] + " ");
                }
 
                preorder(node.child[i], arr);
            }
        }
        return false;
    }
 
    static void printSorted(String arr[], int n)
    {
 
        Trie root = new Trie();
 
        // insert all keys of dictionary into trie
        for (int i = 0; i < n; ++i) {
 
            insert(root, arr[i], i);
        }
 
        // print keys in lexicographic order
        preorder(root, arr);
    }
 
    public static void main(String[] args)
    {
 
        String arr[] = { "abc", "xy", "bcd" };
 
        int n = arr.length;
 
        printSorted(arr, n);
    }
}
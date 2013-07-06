
package listas_ligadas_simples;

/**
 *
 * @author Eduardo Garcia
 */
public class IntSLLNode {
    public int info;
    public IntSLLNode next;
    
    
    public IntSLLNode(int i){
        this(i,null);
    }
    
    public IntSLLNode(int i,IntSLLNode n){
        info = i; next = n;
    }
}

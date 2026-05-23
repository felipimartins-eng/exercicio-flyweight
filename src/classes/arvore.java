package classes;

public class arvore {
    private arvData data;
    private int posX; // as posições da árvore são características que não podem ser compartilhadas
    private int posY;

    public arvore(int x, int y, arvData data) {
        this.posX = x;
        this.posY = y;
        this.data = data;
    }
}
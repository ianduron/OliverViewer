
/**
 * Draws a bigger image of my cat Oliver
 * 
 * @author Ian Duron
 */
public class OliverViewer
{
    public static void main(String[] args)
    {
        Picture Oliver = new Picture("oliver.jpg");
        Oliver.translate(150,100);
        Oliver.grow(100,86);
        Oliver.draw();

    }
}

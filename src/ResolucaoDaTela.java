import java.awt.*;

public class ResolucaoDaTela {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("Sua tela tem a resolução:");
        System.out.println(d.width +"x"+d.height );
    }
}

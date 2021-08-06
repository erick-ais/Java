package controle;

public class Continue {
    public static void main(String[] args) {

        // Uso do break:
        System.out.print("USO DO BREAK: ");
        for(int i = 1; i < 10; i++) {
            if(i % 2 == 0) {
                System.out.print(" " + i);
                if(i == 6) {
                    break;
                }
            }
        }

        // Uso do continue:
        System.out.print("\nUSO DO CONTINUE: ");
        for(int i = 1; i < 10; i++) {
            if(i % 2 == 0) {
                continue;
            }
            System.out.print(" " + i);
        }
    }
}

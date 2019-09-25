
    public class Main10 {
        public static void main(String[] args) {
            int n = 5;
            for (int i = 1; i <= n; i++) {
                String row = "";
                for (int j = 1; j <= n; j++) {
                    if (j  < i + 1) {
                        row += "* ";
                    } else {
                        row +=  " ";
                    }
                }
                System.out.print(row + "\n");
            }
        }
    }


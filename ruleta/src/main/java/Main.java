import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int n=ingresarEntero("ingrese el numero de fias");
        int m=ingresarEntero("ingresar el numero de columnas");
        int[][]matriz=new int[n][m];

        matriz=matrizllena(matriz);
        mostrarMensaje(matriz);
        int giros=ingresarEntero("ingrese el numero de giros");
        int[][]matrizgirada=girarmatriz(matriz,giros);
        mostrarMensaje(matrizgirada);
    }
    public static int ingresarEntero(String mensaje){
        Scanner scanner=new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextInt();
    }
    public static int[][] matrizllena(int[][]matriz){
        for (int i =0;i < matriz.length;i++){
            for(int j=0;j < matriz[i].length;j++){
                matriz[i][j]=ingresarEntero("ingrese el valor de la fila;("+i+")"+j+")");
            }
        }return matriz;
    }
    public static int[][]girarmatriz(int[][]matriz, int giros){
        int[][]resultado=matriz;

        while(giros>0){
            int n=resultado.length;
            int m=resultado[0].length;
            //mira resultado[0]mira la fila y saca la cantidad de columnas de esta fila
            int[][] nuevamatriz=new int[m][n];
            for (int i =0;i < n;i++){
                for (int j =0;j < m;j++){
                    nuevamatriz[j][n-1-i]=resultado[i][j];
                    //para encontar la fila y girarla a la derecha debmos buscar la posicion final e ingresar el resultado
                }

            }
            resultado=nuevamatriz;
            giros--;
        }


        return resultado;
    }
    public static void mostrarMensaje(int[][] matriz){
        for (int i =0;i < matriz.length;i++){
            for (int j =0;j < matriz.length;j++){
                System.out.print(matriz[i][j]);
                //para encontar la fila y girarla a la derecha debmos buscar la posicion final e ingresar el resultado
            }
            System.out.println("");
        }
    }


}


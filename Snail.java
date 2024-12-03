public class Snail {

    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[] x = snail(a);

        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }

    }

    public static int[] snail(int[][] array) {
        int[] desenrollado = new int[array.length * array[0].length];

        int limSup = 0;
        int limInf = array.length - 1;
        int limDer = array[0].length -1;
        int limIzq = 0;
        int contador = 0;


        while(contador<desenrollado.length){
            if(contador<desenrollado.length){
                for(int i=limIzq; i<=limDer; i++){
                    desenrollado[contador] = array[limSup][i];
                    contador++;
                }
                limSup++;
            }

            if(contador<desenrollado.length){
                for(int i=limSup; i<=limInf; i++){
                    desenrollado[contador] = array[i][limDer];
                    contador++;
                }
                limDer--;
            }

            if(contador<desenrollado.length){
                for(int i=limDer; i>=limIzq; i--){
                    desenrollado[contador] = array[limInf][i];
                    contador++;
                }
                limInf--;
            }



            if(contador<desenrollado.length){
                for(int i=limInf; i>=limSup; i--){
                    desenrollado[contador] = array[i][limIzq];
                    contador++;
                }
                limIzq++;
            }

        }

        return desenrollado;

    }
}

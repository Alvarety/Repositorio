public class Ejercicio1_ACR {
    public static void main(String[] args) {
        int[] lista = {3, 6, 8, 0, 4, 9, 9, 2};

        for (int i = 1; i < lista.length; i++){
            int clave = lista[i];
            int j = i - 1;
            while (j >= 0 && lista[j] < clave){
                lista[j + 1] = lista[j];
                j = j - 1;
            }
            lista[j + 1] = clave;
        }

        System.out.println("Lista ordenada de mayor a menor");
        for (int num: lista){
            System.out.println(num + " ");
        }
    }
}

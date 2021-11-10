
import java.util.*;

    public class lab {
        public static ArrayList append(ArrayList a, ArrayList b) {
            ArrayList c = new ArrayList();
            c.addAll(a);
            c.addAll(b);

            return c;

        }
        public static void main(String[] args) {

            ArrayList<Integer> lista = new ArrayList<Integer>();
            lista.add(1);
            lista.add(4);
            lista.add(9);
            lista.add(16);

            System.out.println("Pierwsza lista: "+ lista);


            ArrayList<Integer> lista2 = new ArrayList<Integer>();
            lista2.add(9);
            lista2.add(7);
            lista2.add(4);
            lista2.add(9);
            lista2.add(11);

            System.out.println("Druga lista:"+ lista2);

            ArrayList<Integer> lista3 = append(lista, lista2);
            System.out.println("Obie listy: "+ lista3);
            Collections.sort(lista3);
            System.out.println("Posortowana:"+ lista3);









        }
        public static ArrayList<Integer> merge(ArrayList<Integer> a,ArrayList<Integer>b){
            int dlugosc_a=a.size();
            int dlugosc_b=b.size();
            ArrayList<Integer> nowa = new ArrayList<>();
            int i=0;
            int j = Math.min(dlugosc_a, dlugosc_b);
            for(int k=0;k<j;k++){
                nowa.add(a.get(i));
                nowa.add(b.get(i));
                i++;
            }
            if(dlugosc_a<dlugosc_b){
                for(int k=0;k<Math.abs(dlugosc_a-dlugosc_b);k++){
                    nowa.add(b.get(i+k));
                }
            }
            else{
                for(int k=0;k<Math.abs(dlugosc_a-dlugosc_b);k++){
                    nowa.add(a.get(i+k));
                }
            }
            return nowa;
            System.out.println(nowa);


        }
}

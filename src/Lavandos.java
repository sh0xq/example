public class Lavandos {
    public static void main(String[] args){
        int a1 = 1;
        int a2 = 1;
        int a3;
        System.out.print(a1+" "+a2+" ");
        for(int i = 3; i <= 11; i++){
            a3=a1+a2;
            System.out.print(a3+" ");
            a1=a2;
            a2=a3;
        }
        System.out.println();
    }
}
// git pill - принять все изменения с GitHub
// git add - добавить под управление Git(теперь Git видит наши файлы)
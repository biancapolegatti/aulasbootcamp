package generics;

public class MinhaClasse<T> { //usa o T porque vem de type
    T obj;

    public MinhaClasse(T obj){
        this.obj = obj;
    }

    public T getObj(){
        return obj;
    }

}

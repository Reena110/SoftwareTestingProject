package ex_31_Generics;

public class Lab238_Generics_class
{
    public static void main(String[] args) {

    }
    class Genericsclass<T>
    {
        private T data;
        public Genericsclass(T data)
        {
            this.data = data;
        }
        public T getData()
        {
            return this.data;
        }
    }
}

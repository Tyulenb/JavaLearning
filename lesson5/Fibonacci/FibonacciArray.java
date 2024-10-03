package lesson5.Fibonacci;

public class FibonacciArray {
    Fibonacci[] arr;

    public Long getElem(int n) {
        arr = new Fibonacci[n+2];
        arr[0] = new Fibonacci();
        arr[0].setElem(Long.valueOf(0));
        arr[1] = new Fibonacci();
        arr[1].setElem(Long.valueOf(1));
        for(int i = 2; i <= n; i++){
            arr[i] = arr[i-2].add(arr[i-1]);
        }
        return arr[n].getElem();
    }

    class Fibonacci {
        private Long elem;

        public void setElem(Long elem) {
            this.elem = elem;
        }

        public Long getElem() {
            return elem;
        }

        public Fibonacci add(Fibonacci f){
            Long elem = this.elem+f.elem;
            Fibonacci fibo = new Fibonacci();
            fibo.setElem(elem);
            return fibo;
        }
    }
}

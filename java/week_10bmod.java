class Multab extends Thread {
    int num;
    Multab(int num) {
        this.num = num;
    }
    
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(num + "*" + i + "=" + (num * i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
}

class week10bmod {
    public static void main(String[] args) {
        Multab t1 = new Multab(5);
        Multab t2 = new Multab(9);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}

